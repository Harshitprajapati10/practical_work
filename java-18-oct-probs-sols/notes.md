# Understanding Parent Reference to Child Object

## Basic Syntax
```java
Parent p = new Child();
p.show();
```

## How It Works

### 1. Object Creation
- When we write `Parent p = new Child();`:
  - A Child object is created in memory
  - The reference variable `p` is of type Parent
  - The Child object is assigned to the Parent reference

### 2. Method Call Resolution
When `p.show()` is called:
1. Java first looks at the reference type (Parent)
2. Then checks if the method exists in Parent class
3. At runtime, Java uses the actual object type (Child)
4. This is called **Runtime Polymorphism** or **Dynamic Method Dispatch**

### 3. Execution Order
```java
class Parent {
    void show() {
        System.out.println("Parent's show");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child's show");
    }
}
```
- Despite `p` being a Parent reference
- The Child's show() method will be executed
- This happens because method binding occurs at runtime

### 4. Key Points
1. Reference type determines which methods can be called
2. Actual object type determines which method implementation is used
3. This is a fundamental concept of polymorphism in OOP
4. Only overridden methods show this behavior
5. Private methods are not overridden

### 5. Benefits
- Enables polymorphic behavior
- Supports the "IS-A" relationship
- Allows for flexible code design
- Facilitates code reuse and maintenance

### 6. Limitations
- Can only access methods defined in Parent class
- Child-specific methods are not accessible through Parent reference
- Requires explicit casting to access Child-specific methods