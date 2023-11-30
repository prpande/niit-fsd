<!-- omit in toc -->
# Manipulate Objects Using Unordered Collections and Construct Objects As a Key Value Pair 30/11

<!-- omit in toc -->
## Content

- [The Set Interface](#the-set-interface)
  - [Definition and Characteristics](#definition-and-characteristics)
  - [Commonly Used Implementations](#commonly-used-implementations)
    - [1. HashSet](#1-hashset)
    - [2. LinkedHashSet](#2-linkedhashset)
    - [3. TreeSet](#3-treeset)
  - [Working with Sets](#working-with-sets)
    - [Basic Operations](#basic-operations)
    - [Iterating through a Set](#iterating-through-a-set)
    - [Set Operations](#set-operations)
- [HashSet](#hashset)
  - [Definition and Characteristics](#definition-and-characteristics-1)
  - [Techniques and Examples](#techniques-and-examples)
    - [Basic Usage](#basic-usage)
    - [Iterating through HashSet](#iterating-through-hashset)
- [TreeSet: Sorting with Elegance](#treeset-sorting-with-elegance)
  - [Definition and Characteristics](#definition-and-characteristics-2)
  - [Techniques and Examples](#techniques-and-examples-1)
    - [Basic Usage](#basic-usage-1)
    - [Iterating through TreeSet](#iterating-through-treeset)
  - [Common Properties and Nuances](#common-properties-and-nuances)
    - [Uniqueness and Duplicates](#uniqueness-and-duplicates)
    - [Performance Considerations](#performance-considerations)
- [Knowing the Difference List and Set](#knowing-the-difference-list-and-set)
- [The Map Interface](#the-map-interface)
  - [Definition and Characteristics](#definition-and-characteristics-3)
    - [Basic Declaration and Initialization](#basic-declaration-and-initialization)
  - [Fundamental Techniques](#fundamental-techniques)
    - [Adding and Retrieving Entries](#adding-and-retrieving-entries)
    - [Checking for Key Existence](#checking-for-key-existence)
    - [Removing Entries](#removing-entries)
  - [Map Implementations](#map-implementations)
    - [HashMap: Efficient and Unordered](#hashmap-efficient-and-unordered)
    - [TreeMap: Sorted Keys](#treemap-sorted-keys)
    - [LinkedHashMap: Maintaining Insertion Order](#linkedhashmap-maintaining-insertion-order)
  - [Iterating Through a Map](#iterating-through-a-map)
    - [Iterating Over Keys](#iterating-over-keys)
    - [Iterating Over Values](#iterating-over-values)
    - [Iterating Over Entries](#iterating-over-entries)
  - [Advanced Features](#advanced-features)
    - [Handling Default Values](#handling-default-values)
    - [Conditional Updates](#conditional-updates)
  - [Nuances and Considerations](#nuances-and-considerations)
    - [Key and Value Immutability](#key-and-value-immutability)
    - [Null Values](#null-values)
  - [Performance Considerations](#performance-considerations-1)
- [HashMap](#hashmap)
  - [Definition and Characteristics](#definition-and-characteristics-4)
    - [Basic Declaration and Initialization](#basic-declaration-and-initialization-1)
  - [Fundamental Techniques](#fundamental-techniques-1)
    - [Adding Entries](#adding-entries)
    - [Retrieving Values](#retrieving-values)
    - [Removing Entries](#removing-entries-1)
    - [Checking for Key Existence](#checking-for-key-existence-1)
    - [Iterating Through Entries](#iterating-through-entries)
  - [Nuances and Considerations](#nuances-and-considerations-1)
    - [Null Keys and Values](#null-keys-and-values)
    - [Load Factor](#load-factor)
    - [Collision Handling](#collision-handling)
    - [Performance Considerations](#performance-considerations-2)
  - [Advanced Features](#advanced-features-1)
    - [Handling Default Values](#handling-default-values-1)
    - [Conditional Updates](#conditional-updates-1)
    - [Bulk Operations](#bulk-operations)
- [TreeMap](#treemap)
  - [Definition and Characteristics](#definition-and-characteristics-5)
    - [Basic Declaration and Initialization](#basic-declaration-and-initialization-2)
  - [Fundamental Techniques](#fundamental-techniques-2)
    - [Adding Entries](#adding-entries-1)
    - [Retrieving Values](#retrieving-values-1)
    - [Removing Entries](#removing-entries-2)
    - [Checking for Key Existence](#checking-for-key-existence-2)
    - [Iterating Through Entries](#iterating-through-entries-1)
  - [Nuances and Considerations](#nuances-and-considerations-2)
    - [Comparator or Natural Ordering](#comparator-or-natural-ordering)
    - [Efficiency Trade-off](#efficiency-trade-off)
  - [Advanced Features](#advanced-features-2)
    - [Ceiling and Floor Operations](#ceiling-and-floor-operations)
    - [SubMap](#submap)
    - [HeadMap and TailMap](#headmap-and-tailmap)
- [Iterating Through Maps](#iterating-through-maps)
  - [Basics of Iterating Through Map](#basics-of-iterating-through-map)
    - [Iterating Over Keys](#iterating-over-keys-1)
    - [Iterating Over Values](#iterating-over-values-1)
    - [Iterating Over Entries](#iterating-over-entries-1)
  - [Advanced Iteration Techniques](#advanced-iteration-techniques)
    - [Using forEach() with BiConsumer](#using-foreach-with-biconsumer)
    - [Stream API for Map](#stream-api-for-map)
  - [Nuances and Considerations](#nuances-and-considerations-3)
    - [Concurrent Modification](#concurrent-modification)
    - [Performance Considerations](#performance-considerations-3)
  - [Iterating Through Sorted Maps](#iterating-through-sorted-maps)
    - [Iterating Over Sorted Keys](#iterating-over-sorted-keys)
    - [Iterating Over Sorted Entries](#iterating-over-sorted-entries)

## The Set Interface

Java, as a versatile and robust programming language, provides a rich collection framework to manage and manipulate data structures efficiently. One crucial component of this framework is the `Set` interface, which represents an unordered collection of unique elements. 

### Definition and Characteristics

A `Set` is a part of the Java Collections Framework and extends the `Collection` interface. Unlike lists, sets do not allow duplicate elements, and they do not guarantee the order of elements. The `Set` interface is implemented by various classes in Java, such as `HashSet`, `LinkedHashSet`, and `TreeSet`.

### Commonly Used Implementations

#### 1. HashSet

Implements a hash table for storage. It offers constant-time performance for basic operations, making it one of the fastest implementations.

```java
Set<String> hashSet = new HashSet<>();
hashSet.add("Apple");
hashSet.add("Banana");
hashSet.add("Orange");
```

#### 2. LinkedHashSet

Maintains the insertion order of elements. It achieves this by using a doubly-linked list internally.

```java
Set<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Apple");
linkedHashSet.add("Banana");
linkedHashSet.add("Orange");
```

#### 3. TreeSet

Implements a red-black tree for storage. It guarantees log(n) time cost for the basic operations, making it suitable for scenarios that require sorted sets.

```java
Set<String> treeSet = new TreeSet<>();
treeSet.add("Apple");
treeSet.add("Banana");
treeSet.add("Orange");
```

### Working with Sets

#### Basic Operations

Sets support fundamental operations such as `add`, `remove`, `contains`, and `size`. Let's explore these with examples:

```java
    Set<String> fruitSet = new HashSet<>();

    // Adding elements
    fruitSet.add("Apple");
    fruitSet.add("Banana");
    fruitSet.add("Orange");

    // Removing elements
    fruitSet.remove("Banana");

    // Checking for element existence
    boolean containsApple = fruitSet.contains("Apple");

    // Determining the size of the set
    int setSize = fruitSet.size();
```

#### Iterating through a Set

Iteration through a set can be achieved using an enhanced for loop or an iterator:

```java
Set<String> fruitSet = new HashSet<>();
// Add elements...

// Using enhanced for loop
for (String fruit : fruitSet) {
    System.out.println(fruit);
}

// Using iterator
Iterator<String> iterator = fruitSet.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

#### Set Operations

Java provides several methods for set operations, such as union, inter, and difference:

```java
Set<String> set1 = new HashSet<>();
Set<String> set2 = new HashSet<>();
// Add elements to set1 and set2...

// Union
Set<String> union = new HashSet<>(set1);
union.addAll(set2);

// Inter
Set<String> inter = new HashSet<>(set1);
inter.retainAll(set2);

// Difference
Set<String> difference = new HashSet<>(set1);
difference.removeAll(set2);
```

## HashSet

### Definition and Characteristics

`HashSet` is a part of the Java Collections Framework and implements the `Set` interface. It utilizes a hash table for storage, providing constant-time performance for basic operations like `add`, `remove`, `contains`, and `size`. The key characteristic of `HashSet` is its unordered nature.

### Techniques and Examples

#### Basic Usage

```java
Set<String> hashSet = new HashSet<>();

// Adding elements
hashSet.add("Apple");
hashSet.add("Banana");
hashSet.add("Orange");

// Removing elements
hashSet.remove("Banana");

// Checking for element existence
boolean containsApple = hashSet.contains("Apple");

// Determining the size of the set
int setSize = hashSet.size();
```

#### Iterating through HashSet

```java
Set<String> hashSet = new HashSet<>();
// Add elements...

// Using enhanced for loop
for (String element : hashSet) {
    System.out.println(element);
}

// Using iterator
Iterator<String> iterator = hashSet.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

## TreeSet: Sorting with Elegance

### Definition and Characteristics

`TreeSet`, another implementation of the `Set` interface, uses a red-black tree for storage. Unlike `HashSet`, `TreeSet` guarantees log(n) time cost for basic operations, making it suitable for scenarios where a sorted set is required.

### Techniques and Examples

#### Basic Usage

```java
Set<String> treeSet = new TreeSet<>();

// Adding elements
treeSet.add("Apple");
treeSet.add("Banana");
treeSet.add("Orange");

// Removing elements
treeSet.remove("Banana");

// Checking for element existence
boolean containsApple = treeSet.contains("Apple");

// Determining the size of the set
int setSize = treeSet.size();
```

#### Iterating through TreeSet

```java
Set<String> treeSet = new TreeSet<>();
// Add elements...

// Using enhanced for loop
for (String element : treeSet) {
    System.out.println(element);
}

// Using iterator
Iterator<String> iterator = treeSet.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

### Common Properties and Nuances

#### Uniqueness and Duplicates

Both `HashSet` and `TreeSet` do not allow duplicate elements. In a `HashSet`, uniqueness is determined by the `equals()` method, while in a `TreeSet`, it relies on the natural order or a provided comparator.

#### Performance Considerations

`HashSet` excels in scenarios where constant-time performance is crucial, while `TreeSet` shines when a sorted collection is required. The choice between them depends on the specific use case.

## Knowing the Difference List and Set

| Feature                          | `List`                                           | `Set`                                            |
|----------------------------------|--------------------------------------------------|--------------------------------------------------|
| **Order of Elements**             | Maintains the order of elements (insertion order) | Does not guarantee the order of elements         |
| **Duplicates**                   | Allows duplicate elements                        | Does not allow duplicate elements               |
| **Interface Hierarchy**           | Extends the `Collection` interface                | Also extends the `Collection` interface          |
| **Common Implementations**        | `ArrayList`, `LinkedList`, `Vector`              | `HashSet`, `LinkedHashSet`, `TreeSet`            |
| **Access by Index**               | Supports access by index using `get(int index)`  | Does not support direct access by index          |
| **Performance Characteristics**  | - Generally slower for large datasets            | - Faster for lookups (`HashSet`)                |
|                                  | - Efficient for positional access (`ArrayList`) | - May be slower for insertion (`TreeSet`)       |
| **Iterator Order**                | Follows the order of insertion                    | Order is not guaranteed, may vary by implementation |
| **Use Cases**                    | - When the order of elements matters             | - When uniqueness of elements is crucial        |
|                                  | - When duplicates are allowed or required        | - When order is not important                   |

## The Map Interface

### Definition and Characteristics

The `Map` interface is a part of the Java Collections Framework and represents a collection of key-value pairs. Unlike other collection interfaces like `List` and `Set`, a `Map` does not extend the `Collection` interface. It serves as a dynamic entity, allowing efficient storage, retrieval, and manipulation of data based on unique keys.

#### Basic Declaration and Initialization

```java
Map<String, Integer> studentGrades = new HashMap<>();
```

This declares a `Map` named `studentGrades` with keys of type `String` and values of type `Integer`, implemented using a `HashMap`.

### Fundamental Techniques

#### Adding and Retrieving Entries

```java
// Adding entries
studentGrades.put("Alice", 95);
studentGrades.put("Bob", 89);
studentGrades.put("Charlie", 78);

// Retrieving values
int aliceGrade = studentGrades.get("Alice"); // Returns 95
```

#### Checking for Key Existence

```java
boolean isBobPresent = studentGrades.containsKey("Bob"); // Returns true
```

#### Removing Entries

```java
studentGrades.remove("Charlie");
```

### Map Implementations

#### HashMap: Efficient and Unordered

```java
Map<String, Integer> hashMap = new HashMap<>();
```

#### TreeMap: Sorted Keys

```java
Map<String, Integer> treeMap = new TreeMap<>();
```

#### LinkedHashMap: Maintaining Insertion Order

```java
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
```

### Iterating Through a Map

#### Iterating Over Keys

```java
for (String student : studentGrades.keySet()) {
    System.out.println(student);
}
```

#### Iterating Over Values

```java
for (int grade : studentGrades.values()) {
    System.out.println(grade);
}
```

#### Iterating Over Entries

```java
for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### Advanced Features

#### Handling Default Values

```java
int defaultGrade = studentGrades.getOrDefault("David", -1);
```

#### Conditional Updates

```java
studentGrades.merge("Alice", 5, Integer::sum);
```

### Nuances and Considerations

#### Key and Value Immutability

The keys in a `Map` should ideally be immutable (e.g., using `String`), while values can be mutable objects.

#### Null Values

A `Map` can store `null` values, but it is important to handle them cautiously to avoid `NullPointerException`.

### Performance Considerations

The choice of `Map` implementation depends on the specific use case. `HashMap` offers fast lookups, `TreeMap` provides sorted keys, and `LinkedHashMap` maintains insertion order.

## HashMap

### Definition and Characteristics

`HashMap` is a part of the Java Collections Framework and implements the `Map` interface using a hash table for storage. Some key characteristics include:

- **Efficiency**: Provides constant-time performance for basic operations (`put`, `get`, `remove`).
- **Order**: Does not guarantee any specific order of elements.

#### Basic Declaration and Initialization

```java
Map<String, Integer> hashMap = new HashMap<>();
```

### Fundamental Techniques

#### Adding Entries

```java
hashMap.put("Apple", 10);
hashMap.put("Banana", 5);
hashMap.put("Orange", 8);
```

#### Retrieving Values

```java
int appleQuantity = hashMap.get("Apple"); // Returns 10
```

#### Removing Entries

```java
hashMap.remove("Banana");
```

#### Checking for Key Existence

```java
boolean containsKey = hashMap.containsKey("Orange"); // Returns true
```

#### Iterating Through Entries

```java
for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### Nuances and Considerations

#### Null Keys and Values

`HashMap` allows one `null` key and multiple `null` values.

```java
hashMap.put(null, 15);
int nullValue = hashMap.get(null); // Returns 15
```

#### Load Factor

The default load factor is 0.75, indicating the point at which the table will resize for optimal performance.

#### Collision Handling

`HashMap` uses separate chaining for handling hash collisions.

#### Performance Considerations

The efficiency of `HashMap` operations makes it suitable for a wide range of scenarios.

### Advanced Features

#### Handling Default Values

```java
int defaultValue = hashMap.getOrDefault("Grapes", -1); // Returns -1
```

#### Conditional Updates

```java
hashMap.merge("Apple", 5, Integer::sum);
```

#### Bulk Operations

```java
Map<String, Integer> anotherMap = new HashMap<>();
anotherMap.put("Cherry", 12);
anotherMap.put("Grapes", 7);

hashMap.putAll(anotherMap);
```

## TreeMap

### Definition and Characteristics

`TreeMap` is a part of the Java Collections Framework and implements the `Map` interface using a Red-Black tree for storage. Key characteristics include:

- **Efficiency**: Provides log(n) time cost for basic operations (`put`, `get`, `remove`).
- **Order**: Maintains elements in sorted order based on their natural order or a provided comparator.

#### Basic Declaration and Initialization

```java
Map<String, Integer> treeMap = new TreeMap<>();
```

### Fundamental Techniques

#### Adding Entries

```java
treeMap.put("Apple", 10);
treeMap.put("Banana", 5);
treeMap.put("Orange", 8);
```

#### Retrieving Values

```java
int bananaQuantity = treeMap.get("Banana"); // Returns 5
```

#### Removing Entries

```java
treeMap.remove("Orange");
```

#### Checking for Key Existence

```java
boolean containsKey = treeMap.containsKey("Apple"); // Returns true
```

#### Iterating Through Entries

```java
for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### Nuances and Considerations

#### Comparator or Natural Ordering

Elements are sorted based on either their natural order or a provided comparator during `TreeMap` creation.

```java
Map<String, Integer> reverseTreeMap = new TreeMap<>(Collections.reverseOrder());
reverseTreeMap.put("Apple", 10);
reverseTreeMap.put("Banana", 5);
reverseTreeMap.put("Orange", 8);

// Iterating over entries in reverse order
for (Map.Entry<String, Integer> entry : reverseTreeMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

#### Efficiency Trade-off

While offering sorted access, operations like `put` and `remove` are generally slower compared to `HashMap`.

### Advanced Features

#### Ceiling and Floor Operations

```java
String lowerFruit = treeMap.lowerKey("Banana"); // Returns "Apple"
String higherFruit = treeMap.higherKey("Banana"); // Returns "Orange"
```

#### SubMap

```java
SortedMap<String, Integer> subMap = treeMap.subMap("Banana", "Orange");
```

#### HeadMap and TailMap

```java
SortedMap<String, Integer> headMap = treeMap.headMap("Banana");
SortedMap<String, Integer> tailMap = treeMap.tailMap("Banana");
```

## Iterating Through Maps

### Basics of Iterating Through Map

#### Iterating Over Keys

```java
Map<String, Integer> studentGrades = new HashMap<>();
// Add entries...

for (String student : studentGrades.keySet()) {
    System.out.println("Student: " + student);
}
```

#### Iterating Over Values

```java
for (int grade : studentGrades.values()) {
    System.out.println("Grade: " + grade);
}
```

#### Iterating Over Entries

```java
for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
    System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
}
```

### Advanced Iteration Techniques

#### Using forEach() with BiConsumer

```java
studentGrades.forEach((student, grade) ->
    System.out.println("Student: " + student + ", Grade: " + grade));
```

#### Stream API for Map

```java
studentGrades.entrySet().stream()
    .filter(entry -> entry.getValue() > 90)
    .forEach(entry -> System.out.println("Top student: " + entry.getKey()));
```

### Nuances and Considerations

#### Concurrent Modification

```java
// Incorrect way to modify map during iteration
for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
    if (entry.getValue() < 60) {
        studentGrades.remove(entry.getKey()); // ConcurrentModificationException
    }
}
```

To avoid `ConcurrentModificationException`, use an iterator or create a new map:

```java
Iterator<Map.Entry<String, Integer>> iterator = studentGrades.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<String, Integer> entry = iterator.next();
    if (entry.getValue() < 60) {
        iterator.remove();
    }
}
```

#### Performance Considerations

- Iterating over keys or values is generally faster than iterating over entries.
  
- Stream API introduces overhead but provides a more declarative approach.

### Iterating Through Sorted Maps

#### Iterating Over Sorted Keys

```java
Map<String, Integer> sortedMap = new TreeMap<>();
// Add entries...

for (String key : sortedMap.keySet()) {
    System.out.println("Key: " + key);
}
```

#### Iterating Over Sorted Entries

```java
for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
```
