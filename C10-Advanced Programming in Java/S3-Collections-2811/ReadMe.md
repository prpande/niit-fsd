<!-- omit in toc -->
# Store and Manipulate Objects Using Ordered Collections 28/11

Java, a versatile and widely used programming language, provides a robust framework for handling collections of objects through the Java Collections Framework. This framework is an essential part of Java development, offering a standardized way to work with collections, ranging from simple lists to complex data structures.

<!-- omit in toc -->
## Content

- [Understanding Collections](#understanding-collections)
- [The Java Collections Framework](#the-java-collections-framework)
  - [1. Collection Interface](#1-collection-interface)
  - [2. List Interface](#2-list-interface)
  - [3. Set Interface](#3-set-interface)
  - [4. Queue Interface](#4-queue-interface)
  - [5. Map Interface](#5-map-interface)
- [Techniques and Features](#techniques-and-features)
  - [1. Iteration](#1-iteration)
  - [2. Sorting](#2-sorting)
  - [3. Synchronization](#3-synchronization)
  - [4. Generics](#4-generics)
  - [5. Null Values](#5-null-values)
- [The List Interface](#the-list-interface)
  - [Commonly Used Methods of the List Interface](#commonly-used-methods-of-the-list-interface)
    - [1. Adding Elements](#1-adding-elements)
    - [2. Accessing Elements](#2-accessing-elements)
    - [3. Removing Elements](#3-removing-elements)
    - [4. Iterating Through the List](#4-iterating-through-the-list)
    - [5. Checking if an Element Exists](#5-checking-if-an-element-exists)
  - [Nuances and Features](#nuances-and-features)
    - [1. Duplicates](#1-duplicates)
    - [2. Null Elements](#2-null-elements)
    - [3. List Iterators](#3-list-iterators)
- [Generics](#generics)
  - [Key Concepts of Generics](#key-concepts-of-generics)
    - [1. Type Parameters](#1-type-parameters)
    - [2. Wildcards](#2-wildcards)
    - [3. Bounded Type Parameters](#3-bounded-type-parameters)
  - [Generics in Collections](#generics-in-collections)
    - [1. List Interface](#1-list-interface)
    - [2. Map Interface](#2-map-interface)
    - [3. Generic Methods](#3-generic-methods)
    - [4. Wildcards in Collections](#4-wildcards-in-collections)
  - [Nuances and Features](#nuances-and-features-1)
    - [1. Type Erasure](#1-type-erasure)
    - [2. Unbounded Wildcards](#2-unbounded-wildcards)
    - [3. Generic Constructors](#3-generic-constructors)
- [LinkedList](#linkedlist)
  - [Commonly Used Methods of LinkedList](#commonly-used-methods-of-linkedlist)
    - [1. Adding Elements](#1-adding-elements-1)
    - [2. Removing Elements](#2-removing-elements)
    - [3. Accessing Elements](#3-accessing-elements)
    - [4. Iterating Through the List](#4-iterating-through-the-list-1)
    - [5. Other Operations](#5-other-operations)
  - [Nuances and Features](#nuances-and-features-2)
    - [1. Performance Characteristics](#1-performance-characteristics)
    - [2. Memory Usage](#2-memory-usage)
    - [3. Doubly-Linked Structure](#3-doubly-linked-structure)
    - [4. List Iterators](#4-list-iterators)
- [Iterators in Collections](#iterators-in-collections)
  - [Basic Iterator Interface](#basic-iterator-interface)
  - [Enhanced for Loop](#enhanced-for-loop)
  - [Iterator Methods and Properties](#iterator-methods-and-properties)
    - [ListIterator Interface](#listiterator-interface)
    - [Iterable Interface](#iterable-interface)
    - [Spliterator Interface](#spliterator-interface)
  - [Nuances and Advanced Techniques](#nuances-and-advanced-techniques)
    - [Concurrent Modification Exception](#concurrent-modification-exception)
    - [Fail-Fast vs. Fail-Safe Iterators](#fail-fast-vs-fail-safe-iterators)
    - [forEach() Method](#foreach-method)
- [Storing user-defined Objects in Collections](#storing-user-defined-objects-in-collections)
  - [Creating User-Defined Objects](#creating-user-defined-objects)
  - [Using Lists](#using-lists)
  - [Using Sets](#using-sets)
  - [Using Maps](#using-maps)
  - [Equality and Hashing](#equality-and-hashing)
  - [Comparators for Sorting](#comparators-for-sorting)
  - [Iterating Through Collections](#iterating-through-collections)
    - [Using Enhanced for Loop](#using-enhanced-for-loop)
    - [Using Iterators](#using-iterators)
  - [Filtering Collections Using Stream API](#filtering-collections-using-stream-api)

## Understanding Collections

In Java, a collection is an object that represents a group of elements. These elements could be of any Java data type, and the collection framework provides interfaces and classes to manipulate these groups efficiently. Collections play a vital role in simplifying data management and improving code readability.

## The Java Collections Framework

The Java Collections Framework is a unified architecture that provides a set of interfaces and classes to represent and manipulate collections of objects. It includes fundamental interfaces like `Collection`, `List`, `Set`, `Queue`, and `Map`, along with their various implementations. Let's explore these interfaces and their features in detail.

### 1. Collection Interface

The `Collection` interface is at the top of the hierarchy. It defines the basic methods that all collections will have, such as `add()`, `remove()`, `contains()`, and `size()`. The interface is implemented by classes like `ArrayList`, `LinkedList`, and `HashSet`.

Example:

```java
Collection<String> myCollection = new ArrayList<>();
myCollection.add("Java");
myCollection.add("Collections");
System.out.println(myCollection); // Output: [Java, Collections]
```

### 2. List Interface

The `List` interface extends `Collection` and represents an ordered collection of elements. Lists allow duplicate elements, and elements can be accessed by their index. Common implementations include `ArrayList` and `LinkedList`.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add("Apple");
myList.add("Banana");
myList.add("Apple");
System.out.println(myList.get(1)); // Output: Banana
```

### 3. Set Interface

The `Set` interface represents a collection of unique elements. It does not allow duplicate elements. Common implementations include `HashSet` and `TreeSet`.

Example:

```java
Set<String> mySet = new HashSet<>();
mySet.add("Red");
mySet.add("Green");
mySet.add("Red"); // Duplicate element, not added
System.out.println(mySet); // Output: [Green, Red]
```

### 4. Queue Interface

The `Queue` interface represents a collection designed for holding elements prior to processing. Common implementations include `LinkedList` and `PriorityQueue`.

Example:

```java
Queue<String> myQueue = new LinkedList<>();
myQueue.add("Task 1");
myQueue.add("Task 2");
System.out.println(myQueue.poll()); // Output: Task 1
```

### 5. Map Interface

The `Map` interface represents a collection of key-value pairs. It does not extend `Collection`. Common implementations include `HashMap` and `TreeMap`.

Example:

```java
Map<Integer, String> myMap = new HashMap<>();
myMap.put(1, "One");
myMap.put(2, "Two");
System.out.println(myMap.get(1)); // Output: One
```

## Techniques and Features

### 1. Iteration

Collections support iteration through various means. The enhanced for loop is a common technique for traversing elements.

Example:

```java
List<String> myList = new ArrayList<>();
// Add elements to the list
for (String element : myList) {
    System.out.println(element);
}
```

### 2. Sorting

Many collection classes provide sorting capabilities. The `Collections.sort()` method can be used for sorting lists.

Example:

```java
List<Integer> numbers = new ArrayList<>();
// Add elements to the list
Collections.sort(numbers);
```

### 3. Synchronization

Some collection classes are synchronized, making them thread-safe. This is crucial for scenarios involving concurrent access.

Example:

```java
List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
```

### 4. Generics

The use of generics allows type-safe collections, enhancing code readability and reducing runtime errors.

Example:

```java
List<String> stringList = new ArrayList<>();
```

### 5. Null Values

Some collections, like `HashMap`, allow null values. Understanding this property is crucial when working with data that may have null elements.

Example:

```java
Map<String, String> myMap = new HashMap<>();
myMap.put("Key", null);
```

## The List Interface

The `List` interface in Java is a fundamental component of the Java Collections Framework, providing an ordered collection of elements with the ability to store duplicates. Understanding the intricacies of the `List` interface is crucial for effective data manipulation and retrieval.

The `List` interface extends the `Collection` interface and represents an ordered collection of elements. Elements can be accessed and retrieved based on their index, allowing for sequential processing. Several classes in the Java Collections Framework implement the `List` interface, such as `ArrayList`, `LinkedList`, and `Vector`.

### Commonly Used Methods of the List Interface

#### 1. Adding Elements

The `add()` method is used to add elements to a `List`. It can append elements to the end of the list or insert them at a specific position.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("List");
myList.add(1, "Introduction"); // Insert at index 1
System.out.println(myList); // Output: [Java, Introduction, List]
```

#### 2. Accessing Elements

Elements in a `List` can be accessed using their index. The `get()` method is employed for this purpose.

Example:

```java
List<String> myList = new ArrayList<>();
// Add elements to the list
myList.add("Apple");
myList.add("Banana");
System.out.println(myList.get(1)); // Output: Banana
```

#### 3. Removing Elements

The `remove()` method allows the removal of elements from a `List` based on their value or index.

Example:

```java
List<String> myList = new ArrayList<>();
// Add elements to the list
myList.add("Apple");
myList.add("Banana");
myList.remove("Apple"); // Remove by value
System.out.println(myList); // Output: [Banana]
```

#### 4. Iterating Through the List

Iteration over the elements of a `List` can be achieved using various techniques. The enhanced for loop is a commonly used approach.

Example:

```java
List<String> myList = new ArrayList<>();
// Add elements to the list
for (String fruit : myList) {
    System.out.println(fruit);
}
```

#### 5. Checking if an Element Exists

The `contains()` method checks whether a specific element is present in the `List`.

Example:

```java
List<String> myList = new ArrayList<>();
// Add elements to the list
myList.add("Java");
myList.add("List");
System.out.println(myList.contains("Java")); // Output: true
```

### Nuances and Features

#### 1. Duplicates

Unlike some other collection types, a `List` allows duplicate elements. This is useful when dealing with data where repetition is possible and meaningful.

Example:

```java
List<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(1); // Duplicate element
System.out.println(numbers); // Output: [1, 2, 1]
```

#### 2. Null Elements

A `List` can contain null elements, providing flexibility in handling data.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add(null);
myList.add("Java");
System.out.println(myList); // Output: [null, Java]
```

#### 3. List Iterators

The `List` interface provides list iterators that allow bidirectional traversal of the list.

Example:

```java
List<String> myList = new ArrayList<>();
// Add elements to the list
ListIterator<String> iterator = myList.listIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

## Generics

Generics in Java provide a powerful mechanism for creating flexible, type-safe classes and methods. This feature allows developers to write code that can work with different types, providing compile-time safety and eliminating the need for explicit type casting.

Generics introduce the concept of parameterized types, enabling developers to create classes, interfaces, and methods that operate on multiple types without sacrificing type safety. The primary benefit of generics is to detect and eliminate errors at compile time rather than runtime, promoting code reliability.

### Key Concepts of Generics

#### 1. Type Parameters

Type parameters are placeholders for types that will be specified when the generic class or method is used. They are enclosed in angle brackets (`<>`).

Example:

```java
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
```

#### 2. Wildcards

Wildcards allow the specification of unknown types. There are three types of wildcards: `?`, `? extends T`, and `? super T`.

Example:

```java
public static void printList(List<?> list) {
    for (Object item : list) {
        System.out.println(item);
    }
}
```

#### 3. Bounded Type Parameters

Bounded type parameters restrict the types that can be used as type arguments. This includes both upper bounds (`<T extends SomeType>`) and lower bounds (`<T super SomeType>`).

Example:

```java
public static <T extends Comparable<T>> T findMax(List<T> list) {
    // Implementation to find and return the maximum element in the list
}
```

### Generics in Collections

Generics play a pivotal role in the Java Collections Framework, providing type safety and reducing the need for explicit casting. Let's explore how generics are implemented in common collection interfaces and classes.

#### 1. List Interface

The `List` interface is generic and allows the specification of the type of elements it will contain.

Example:

```java
List<String> stringList = new ArrayList<>();
stringList.add("Java");
stringList.add("Generics");
```

#### 2. Map Interface

The `Map` interface uses generics for both key and value types.

Example:

```java
Map<String, Integer> wordCount = new HashMap<>();
wordCount.put("Java", 3);
wordCount.put("Generics", 2);
```

#### 3. Generic Methods

Generic methods allow the introduction of type parameters in methods, providing flexibility.

Example:

```java
public <T> T findMax(List<T> list) {
    // Implementation to find and return the maximum element in the list
}
```

#### 4. Wildcards in Collections

Wildcards can be used in method signatures to create more flexible and reusable code.

Example:

```java
public static void printList(List<?> list) {
    for (Object item : list) {
        System.out.println(item);
    }
}
```

### Nuances and Features

#### 1. Type Erasure

Generics in Java use type erasure, meaning that generic type information is removed at runtime. This has implications when working with reflection and certain runtime operations.

#### 2. Unbounded Wildcards

The unbounded wildcard (`?`) allows flexibility but limits the operations that can be performed on the elements.

Example:

```java
public static double sumOfList(List<?> list) {
    // Cannot add elements to the list
    // Implementation to calculate and return the sum of elements in the list
}
```

#### 3. Generic Constructors

Classes can have generic constructors, allowing the instantiation of objects with specific types.

Example:

```java
public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
```

## LinkedList

The `LinkedList` class in Java is a versatile implementation of the `List` interface, offering dynamic and efficient manipulation of elements through a doubly-linked list.

A `LinkedList` is a data structure that consists of a sequence of elements where each element points to the next and previous elements in the sequence. Unlike an `ArrayList`, a `LinkedList` does not store elements in contiguous memory locations. Instead, each element points to the next and previous elements, providing flexibility for dynamic operations.

### Commonly Used Methods of LinkedList

#### 1. Adding Elements

Elements can be added to a `LinkedList` using the `add()` method. It allows insertion at the beginning, end, or at a specific position in the list.

Example:

```java
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Java");
linkedList.addFirst("Introduction"); // Add at the beginning
linkedList.addLast("LinkedList"); // Add at the end
linkedList.add(1, "is"); // Add at a specific position
```

#### 2. Removing Elements

The `remove()` method is used to remove elements from a `LinkedList`. It can remove by value, index, or remove the first or last element.

Example:

```java
LinkedList<String> linkedList = new LinkedList<>();
// Add elements to the list
linkedList.remove("Introduction"); // Remove by value
linkedList.removeFirst(); // Remove the first element
linkedList.removeLast(); // Remove the last element
linkedList.remove(1); // Remove at a specific position
```

#### 3. Accessing Elements

Elements in a `LinkedList` can be accessed using the `get()` method, similar to other list implementations.

Example:

```java
LinkedList<String> linkedList = new LinkedList<>();
// Add elements to the list
String element = linkedList.get(1); // Access element at index 1
```

#### 4. Iterating Through the List

Iteration through a `LinkedList` can be done using an enhanced for loop or using an iterator.

Example:

```java
LinkedList<String> linkedList = new LinkedList<>();
// Add elements to the list
for (String element : linkedList) {
    System.out.println(element);
}

// Using an iterator
Iterator<String> iterator = linkedList.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

#### 5. Other Operations

LinkedList provides additional methods for specific operations, such as `poll()`, `peek()`, and `offer()` for queue operations.

Example:

```java
LinkedList<String> linkedList = new LinkedList<>();
linkedList.offer("Java");
linkedList.offer("LinkedList");
String head = linkedList.poll(); // Retrieves and removes the head of the list
String peeked = linkedList.peek(); // Retrieves, but does not remove, the head of the list
```

### Nuances and Features

#### 1. Performance Characteristics

`LinkedList` provides constant-time insertion and removal of elements at the beginning or end of the list. However, random access and searching are less efficient compared to `ArrayList`.

#### 2. Memory Usage

The memory usage of a `LinkedList` is higher than that of an `ArrayList` due to the overhead of maintaining the links between elements.

#### 3. Doubly-Linked Structure

Each element in a `LinkedList` contains references to the next and previous elements, forming a doubly-linked structure. This facilitates efficient insertion and removal operations.

Example:

```java
LinkedList<String> linkedList = new LinkedList<>();
// Add elements to the list
Node<String> firstNode = linkedList.getFirstNode();
Node<String> nextNode = firstNode.getNext();
Node<String> previousNode = firstNode.getPrevious();
```

#### 4. List Iterators

`LinkedList` provides support for bidirectional traversal using list iterators.

Example:

```java
LinkedList<String> linkedList = new LinkedList<>();
// Add elements to the list
ListIterator<String> iterator = linkedList.listIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

## Iterators in Collections

Iterators play a crucial role in Java Collections, providing a standardized way to traverse and manipulate elements in various data structures.

Iterators act as a bridge between the Collection and the underlying data structure, allowing sequential access to the elements. The Java Collections Framework provides a consistent set of methods and interfaces for iterating through collections.

### Basic Iterator Interface

The `Iterator` interface is the foundation for iterating through collections. It provides methods such as `hasNext()`, `next()`, and `remove()`.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Collections");

Iterator<String> iterator = myList.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
}
```

### Enhanced for Loop

Java also supports a more concise way of iterating through collections using the enhanced for loop.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Collections");

for (String element : myList) {
    System.out.println(element);
}
```

### Iterator Methods and Properties

#### ListIterator Interface

The `ListIterator` interface extends `Iterator` and provides bidirectional traversal for lists. It includes methods like `hasPrevious()`, `previous()`, `add()`, `set()`, and `previousIndex()`.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Collections");

ListIterator<String> listIterator = myList.listIterator();
while (listIterator.hasNext()) {
    String element = listIterator.next();
    System.out.println(element);
}

while (listIterator.hasPrevious()) {
    String previousElement = listIterator.previous();
    System.out.println(previousElement);
}
```

#### Iterable Interface

The `Iterable` interface allows objects to be iterated using the enhanced for loop. Collections that implement `Iterable` can be used directly in the enhanced for loop.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Collections");

for (String element : myList) {
    System.out.println(element);
}
```

#### Spliterator Interface

Introduced in Java 8, the `Spliterator` interface provides a parallelizable alternative to the `Iterator` for traversing elements of a collection.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Collections");

Spliterator<String> spliterator = myList.spliterator();
spliterator.forEachRemaining(System.out::println);
```

### Nuances and Advanced Techniques

#### Concurrent Modification Exception

Iterators throw a `ConcurrentModificationException` if the underlying collection is modified during iteration. Use the iterator's `remove()` method to avoid this exception.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Collections");

Iterator<String> iterator = myList.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    if (element.equals("Java")) {
        iterator.remove();
    }
}
```

#### Fail-Fast vs. Fail-Safe Iterators

Java iterators can be fail-fast or fail-safe. Fail-fast iterators throw an exception if the underlying collection is modified during iteration, while fail-safe iterators don't.

#### forEach() Method

Introduced in Java 8, the `forEach()` method allows concise iteration through collections using lambda expressions.

Example:

```java
List<String> myList = new ArrayList<>();
myList.add("Java");
myList.add("Collections");

myList.forEach(element -> System.out.println(element));
```

## Storing user-defined Objects in Collections

Java provides a rich set of interfaces and classes in the Collections Framework to handle collections of objects. When dealing with user-defined objects, understanding how to store and manipulate them in collections is crucial for effective programming.

### Creating User-Defined Objects

Let's start by creating a simple user-defined object. In this example, we'll create a `Person` class:

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters (omitted for brevity)
}
```

### Using Lists

Lists, such as `ArrayList` or `LinkedList`, are commonly used for storing sequences of objects.

```java
List<Person> personList = new ArrayList<>();

personList.add(new Person("Alice", 25));
personList.add(new Person("Bob", 30));

// Accessing elements
Person firstPerson = personList.get(0);
```

### Using Sets

Sets, like `HashSet` or `TreeSet`, are useful when uniqueness of elements is required.

```java
Set<Person> personSet = new HashSet<>();

personSet.add(new Person("Alice", 25));
personSet.add(new Person("Bob", 30));

// No duplicates allowed
personSet.add(new Person("Alice", 25));
```

### Using Maps

Maps, such as `HashMap` or `TreeMap`, associate keys with values and are suitable for key-value pair storage.

```java
Map<String, Person> personMap = new HashMap<>();

personMap.put("Alice", new Person("Alice", 25));
personMap.put("Bob", new Person("Bob", 30));

// Accessing elements using keys
Person alice = personMap.get("Alice");
```

### Equality and Hashing

When storing objects in collections, it's important to override the `equals()` and `hashCode()` methods in the user-defined class. This ensures proper comparison and retrieval of objects.

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Person person = (Person) obj;
    return age == person.age && Objects.equals(name, person.name);
}

@Override
public int hashCode() {
    return Objects.hash(name, age);
}
```

### Comparators for Sorting

If sorting is required, implementing the `Comparable` interface or providing a custom `Comparator` is essential.

```java
public class Person implements Comparable<Person> {
    // ...

    @Override
    public int compareTo(Person other) {
        // Custom comparison logic
        return Integer.compare(this.age, other.age);
    }
}

// Sorting a list of persons
List<Person> personList = new ArrayList<>();
Collections.sort(personList);
```

### Iterating Through Collections

#### Using Enhanced for Loop

```java
List<Person> personList = new ArrayList<>();

// Add persons to the list

for (Person person : personList) {
    // Process each person
}
```

#### Using Iterators

```java
List<Person> personList = new ArrayList<>();

// Add persons to the list

Iterator<Person> iterator = personList.iterator();
while (iterator.hasNext()) {
    Person person = iterator.next();
    // Process each person
}
```

### Filtering Collections Using Stream API

The Stream API introduced in Java 8 provides powerful methods for filtering collections.

```java
List<Person> personList = new ArrayList<>();

// Add persons to the list

List<Person> filteredList = personList.stream()
        .filter(person -> person.getAge() > 25)
        .collect(Collectors.toList());
```
