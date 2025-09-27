// WAP  to crate singly LL with n nodes entered by user and display its element
// WAP to create singly LL with n nodes entered by user and delete a node with given key\



#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node* createNode(int data){
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

void displayLL(struct node* head){
    struct node* temp = head;
    if(temp == NULL){
        printf("Linked List is empty\n");
        return;
    }
    while(temp != NULL){
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

void deleteNode(struct node** head, int key){
    struct node* temp = *head, *prev = NULL;
    if(temp != NULL && temp->data == key){
        *head = temp->next; 
        free(temp); 
        printf("Node with data %d deleted\n", key);
        return;
    }
    while(temp != NULL && temp->data != key){
        /*
         * This code snippet is part of a singly linked list implementation in C.
         * 
         * The line `prev = temp;` is typically used during traversal or manipulation of the linked list.
         * Here, `prev` and `temp` are pointers to nodes of the linked list, usually defined as:
         * 
         *     struct node {
         *         int data;
         *         struct node* next;
         *     };
         * 
         * - `temp` is used to traverse the list, pointing to the current node.
         * - `prev` is used to keep track of the previous node during traversal.
         * 
         * The creation of a `struct node` object usually happens in a function responsible for inserting a new node,
         * such as `insertNode()` or `createNode()`. In such functions, memory is allocated for a new node using `malloc`,
         * and the node's data and next pointer are initialized.
         * 
         * Example of node creation:
         * 
         *     struct node* newNode = (struct node*)malloc(sizeof(struct node));
         *     newNode->data = value;
         *     newNode->next = NULL;
         * 
         * Common functions in a singly linked list implementation:
         * 
         * - `createNode(int value)`: Allocates and initializes a new node with the given value.
         * - `insertAtEnd(int value)`: Inserts a new node at the end of the list.
         * - `deleteNode(int value)`: Deletes the node with the specified value.
         * - `displayList()`: Prints all elements in the list.
         * 
         * The line `prev = temp;` is typically found in functions that traverse the list, such as deletion or searching,
         * to keep track of the previous node as you move through the list.
         */
        prev = temp;
        temp = temp->next;
    }
    if(temp == NULL) {
        printf("Node with data %d not found\n", key);
        return;
    }
    prev->next = temp->next;
    free(temp); 
    printf("Node with data %d deleted\n", key);
}

// WAP to perfrom traversal of sigly LL
void traverseLL(struct node* head){
    struct node* temp = head;
    while(temp != NULL){
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

int main(){
    struct node *head = NULL, *temp = NULL, *newNode = NULL;
    int n, data, i;
    printf("Enter the number of nodes: ");
    scanf("%d", &n);
    if(n==0){
        printf("No nodes to create.\n");
        return 0;
    }
    // create LL from user input
    for(i=0; i<n; i++){
        printf("Enter data for node %d: ", i+1);
        scanf("%d", &data);
        newNode = createNode(data);
        if(head == NULL){
            head = newNode;
            temp = head;
        } else {
            temp->next = newNode;
            temp = newNode;
        }
    }

    // DELETE node in LL
    /*
    displayLL(head);
    int key;
    printf("Enter the data of the node to be deleted: ");
    scanf("%d", &key);
    deleteNode(&head, key);
    displayLL(head);

    temp = head;
    struct node* nextNode;
    while(temp != NULL){
        nextNode = temp->next;
        free(temp);
        temp = nextNode;
    }
    */

    // traverse LL
    traverseLL(head);

    return 0;
}