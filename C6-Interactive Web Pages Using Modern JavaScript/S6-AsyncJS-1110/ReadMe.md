<!-- omit in toc -->
# Async programming with JavaScript - 11/10

<!-- omit in toc -->
## Content

- [Synchronous Execution in JavaScript](#synchronous-execution-in-javascript)
  - [Limitations of Synchronous Execution](#limitations-of-synchronous-execution)
- [Asynchronous Execution](#asynchronous-execution)
  - [Advantages of Asynchronous Execution](#advantages-of-asynchronous-execution)
  - [Key Concepts and Techniques](#key-concepts-and-techniques)
- [SetTimeout and SetInterval](#settimeout-and-setinterval)
  - [setTimeout](#settimeout)
  - [setInterval](#setinterval)
- [Callbacks](#callbacks)
  - [Basic Callback Example](#basic-callback-example)
  - [Handling Asynchronous Operations](#handling-asynchronous-operations)
  - [Error Handling](#error-handling)
  - [Callback Properties and Concepts](#callback-properties-and-concepts)
    - [1. First-Class Functions](#1-first-class-functions)
    - [2. Closures](#2-closures)
    - [3. Callback Hell](#3-callback-hell)
    - [4. Error-First Callbacks](#4-error-first-callbacks)
  - [Callback Hell](#callback-hell)
    - [Origins](#origins)
    - [Disadvantages](#disadvantages)
    - [Techniques to Tame Callback Hell](#techniques-to-tame-callback-hell)
  - [Closures](#closures)
    - [Basic Closure Example](#basic-closure-example)
    - [Practical Use of Closures](#practical-use-of-closures)
    - [Closures and Memory](#closures-and-memory)
    - [Garbage Collection](#garbage-collection)
- [Promises](#promises)
  - [Creating a Basic Promise](#creating-a-basic-promise)
  - [Chaining Promises](#chaining-promises)
  - [Error Handling with Promises](#error-handling-with-promises)
  - [Promises and Parallel Execution](#promises-and-parallel-execution)
  - [Promises with async/await](#promises-with-asyncawait)
- [Async/Await](#asyncawait)
  - [Basic async/await Example](#basic-asyncawait-example)
  - [Error Handling with async/await](#error-handling-with-asyncawait)
  - [Parallel Execution with Promise.all](#parallel-execution-with-promiseall)
  - [async/await and Loops](#asyncawait-and-loops)
  - [async/await with Promises](#asyncawait-with-promises)
- [Understanding Promise Chaining](#understanding-promise-chaining)
  - [Basic Promise Chaining Example](#basic-promise-chaining-example)
  - [Error Handling in Promise Chaining](#error-handling-in-promise-chaining)
  - [Returning Values in Promise Chaining](#returning-values-in-promise-chaining)
  - [Parallel Execution with `Promise.all()`](#parallel-execution-with-promiseall-1)
- [Understanding JavaScript Generators](#understanding-javascript-generators)
  - [Creating a Simple Generator](#creating-a-simple-generator)
  - [Infinite Generators](#infinite-generators)
  - [Control Flow with Generators](#control-flow-with-generators)
  - [Two-way Communication with Generators](#two-way-communication-with-generators)
  - [Combining Generators](#combining-generators)
- [Server Operations with Axios API in JavaScript](#server-operations-with-axios-api-in-javascript)
  - [Installing Axios](#installing-axios)
  - [Making GET Requests](#making-get-requests)
  - [Making POST Requests](#making-post-requests)
  - [Handling Promises](#handling-promises)
  - [Customizing Requests](#customizing-requests)
  - [Interceptors](#interceptors)
  - [Handling Responses](#handling-responses)
  - [Handling Errors](#handling-errors)
  - [Cancellation](#cancellation)

## Synchronous Execution in JavaScript

Synchronous execution, also known as blocking execution, is the default mode of code execution in JavaScript. In this mode, code is executed line by line, and the interpreter waits for each statement to complete before moving on to the next one. Here's how synchronous execution works:

1. Line-by-Line Execution: JavaScript processes code sequentially, from top to bottom. Each line of code is executed before moving on to the next.

2. Blocking Behavior: When a resource-intensive operation, such as a network request or a time-consuming calculation, is encountered, it blocks the entire execution until it's completed. This can cause delays in your program and may make your application less responsive.

3. Predictable Flow: Synchronous code execution has the benefit of producing predictable and deterministic results. It ensures that operations happen in a specific order, which can be useful in some cases.

### Limitations of Synchronous Execution

While synchronous execution provides predictability, it comes with several limitations:

1. Blocking the Main Thread: The most significant drawback of synchronous execution is that it can block the main thread of a web application. This means that any time-consuming operation can freeze the entire user interface, causing a poor user experience. For instance, if a JavaScript function takes a long time to complete, the user won't be able to interact with the web page during that period.

2. Reduced Responsiveness: Synchronous code execution can result in unresponsive web applications. In today's fast-paced digital world, users expect applications to respond quickly to their inputs. Synchronous code execution can hinder this responsiveness.

3. Poor Scalability: In modern web development, scalability is crucial. Synchronous code execution limits the scalability of your application because it doesn't take full advantage of modern multi-core processors. In a multi-core environment, asynchronous code execution can significantly improve performance by utilizing all available cores.

4. Limited Use in Certain Scenarios: Synchronous execution is not suitable for certain scenarios, such as handling multiple concurrent requests or creating real-time applications where immediate user interactions are required.

5. Error Handling: Synchronous code execution can make error handling more complex. If an error occurs, it can disrupt the entire program, making it challenging to recover gracefully from failures.

## Asynchronous Execution

Asynchronous execution in JavaScript allows code to run independently of the main program flow. It doesn't wait for time-consuming tasks to complete but instead continues executing other code while those tasks are processed in the background. This enables web applications to remain responsive and prevents the user interface from freezing.

### Advantages of Asynchronous Execution

1. **Non-Blocking Operations**: The primary advantage of asynchronous execution is that it prevents blocking. Time-consuming tasks, such as fetching data from a server or reading from a file, can be handled without stalling the entire program. This means users can interact with the application while these operations are ongoing.

2. **Enhanced Responsiveness**: By avoiding blocking, asynchronous code ensures that the user interface remains responsive. Users can continue using the application and don't experience delays or unresponsiveness, even when the program is performing complex operations in the background.

3. **Parallelism**: Asynchronous code allows multiple tasks to be executed simultaneously, making it possible to leverage the full potential of multi-core processors. This leads to more efficient resource utilization and faster execution of tasks.

4. **Improved User Experience**: Asynchronous execution contributes to a better user experience. When an application responds quickly to user input and provides feedback in a timely manner, it creates a more pleasant and engaging environment for users.

5. **Efficient Resource Utilization**: Asynchronous execution allows for efficient use of resources. While one task is waiting for I/O, other tasks can be executed, making the most of the available processing power.

### Key Concepts and Techniques

1. **Callbacks**: Callbacks are functions passed as arguments to other functions, which are then executed upon completion of a specific task. They are a fundamental building block of asynchronous code in JavaScript.

2. **Promises**: Promises provide a more structured and readable way to handle asynchronous operations. They represent a value that may be available now or in the future and offer a straightforward mechanism for handling success and error cases.

3. **Async/Await**: Async/await is a modern syntactic sugar built on top of Promises. It allows developers to write asynchronous code that resembles synchronous code, greatly improving readability and maintainability.

4. **Event Loop**: The event loop is at the core of JavaScript's non-blocking behavior. It continuously checks the message queue for tasks to execute, ensuring that the main thread remains free to handle user interactions.

## SetTimeout and SetInterval

`setTimeout` and `setInterval` are two built-in JavaScript functions that allow you to schedule asynchronous actions.

### setTimeout

```javascript
setTimeout(function () {
  console.log("This code runs after a delay.");
}, 1000); // Delay in milliseconds
```

### setInterval

```javascript
let counter = 0;

const intervalId = setInterval(function () {
  counter++;
  console.log(`Counter: ${counter}`);

  if (counter === 5) {
    clearInterval(intervalId); // Stop the interval after 5 iterations
  }
}, 1000); // Interval in milliseconds
```

## Callbacks

In JavaScript, a callback function is a function that is passed as an argument to another function. It is executed once the parent function completes its task, typically an asynchronous operation. Callbacks are widely used in event handling, AJAX requests, and many other scenarios.

### Basic Callback Example

Here's a simple example of a callback function:

```javascript
function greet(name, callback) {
  console.log(`Hello, ${name}!`);
  callback();
}

function sayGoodbye() {
  console.log('Goodbye!');
}

greet('Alice', sayGoodbye);
```

In this example, `sayGoodbye` is a callback function passed to the `greet` function.

### Handling Asynchronous Operations

Callbacks are particularly useful when working with asynchronous operations. Here's an example of a callback used with a simulated asynchronous function:

```javascript
function fetchData(callback) {
  setTimeout(() => {
    const data = 'Async data fetched!';
    callback(data);
  }, 1000);
}

function process(data) {
  console.log(data);
}

fetchData(process);
```

In this example, `fetchData` simulates an asynchronous data fetch operation, and the `process` function is used as a callback to handle the fetched data.

### Error Handling

Callbacks are also used for error handling. A common convention is to pass two arguments to a callback: the first for errors and the second for results.

```javascript
function processAsyncData(data, callback) {
  if (data) {
    callback(null, `Processed data: ${data}`);
  } else {
    callback('Data not found', null);
  }
}

function handleResult(error, result) {
  if (error) {
    console.error(`Error: ${error}`);
  } else {
    console.log(result);
  }
}

const asyncData = 'Some data';
processAsyncData(asyncData, handleResult);
```

In this example, `handleResult` is a callback that can handle both successful results and errors.

### Callback Properties and Concepts

#### 1. First-Class Functions

In JavaScript, functions are first-class citizens, which means they can be assigned to variables, passed as arguments, and returned from other functions.

#### 2. Closures

Callbacks can create closures, allowing them to access variables from their parent function even after the parent function has finished executing.

#### 3. Callback Hell

Nested callbacks can lead to callback hell, making code hard to read and maintain. Consider alternatives like Promises or async/await for more structured code.

#### 4. Error-First Callbacks

The convention of using error-first callbacks makes it easy to handle errors and results within a single callback.

### Callback Hell

Callback hell, also known as "Pyramid of Doom," is a common problem in JavaScript when dealing with asynchronous operations. It occurs when multiple nested callbacks make code hard to read and maintain. In this technical article, we will explore the causes of callback hell, its disadvantages, and various techniques to mitigate this issue, including the use of named functions, Promises, async/await, and modularization.

#### Origins

JavaScript is single-threaded and relies on callbacks to handle asynchronous tasks like network requests and file I/O. Callbacks are functions that get executed when a task is completed, but they tend to lead to deeply nested structures. Here's an example of callback hell:

```javascript
asyncFunction1(function (result1) {
  asyncFunction2(result1, function (result2) {
    asyncFunction3(result2, function (result3) {
      asyncFunction4(result3, function (result4) {
        // And so on...
      });
    });
  });
});
```

Asynchronous code written this way is hard to read and maintain, leading to what developers call "callback hell."

#### Disadvantages

Callback hell presents several disadvantages:

1. **Readability**: Deeply nested callbacks make code less readable, especially when many async operations are involved.

2. **Maintenance**: Code becomes hard to maintain and prone to errors, as changes can affect multiple levels of nesting.

3. **Error Handling**: Error handling can become convoluted, leading to unclear and fragile code.

4. **Inflexibility**: It's challenging to reuse and modularize code, making it less adaptable to changes.

#### Techniques to Tame Callback Hell

- **Named Functions**

    One approach to alleviate callback hell is to use named functions, also known as function declarations. This separates the callback functions from the asynchronous operations, making the code more readable and maintainable.

    ```javascript
    function handleResult1(result1) {
    asyncFunction2(result1, handleResult2);
    }

    function handleResult2(result2) {
    asyncFunction3(result2, handleResult3);
    }

    function handleResult3(result3) {
    asyncFunction4(result3, handleResult4);
    }

    asyncFunction1(handleResult1);
    ```

- **Promises**

    Promises provide a cleaner way to handle asynchronous code. Promises have a more structured and intuitive syntax and allow you to chain asynchronous operations.

    ```javascript
    asyncFunction1()
    .then(asyncFunction2)
    .then(asyncFunction3)
    .then(asyncFunction4)
    .catch((error) => {
        console.error(error);
    });
    ```

- **Async/Await**

    Async/await, built on top of Promises, further simplifies asynchronous code by making it resemble synchronous code. This improves code readability and maintainability.

    ```javascript
    async function performAsyncOperations() {
    try {
        const result1 = await asyncFunction1();
        const result2 = await asyncFunction2(result1);
        const result3 = await asyncFunction3(result2);
        const result4 = await asyncFunction4(result3);
    } catch (error) {
        console.error(error);
    }
    }

    performAsyncOperations();
    ```

- **Modularization**

    Breaking down code into smaller, modular functions can also help avoid callback hell. Each function can handle one specific task, making the code more organized and easier to understand.

    ```javascript
    async function processAsyncData(data) {
    // Process data here
    }

    async function fetchDataFromServer() {
    try {
        const data = await asyncFunction1();
        const processedData = await processAsyncData(data);
        return processedData;
    } catch (error) {
        console.error(error);
    }
    }

    fetchDataFromServer();
    ```

### Closures

A closure is an inner function that has access to the variables of its outer (enclosing) function, even after the outer function has finished executing. This allows you to create private variables and maintain state between function calls.

#### Basic Closure Example

Here's a simple example of a closure:

```javascript
function outerFunction() {
  const outerVariable = 'I am from the outer function';

  function innerFunction() {
    console.log(outerVariable);
  }

  return innerFunction;
}

const closure = outerFunction();
closure(); // Output: "I am from the outer function"
```

In this example, `innerFunction` has access to `outerVariable`, even after `outerFunction` has completed.

#### Practical Use of Closures

1. **Private Variables**

    Closures are often used to create private variables, ensuring that data is not accessible from the global scope.

    ```javascript
    function createCounter() {
    let count = 0;

    return function () {
        count++;
        console.log(count);
    };
    }

    const counter = createCounter();
    counter(); // Output: 1
    counter(); // Output: 2
    ```

    In this example, the `count` variable is encapsulated within the closure, making it inaccessible from outside.

2. **Data Encapsulation**

    Closures can encapsulate data and behavior, allowing you to create modular and reusable code.

    ```javascript
    function createPerson(name) {
    return {
        getName: function () {
        return name;
        },
        setName: function (newName) {
        name = newName;
        },
    };
    }

    const person = createPerson('Alice');
    console.log(person.getName()); // Output: "Alice"
    person.setName('Bob');
    console.log(person.getName()); // Output: "Bob"
    ```

    Here, the `name` variable is encapsulated within the closure.

3. **Event Handling**

    Closures are often used to create event handlers with access to variables related to the event.

    ```javascript
    function addClickHandler(element) {
    let clicks = 0;

    element.addEventListener('click', function () {
        clicks++;
        console.log(`Clicks: ${clicks}`);
    });
    }

    const button = document.getElementById('myButton');
    addClickHandler(button);
    ```

    In this example, the `clicks` variable is maintained across click events.

#### Closures and Memory

Closures can lead to memory management concerns. If closures are not managed properly, they can cause memory leaks. It's important to understand when closures are automatically collected by JavaScript's garbage collector.

#### Garbage Collection

In most cases, JavaScript's garbage collector will automatically clean up closures when they are no longer accessible, such as when there are no references to the closure. However, in certain scenarios like circular references, manual cleanup may be necessary.

```javascript
function createCircularReference() {
  const circular = {};
  circular.self = circular;
  return circular;
}

const circularReference = createCircularReference();

// To ensure cleanup and avoid memory leaks, set the reference to null when done.
circularReference.self = null;
```

## Promises

A Promise is an object representing the eventual completion or failure of an asynchronous operation. It has three states: `pending`, `fulfilled` (resolved), and `rejected`.

### Creating a Basic Promise

Here's a simple example of creating and using a Promise:

```javascript
const promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    const success = true;
    if (success) {
      resolve('Operation completed successfully.');
    } else {
      reject('Operation failed.');
    }
  }, 1000);
});

promise
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.error(error);
  });
```

In this example, the Promise resolves successfully after a delay and logs the result.

### Chaining Promises

Promises can be chained together to perform a series of asynchronous operations sequentially:

```javascript
function step1() {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log('Step 1 completed.');
      resolve('Step 1 result');
    }, 1000);
  });
}

function step2(previousResult) {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log('Step 2 completed.');
      resolve(`${previousResult}, Step 2 result`);
    }, 1000);
  });
}

step1()
  .then(step2)
  .then((finalResult) => {
    console.log('Final Result:', finalResult);
  });
```

This example demonstrates sequential execution of asynchronous operations.

### Error Handling with Promises

Promises have built-in error handling using the `catch` method, allowing you to gracefully handle errors:

```javascript
function performAsyncOperation() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const success = false;
      if (success) {
        resolve('Operation completed successfully.');
      } else {
        reject('Operation failed.');
      }
    }, 1000);
  });
}

performAsyncOperation()
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.error(error);
  });
```

In this example, the Promise rejects with an error message.

### Promises and Parallel Execution

You can execute multiple Promises in parallel and handle them with `Promise.all`:

```javascript
const promise1 = fetch('https://jsonplaceholder.typicode.com/posts/1');
const promise2 = fetch('https://jsonplaceholder.typicode.com/posts/2');

Promise.all([promise1, promise2])
  .then((responses) => {
    const data1 = responses[0].json();
    const data2 = responses[1].json();
    return Promise.all([data1, data2]);
  })
  .then((results) => {
    console.log('Data 1:', results[0]);
    console.log('Data 2:', results[1]);
  })
  .catch((error) => {
    console.error(error);
  });
```

This code fetches data from two URLs in parallel and processes the results.

### Promises with async/await

Async/await is a modern way to work with Promises, making asynchronous code look more like synchronous code. Here's an example:

```javascript
async function fetchData() {
  try {
    const response = await fetch('https://jsonplaceholder.typicode.com/posts/1');
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

fetchData();
```

Async/await simplifies asynchronous code and improves readability.

## Async/Await

Async/await is a syntactical feature built on top of Promises. It allows you to write asynchronous code that closely resembles synchronous code, making it more intuitive and less error-prone.

### Basic async/await Example

Here's a simple example of async/await:

```javascript
async function fetchData() {
  try {
    const response = await fetch('https://jsonplaceholder.typicode.com/posts/1');
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

fetchData();
```

In this example, the `await` keyword is used to pause the execution of the function until the Promise is resolved.

### Error Handling with async/await

Async/await simplifies error handling with `try` and `catch` blocks:

```javascript
async function fetchData() {
  try {
    const response = await fetch('https://nonexistent-url.com');
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

fetchData();
```

This code handles errors gracefully.

### Parallel Execution with Promise.all

You can use async/await with `Promise.all` to execute multiple asynchronous operations in parallel:

```javascript
async function fetchAndProcessData() {
  const promise1 = fetch('https://jsonplaceholder.typicode.com/posts/1');
  const promise2 = fetch('https://jsonplaceholder.typicode.com/posts/2');

  const [result1, result2] = await Promise.all([promise1, promise2].map(async (promise) => {
    const response = await promise;
    return response.json();
  }));

  console.log('Data 1:', result1);
  console.log('Data 2:', result2);
}

fetchAndProcessData();
```

This code fetches and processes data from two URLs in parallel.

### async/await and Loops

Using async/await in loops requires some care, as it's easy to unintentionally introduce synchronization issues. Here's an example using `for...of`:

```javascript
async function fetchMultipleData(urls) {
  const results = [];

  for (const url of urls) {
    const response = await fetch(url);
    const data = await response.json();
    results.push(data);
  }

  return results;
}

const urls = [
  'https://jsonplaceholder.typicode.com/posts/1',
  'https://jsonplaceholder.typicode.com/posts/2',
];

fetchMultipleData(urls).then((results) => {
  console.log(results);
});
```

### async/await with Promises

async/await works seamlessly with Promises, allowing you to integrate existing Promise-based code:

```javascript
function fetchData() {
  return new Promise(async (resolve, reject) => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts/1');
      const data = await response.json();
      resolve(data);
    } catch (error) {
      reject(error);
    }
  });
}

fetchData()
  .then((data) => {
    console.log(data);
  })
  .catch((error) => {
    console.error(error);
  });
```

In this example, we wrap async/await inside a Promise constructor.

## Understanding Promise Chaining

Promise chaining is a technique used to execute asynchronous operations sequentially by linking promises together. Each promise's result becomes the input for the next promise in the chain, creating a well-structured flow of asynchronous tasks.

### Basic Promise Chaining Example

Here's a simple example of promise chaining:

```javascript
function step1() {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log('Step 1 completed.');
      resolve('Step 1 result');
    }, 1000);
  });
}

function step2(previousResult) {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log('Step 2 completed.');
      resolve(`${previousResult}, Step 2 result`);
    }, 1000);
  });
}

step1()
  .then(step2)
  .then((finalResult) => {
    console.log('Final Result:', finalResult);
  });
```

In this example, we have two functions, `step1` and `step2`, each returning a promise. We chain them together, ensuring that `step2` is executed only after `step1` is completed.

### Error Handling in Promise Chaining

Handling errors in promise chains is crucial. You can use the `.catch()` method at any point in the chain to handle errors gracefully:

```javascript
function fetchFromServer() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const success = false;
      if (success) {
        resolve('Data from the server');
      } else {
        reject('Failed to fetch data');
      }
    }, 1000);
  });
}

fetchFromServer()
  .then((data) => {
    console.log(data);
    throw new Error('Custom Error');
  })
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.error('Error:', error);
  });
```

In this example, when an error is thrown in the first `.then()` block, the control is transferred to the `.catch()` block.

### Returning Values in Promise Chaining

Promises allow you to return values in the chain, which can be accessed in subsequent `.then()` blocks:

```javascript
function step1() {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log('Step 1 completed.');
      resolve('Step 1 result');
    }, 1000);
  });
}

function step2(previousResult) {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log('Step 2 completed.');
      resolve(`${previousResult}, Step 2 result`);
    }, 1000);
  });
}

step1()
  .then((result) => {
    console.log('Step 1 result:', result);
    return step2(result);
  })
  .then((finalResult) => {
    console.log('Final Result:', finalResult);
  });
```

In this example, the `step1` result is passed to `step2` by returning it in the first `.then()` block.

### Parallel Execution with `Promise.all()`

While promise chaining is typically sequential, you can use `Promise.all()` to execute multiple promises in parallel:

```javascript
const promise1 = fetch('https://jsonplaceholder.typicode.com/posts/1');
const promise2 = fetch('https://jsonplaceholder.typicode.com/posts/2');

Promise.all([promise1, promise2])
  .then((responses) => {
    const data1 = responses[0].json();
    const data2 = responses[1].json();
    return Promise.all([data1, data2]);
  })
  .then((results) => {
    console.log('Data 1:', results[0]);
    console.log('Data 2:', results[1]);
  })
  .catch((error) => {
    console.error(error);
  });
```

This code fetches data from two URLs in parallel and processes the results.

## Understanding JavaScript Generators

A generator is a special type of function in JavaScript that allows you to pause and resume its execution. It produces a sequence of values, which can be generated lazily, making it useful for handling asynchronous operations, iterating large datasets, and creating custom iterators.

### Creating a Simple Generator

Here's a basic example of a generator function:

```javascript
function* simpleGenerator() {
  yield 1;
  yield 2;
  yield 3;
}

const generator = simpleGenerator();

console.log(generator.next().value); // 1
console.log(generator.next().value); // 2
console.log(generator.next().value); // 3
```

In this example, the generator yields values one by one when you call `.next()`.

### Infinite Generators

Generators can be infinite, allowing you to create an unbounded sequence:

```javascript
function* infiniteCounter() {
  let count = 1;
  while (true) {
    yield count;
    count++;
  }
}

const counter = infiniteCounter();

console.log(counter.next().value); // 1
console.log(counter.next().value); // 2
console.log(counter.next().value); // 3
// And so on...
```

This example generates an infinite sequence of numbers.

### Control Flow with Generators

Generators can pause and resume execution, allowing for more complex control flow. This is useful for asynchronous operations:

```javascript
function* fetchData() {
  const data1 = yield fetch('https://jsonplaceholder.typicode.com/posts/1');
  const data2 = yield fetch('https://jsonplaceholder.typicode.com/posts/2');

  console.log(data1.title);
  console.log(data2.title);
}

function runGenerator(generator) {
  const iterator = generator();
  const next = (value) => {
    const result = iterator.next(value);
    if (!result.done) {
      result.value.then((data) => next(data));
    }
  };
  next();
}

runGenerator(fetchData);
```

In this example, the generator `fetchData` fetches data sequentially while pausing and resuming execution.

### Two-way Communication with Generators

Generators allow for two-way communication between the caller and the generator using the `yield` and `.next()` methods:

```javascript
function* twoWayGenerator() {
  const message = yield 'Hello';
  yield `You said: ${message}`;
}

const generator = twoWayGenerator();

console.log(generator.next().value); // Hello
console.log(generator.next('Hi there').value); // You said: Hi there
```

In this example, you can pass data to and from the generator using `yield`.

### Combining Generators

You can combine generators to create more complex control flows. This is useful for composing asynchronous operations:

```javascript
function* fetchData(url) {
  const response = yield fetch(url);
  const data = yield response.json();
  return data;
}

function* combinedGenerator() {
  const data1 = yield* fetchData('https://jsonplaceholder.typicode.com/posts/1');
  const data2 = yield* fetchData('https://jsonplaceholder.typicode.com/posts/2');

  console.log(data1.title);
  console.log(data2.title);
}

const generator = combinedGenerator();
```

In this example, `combinedGenerator` composes two `fetchData` generators to fetch and process data from different URLs.

## Server Operations with Axios API in JavaScript

Axios is a popular JavaScript library for making HTTP requests to servers. It provides a powerful and flexible way to communicate with web services, retrieve data, and send data to servers. In this comprehensive article, we will explore the Axios API, covering various techniques, nuances, features, and properties, with detailed examples for each.

### Installing Axios

Before diving into Axios, you need to install it. You can do so using npm or yarn:

```bash
npm install axios
# or
yarn add axios
```

### Making GET Requests

Fetching data from a server is a common operation in web development. Axios makes it simple:

```javascript
const axios = require('axios');

axios.get('https://jsonplaceholder.typicode.com/posts/1')
  .then((response) => {
    console.log(response.data);
  })
  .catch((error) => {
    console.error(error);
  });
```

### Making POST Requests

Sending data to a server is another common operation. You can use the `axios.post` method:

```javascript
const axios = require('axios');

const data = {
  title: 'foo',
  body: 'bar',
  userId: 1,
};

axios.post('https://jsonplaceholder.typicode.com/posts', data)
  .then((response) => {
    console.log(response.data);
  })
  .catch((error) => {
    console.error(error);
  });
```

### Handling Promises

Axios returns Promises, allowing you to use `then` and `catch` for handling responses and errors, respectively. You can also use `async/await` for more readable code:

```javascript
const axios = require('axios');

async function fetchData() {
  try {
    const response = await axios.get('https://jsonplaceholder.typicode.com/posts/1');
    console.log(response.data);
  } catch (error) {
    console.error(error);
  }
}

fetchData();
```

### Customizing Requests

You can customize your requests using Axios' configuration options. Here's an example of setting headers and handling timeouts:

```javascript
const axios = require('axios');

const config = {
  headers: {
    'Authorization': 'Bearer YOUR_ACCESS_TOKEN',
  },
  timeout: 5000, // 5 seconds
};

axios.get('https://api.example.com/data', config)
  .then((response) => {
    console.log(response.data);
  })
  .catch((error) => {
    console.error(error);
  });
```

### Interceptors

Axios allows you to intercept requests and responses globally. This can be handy for adding common headers or handling errors consistently:

```javascript
const axios = require('axios');

axios.interceptors.request.use((config) => {
  // Add common headers
  config.headers['Authorization'] = 'Bearer YOUR_ACCESS_TOKEN';
  return config;
});

axios.interceptors.response.use((response) => {
  // Handle successful responses
  return response;
}, (error) => {
  // Handle errors
  console.error(error);
  return Promise.reject(error);
});

axios.get('https://api.example.com/data')
  .then((response) => {
    console.log(response.data);
  });
```

### Handling Responses

Axios provides a wealth of information in its response objects. For instance, you can access headers, status codes, and more:

```javascript
const axios = require('axios');

axios.get('https://jsonplaceholder.typicode.com/posts/1')
  .then((response) => {
    console.log('Status Code:', response.status);
    console.log('Response Headers:', response.headers);
    console.log('Data:', response.data);
  })
  .catch((error) => {
    console.error(error);
  });
```

### Handling Errors

Axios automatically rejects Promises on error, and you can handle errors with `catch`. The `error` object provides valuable information:

```javascript
const axios = require('axios');

axios.get('https://api.example.com/nonexistent')
  .then((response) => {
    console.log(response.data);
  })
  .catch((error) => {
    console.error('Status Code:', error.response.status);
    console.error('Error Message:', error.message);
  });
```

### Cancellation

Axios supports request cancellation. This can be handy when you want to cancel a request if the user navigates away from the current page or performs another action:

```javascript
const axios = require('axios');
const source = axios.CancelToken.source();

axios.get('https://api.example.com/slow-data', {
  cancelToken: source.token,
})
  .then((response) => {
    console.log(response.data);
  })
  .catch((error) => {
    if (axios.isCancel(error)) {
      console.log('Request canceled:', error.message);
    } else {
      console.error(error);
    }
  });

// Cancel the request
source.cancel('Request canceled by the user');
```
