from typing import Any, Generator, Iterable, Optional

# /workspaces/practical_work/saturday-27-sep/doublyLl.py


class Node:
    """Node for a doubly linked list."""
    __slots__ = ("data", "prev", "next")

    def __init__(self, data: Any):
        self.data: Any = data
        self.prev: Optional["Node"] = None
        self.next: Optional["Node"] = None

    def __repr__(self) -> str:
        return f"Node({self.data!r})"


class DoublyLinkedList:
    """Doubly linked list with insertion, deletion and traversal operations."""

    def __init__(self, items: Optional[Iterable[Any]] = None):
        self.head: Optional[Node] = None
        self.tail: Optional[Node] = None
        self._size = 0
        if items:
            for item in items:
                self.insert_tail(item)

    def __len__(self) -> int:
        return self._size

    def is_empty(self) -> bool:
        return self._size == 0

    def insert_head(self, data: Any) -> None:
        """Insert new node at the beginning."""
        node = Node(data)
        if self.head is None:
            self.head = self.tail = node
        else:
            node.next = self.head
            self.head.prev = node
            self.head = node
        self._size += 1

    def insert_tail(self, data: Any) -> None:
        """Insert new node at the end."""
        node = Node(data)
        if self.tail is None:
            self.head = self.tail = node
        else:
            node.prev = self.tail
            self.tail.next = node
            self.tail = node
        self._size += 1

    def insert_after(self, target: Any, data: Any) -> bool:
        """
        Insert `data` after the first node with value `target`.
        Returns True if inserted, False if target not found.
        """
        cur = self.head
        while cur:
            if cur.data == target:
                node = Node(data)
                node.prev = cur
                node.next = cur.next
                if cur.next:
                    cur.next.prev = node
                else:
                    # cur was tail
                    self.tail = node
                cur.next = node
                self._size += 1
                return True
            cur = cur.next
        return False

    def insert_at_pos(self, pos: int, data: Any) -> bool:
        """
        Insert `data` at index `pos` (0-based).
        If pos == size -> insert at tail.
        Returns True if inserted, False if pos out of range.
        """
        if pos < 0 or pos > self._size:
            return False
        if pos == 0:
            self.insert_head(data)
            return True
        if pos == self._size:
            self.insert_tail(data)
            return True
        # traverse to position
        cur = self.head
        for _ in range(pos - 1):
            cur = cur.next  # type: ignore
        node = Node(data)
        node.next = cur.next
        node.prev = cur
        if cur.next:
            cur.next.prev = node
        cur.next = node
        self._size += 1
        return True

    def delete_value(self, value: Any) -> bool:
        """
        Delete first node with matching value.
        Returns True if deleted, False if not found.
        """
        cur = self.head
        while cur:
            if cur.data == value:
                if cur.prev:
                    cur.prev.next = cur.next
                else:
                    # deleting head
                    self.head = cur.next
                if cur.next:
                    cur.next.prev = cur.prev
                else:
                    # deleting tail
                    self.tail = cur.prev
                self._size -= 1
                return True
            cur = cur.next
        return False

    def delete_at_pos(self, pos: int) -> bool:
        """
        Delete node at index pos (0-based).
        Returns True if deleted, False if pos out of range.
        """
        if pos < 0 or pos >= self._size:
            return False
        cur = self.head
        for _ in range(pos):
            cur = cur.next  # type: ignore
        if cur.prev:
            cur.prev.next = cur.next
        else:
            self.head = cur.next
        if cur.next:
            cur.next.prev = cur.prev
        else:
            self.tail = cur.prev
        self._size -= 1
        return True

    def traverse_forward(self) -> list:
        """Return list of elements from head to tail."""
        res = []
        cur = self.head
        while cur:
            res.append(cur.data)
            cur = cur.next
        return res

    def traverse_backward(self) -> list:
        """Return list of elements from tail to head."""
        res = []
        cur = self.tail
        while cur:
            res.append(cur.data)
            cur = cur.prev
        return res

    def __iter__(self) -> Generator[Any, None, None]:
        cur = self.head
        while cur:
            yield cur.data
            cur = cur.next

    def __repr__(self) -> str:
        return "DoublyLinkedList([" + ", ".join(repr(x) for x in self) + "])"


if __name__ == "__main__":
    # Quick demo / smoke test
    dll = DoublyLinkedList()
    dll.insert_head(10)
    dll.insert_tail(30)
    dll.insert_after(10, 20)
    dll.insert_at_pos(3, 40)  # append
    print("Forward:", dll.traverse_forward())   # [10, 20, 30, 40]
    print("Backward:", dll.traverse_backward()) # [40, 30, 20, 10]
    dll.delete_value(20)
    dll.delete_at_pos(2)  # deletes 40
    print("After deletions:", dll.traverse_forward())  # [10, 30]
    print("Size:", len(dll))