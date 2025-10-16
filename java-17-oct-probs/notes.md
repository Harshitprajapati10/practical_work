# 🧬 Inheritance in Object-Oriented Programming

## 📖 Definition
**Inheritance** lets a class (**child/subclass**) reuse fields and methods of another class (**parent/superclass**).  
It models an **“is-a” relationship** — for example:  
> 🐶 **Dog is an Animal**

---

## 🎯 Why Use It?

- ♻️ **Reuse code** (avoid duplication)  
- 🌍 **Model real-world relationships**  
- 🧩 **Enable polymorphism** (treat different subclasses through a common parent type)


# 🔑 Java Keywords You Must Know

## 🧩 1. `extends`
- **Meaning:** Subclassing from a class  
- **Use:** Enables a class to inherit fields and methods from a parent class (establishes an “is-a” relationship).

---

## 🧩 2. `implements`
- **Meaning:** A class implements an interface  
- **Use:** Allows a class to provide implementations for methods defined in an interface (supports multiple inheritance of type).

---

## 🧩 3. `super`
- **Meaning:** Refers to the parent class (constructor or method)  
- **Use:**  
  - Call the parent class constructor  
  - Access parent class methods or variables that are hidden by the subclass

---

## 🧩 4. `this`
- **Meaning:** Refers to the current object  
- **Use:**  
  - Distinguish instance variables from parameters  
  - Pass current object as argument  
  - Call another constructor in the same class (`this()`)

---

## 🧩 5. `abstract`
- **Meaning:** Defines a class or method without full implementation  
- **Use:**  
  - Create blueprint classes  
  - Enforce implementation in derived classes

---

## 🧩 6. `final`
- **Meaning:** Prevents extension (on class), overriding (on method), or reassignment (on variable)  
- **Use:**  
  - Make variables immutable  
  - Prevent inheritance or method overriding

---

## 🧩 7. Access Modifiers (`protected`, `public`, `private`, `default`)
- **Meaning:** Control visibility of classes, methods, and variables  
- **Use:**  
  - Encapsulate data  
  - Protect code from unintended access

| Modifier   | Visibility |
|------------|------------|
| `public`   | Everywhere |
| `protected`| Package + Subclasses |
| `private`  | Class only |
| default    | Package only |

---

## 🧩 8. `instanceof`
- **Meaning:** Check runtime type of an object  
- **Use:**  
  - Perform type checking before casting  
  - Avoid `ClassCastException` at runtime