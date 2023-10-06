<!-- omit in toc -->
# Stateless Communication using REST APIs & JSON 06/10

<!-- omit in toc -->
## Contents
- [Understanding APIs in Client-Server Communication](#understanding-apis-in-client-server-communication)
  - [1. Abstraction of Complexity](#1-abstraction-of-complexity)
  - [2. Standardization](#2-standardization)
  - [3. Data Exchange](#3-data-exchange)
  - [Examples Illustrating the Role of APIs](#examples-illustrating-the-role-of-apis)
    - [Example 1: Twitter API](#example-1-twitter-api)
    - [Example 2: Payment Gateway API](#example-2-payment-gateway-api)
- [The Core Rules of Client-Server Communication](#the-core-rules-of-client-server-communication)
  - [Examples Illustrating the Rules](#examples-illustrating-the-rules)
    - [Example 1: Stateless Communication in HTTP](#example-1-stateless-communication-in-http)
    - [Example 2: Uniform Interface with RESTful APIs](#example-2-uniform-interface-with-restful-apis)
    - [Example 3: Layered System in Cloud Computing](#example-3-layered-system-in-cloud-computing)
    - [Example 4: Client-Server Separation in Web Applications](#example-4-client-server-separation-in-web-applications)
- [REST](#rest)
  - [Understanding REST: The Core Principles](#understanding-rest-the-core-principles)
  - [Real-World Examples](#real-world-examples)
    - [Example 1: Retrieving User Data](#example-1-retrieving-user-data)
    - [Example 2: Creating a New Post](#example-2-creating-a-new-post)
- [Understanding HTTP Requests: Core Concepts](#understanding-http-requests-core-concepts)
  - [Real-World Examples](#real-world-examples-1)
    - [Example 1: Retrieving Data with a GET Request](#example-1-retrieving-data-with-a-get-request)
    - [Example 2: Creating Data with a POST Request](#example-2-creating-data-with-a-post-request)
- [Understanding HTTP Methods: Core Concepts](#understanding-http-methods-core-concepts)
  - [Real-World Examples](#real-world-examples-2)
    - [Example 1: GET - Retrieving User Information](#example-1-get---retrieving-user-information)
    - [Example 2: POST - Creating a New Comment](#example-2-post---creating-a-new-comment)
    - [Example 3: PUT - Updating a User's Email](#example-3-put---updating-a-users-email)
    - [Example 4: DELETE - Removing a File](#example-4-delete---removing-a-file)
    - [Example 5: PATCH - Updating a Product Price](#example-5-patch---updating-a-product-price)
    - [Example 6: HEAD - Checking Resource Metadata](#example-6-head---checking-resource-metadata)
- [Understanding HTTP Responses: Core Concepts](#understanding-http-responses-core-concepts)
  - [Real-World Examples](#real-world-examples-3)
    - [Example 1: Handling a Successful Response (200 OK)](#example-1-handling-a-successful-response-200-ok)
    - [Example 2: Handling Redirection (302 Found)](#example-2-handling-redirection-302-found)
    - [Example 3: Handling an Error Response (404 Not Found)](#example-3-handling-an-error-response-404-not-found)
- [Understanding HTTP Status Codes: Core Concepts](#understanding-http-status-codes-core-concepts)
  - [Real-World Examples](#real-world-examples-4)
    - [Example 1: Successful Response (200 OK)](#example-1-successful-response-200-ok)
    - [Example 2: Client Error (404 Not Found)](#example-2-client-error-404-not-found)
    - [Example 3: Redirection (301 Moved Permanently)](#example-3-redirection-301-moved-permanently)
    - [Example 4: Server Error (500 Internal Server Error)](#example-4-server-error-500-internal-server-error)
- [Creating Mock REST APIs with json-server](#creating-mock-rest-apis-with-json-server)
  - [Understanding json-server: Core Concepts](#understanding-json-server-core-concepts)
  - [Real-World Examples](#real-world-examples-5)
    - [Example 1: Creating a Simple Mock API](#example-1-creating-a-simple-mock-api)
    - [Example 2: Filtering Data with Query Parameters](#example-2-filtering-data-with-query-parameters)
    - [Example 3: Pagination and Limiting Results](#example-3-pagination-and-limiting-results)
- [Testing REST APIs using Postman](#testing-rest-apis-using-postman)
  - [Understanding Postman: Core Concepts](#understanding-postman-core-concepts)
  - [Real-World Examples](#real-world-examples-6)
    - [Example 1: Creating and Executing API Requests](#example-1-creating-and-executing-api-requests)
    - [Example 2: Organizing Requests into Collections](#example-2-organizing-requests-into-collections)
    - [Example 3: Writing Tests and Assertions](#example-3-writing-tests-and-assertions)

## Understanding APIs in Client-Server Communication

APIs act as intermediaries that enable different software components to communicate with each other in a standardized and structured manner. They define the methods, protocols, and data formats that clients (such as web browsers, mobile apps, or other servers) can use to request and receive information from servers. Here are the key aspects of APIs in client-server communication:

### 1. Abstraction of Complexity

APIs abstract the underlying complexity of server operations. This abstraction allows developers to interact with remote services without needing in-depth knowledge of how those services work internally. For instance, a weather application can fetch real-time weather data from a remote server via an API without needing to understand the intricacies of meteorological data processing.

### 2. Standardization

APIs provide a standardized way for clients to interact with servers. This standardization ensures that clients can communicate with a wide range of servers consistently. It defines the rules and protocols for sending requests, receiving responses, and interpreting data, making integration between disparate systems smoother and more predictable.

### 3. Data Exchange

APIs facilitate the exchange of data between clients and servers. Data can be transmitted in various formats, such as JSON, XML, or even binary data, depending on the API's design. This flexibility in data exchange formats allows developers to choose the most suitable format for their specific use case.

### Examples Illustrating the Role of APIs

Let's explore the role of APIs in client-server communication through two real-world examples:

#### Example 1: Twitter API

Consider a Twitter client application that displays a user's timeline. This application interacts with Twitter's servers via the Twitter API. Here's how the API's role breaks down:

- **Request**: The Twitter client sends a GET request to the Twitter API endpoint, specifying the user's timeline.
- **API Handling**: The Twitter API processes the request, retrieves the user's timeline data from its servers, and structures it according to the API's data format.
- **Response**: The Twitter API sends back the user's timeline data as a JSON response.
- **Client Handling**: The Twitter client receives the JSON data, parses it, and displays the user's timeline on the screen.

In this example, the Twitter API acts as a mediator that facilitates the exchange of data between the client application and Twitter's servers.

#### Example 2: Payment Gateway API

Imagine an e-commerce website that accepts credit card payments. To securely process payments, the website integrates with a payment gateway's API. Here's how the API's role unfolds:

- **Request**: When a customer makes a purchase and enters their payment details, the e-commerce website sends a POST request to the payment gateway API, including the payment information.
- **API Handling**: The payment gateway API processes the payment request, verifies the payment details, and communicates with the payment processor's servers to charge the customer's credit card.
- **Response**: The payment gateway API sends back a response to the e-commerce website, indicating whether the payment was successful or not.
- **Client Handling**: The e-commerce website receives the API response, updates the order status, and informs the customer about the payment outcome.

In this example, the payment gateway API plays a pivotal role in ensuring the secure processing of payments and seamless communication between the e-commerce website and the payment processor.

## The Core Rules of Client-Server Communication

1. **Statelessness**

   *Nuance*: Every client-server interaction should be independent, with no reliance on past interactions. The server doesn't retain any information about the client's state between requests.

   *Property*: Statelessness simplifies server architecture, enhances scalability, and allows servers to serve multiple clients concurrently.

   *Feature*: HTTP, the protocol commonly used in client-server communication, is inherently stateless. Each request from a client is independent and self-contained.

2. **Uniform Interface**

   *Nuance*: APIs should have a consistent and uniform way of interacting with them. Clients should understand how to use the API without needing to know the server's internal workings.

   *Property*: A uniform interface promotes simplicity, reusability, and ease of integration.

   *Feature*: HTTP's methods (GET, POST, PUT, DELETE) provide a standard and uniform way for clients to interact with resources on the server.

3. **Layered System**

   *Nuance*: Client and server communication can involve multiple intermediaries, such as proxies or gateways. Each intermediary is unaware of the details of the other intermediaries, creating a layered architecture.

   *Property*: A layered system improves scalability, security, and allows for better fault isolation.

   *Feature*: In a web application, a reverse proxy may sit between the client and the server, handling requests and responses without the client or server's direct knowledge.

4. **Client-Server Separation**

   *Nuance*: Clients and servers are distinct entities with separate responsibilities. Clients focus on user interfaces and user experiences, while servers handle data storage and processing.

   *Property*: Separation of concerns simplifies development, maintenance, and evolution of both clients and servers.

   *Feature*: In a web application, the client-side code (JavaScript) is responsible for rendering the user interface, while the server-side code (Node.js, Python, etc.) handles data retrieval and processing.

### Examples Illustrating the Rules

#### Example 1: Stateless Communication in HTTP

When a user visits a web page, their web browser sends an HTTP request to the server to fetch the page. This request is stateless, meaning the server treats it as an independent operation. The server processes the request, generates the HTML content, and sends it back to the client. Each request from the user's browser is self-contained and doesn't rely on previous interactions.

#### Example 2: Uniform Interface with RESTful APIs

RESTful APIs adhere to a uniform interface. They define a consistent set of HTTP methods for clients to perform actions on resources. For instance, a client can use a GET request to retrieve data, a POST request to create new data, and a PUT request to update existing data. This uniformity simplifies client-server interaction and allows clients to work with various APIs without learning unique methods for each one.

#### Example 3: Layered System in Cloud Computing

In cloud computing, multiple layers of infrastructure may be involved in client-server communication. For instance, a client application hosted on a user's device communicates with a server hosted in a data center. In between, there may be load balancers, firewalls, and content delivery networks (CDNs) that serve as intermediaries. Each layer plays a specific role and communicates with adjacent layers without awareness of the full architecture. This layered system allows for scalability, security, and fault tolerance.

#### Example 4: Client-Server Separation in Web Applications

In web applications, the separation between client-side and server-side code is evident. The client-side code, typically written in JavaScript, runs in the user's browser and is responsible for rendering the user interface and handling user interactions. The server-side code, such as Node.js or Python, manages data storage, performs business logic, and communicates with databases. This separation of concerns simplifies development, as front-end and back-end developers can work independently on their respective components.

## REST

REST (Representational State Transfer) is an architectural style that has revolutionized how web services and APIs are designed, providing a set of principles for creating scalable and efficient distributed systems.

### Understanding REST: The Core Principles

REST is founded on a set of core principles that guide the design of web services and APIs:

1. **Resource-Based**

   *Nuance*: In REST, everything is a resource, and each resource is identified by a unique URI (Uniform Resource Identifier). Resources can represent real-world entities, such as users, products, or documents.

   *Property*: Resource-based design provides a clear structure to the API and makes it easy for clients to locate and interact with resources.

   *Feature*: An example URI for a user resource might be `https://api.example.com/users/123`, where `123` is the user's unique identifier.

2. **Stateless Communication**

   *Nuance*: Every client-server interaction must be self-contained, with no server retaining any information about the client's state between requests. All necessary information should be included in the request.

   *Property*: Stateless communication simplifies server architecture, enhances scalability, and allows for fault tolerance.

   *Feature*: Each HTTP request to a RESTful API contains all the details required to understand and process the request. No session state is maintained on the server.

3. **HTTP Methods**

   *Nuance*: REST relies on standard HTTP methods, such as GET, POST, PUT, DELETE, to perform actions on resources. Each method has a specific purpose: GET for retrieval, POST for creation, PUT for updating, and DELETE for removal.

   *Property*: Standard methods provide a clear and consistent interface for clients to interact with resources.

   *Feature*: To retrieve a user's data, a client sends a GET request to the user's URI. To update the user's information, a PUT request is sent to the same URI.

4. **Representation**

   *Nuance*: Resources can have multiple representations, such as JSON, XML, HTML, or others. Clients request a specific representation using content negotiation through headers like `Accept`.

   *Property*: Representation flexibility allows clients to receive data in a format they prefer or can work with.

   *Feature*: By specifying `Accept: application/json` in an HTTP request header, a client can request JSON-formatted data from the server.

### Real-World Examples

Let's explore REST's nuances and features through practical examples:

#### Example 1: Retrieving User Data

Consider a RESTful API for a social networking platform. To retrieve a user's profile, a client sends a GET request to the user's resource URL, e.g., `https://api.example.com/users/123`.

```http
GET /users/123 HTTP/1.1
Host: api.example.com
```

The server responds with a representation of the user's profile in JSON format:

```json
{
   "id": 123,
   "username": "johndoe",
   "name": "John Doe",
   "email": "john@example.com"
}
```

#### Example 2: Creating a New Post

In the same social networking platform, creating a new post involves sending a POST request to the posts collection resource, e.g., `https://api.example.com/posts`.

```http
POST /posts HTTP/1.1
Host: api.example.com
Content-Type: application/json

{
   "text": "Hello, World!",
   "author": 123
}
```

The server processes the request and responds with a representation of the newly created post:

```json
{
   "id": 456,
   "text": "Hello, World!",
   "author": 123,
   "timestamp": "2023-04-10T15:30:00Z"
}
```

## Understanding HTTP Requests: Core Concepts

HTTP requests are at the heart of client-server communication on the web. They follow a structured format and convey the intent of a client to a server. Let's delve into the essential concepts:

1. **HTTP Methods**

   *Nuance*: HTTP methods specify the action to be performed on a resource. Common methods include GET (retrieve data), POST (create new data), PUT (update data), and DELETE (remove data).

   *Property*: Each method has a specific purpose, ensuring clear and consistent interactions with resources.

   *Feature*: A GET request retrieves data, while a POST request creates a new resource on the server.

2. **Request URI**

   *Nuance*: The Request URI (Uniform Resource Identifier) is the address of the resource on the server. It helps the server understand which resource the client wants to interact with.

   *Property*: The Request URI is a critical component of an HTTP request, allowing the server to identify and locate the resource.

   *Feature*: A request to retrieve user information might have a Request URI like `https://api.example.com/users/123`, where `123` is the unique identifier of the user.

3. **Request Headers**

   *Nuance*: Request headers contain additional information about the request, such as the client's identity, preferred content type, or authentication credentials.

   *Property*: Headers provide context and customization options for the request, enabling clients to communicate their requirements to the server.

   *Feature*: The `Content-Type` header specifies the format of the data being sent in a request, e.g., JSON or XML.

4. **Request Body**

   *Nuance*: The request body carries data sent from the client to the server, typically used in POST and PUT requests. It can contain information such as form data, JSON, or XML payloads.

   *Property*: The request body allows clients to transmit data to the server for processing or storage.

   *Feature*: In a POST request to create a new user, the request body might include JSON data with user details.

### Real-World Examples

Let's explore HTTP requests with real-world examples to illustrate their nuances and features:

#### Example 1: Retrieving Data with a GET Request

Imagine a weather application that fetches weather data from a remote server. To retrieve the current weather for a specific location, the application sends a GET request.

```http
GET /weather?location=NewYork HTTP/1.1
Host: api.example.com
```

In this example, the `GET` method is used to request data, and the query parameter `location=NewYork` specifies the location for which weather data is desired.

#### Example 2: Creating Data with a POST Request

Consider a social media platform where users can post updates. To create a new post, the client sends a POST request with the post content in the request body.

```http
POST /posts HTTP/1.1
Host: api.example.com
Content-Type: application/json

{
   "text": "Hello, world!",
   "author": "user123"
}
```

Here, the `POST` method is used to create a new resource (a post), and the JSON data in the request body contains the post content.

## Understanding HTTP Methods: Core Concepts

HTTP methods, also known as HTTP verbs, specify the action a client wants to perform on a resource. Here are the core HTTP methods and their nuanced properties:

1. **GET Method**

   *Nuance*: The GET method is used for retrieving data from a resource on the server. It should not have any side effects on the resource.

   *Property*: GET requests are idempotent, meaning that multiple identical requests will have the same effect as a single request.

   *Feature*: A typical example is a web browser fetching a web page using a GET request.

2. **POST Method**

   *Nuance*: POST is used for creating new resources on the server. It may have side effects, such as creating a new database record or generating a transaction.

   *Property*: POST requests are not idempotent, as submitting the same request multiple times may result in multiple resource creations.

   *Feature*: In an online store, a POST request is used when a user submits an order to create a new order resource.

3. **PUT Method**

   *Nuance*: PUT is used for updating or replacing an existing resource on the server. If the resource does not exist, it may be created.

   *Property*: PUT requests are idempotent; sending the same request multiple times should result in the same state.

   *Feature*: A PUT request might be employed to update a user's profile information on a web service.

4. **DELETE Method**

   *Nuance*: DELETE is used to remove a resource from the server. It should not have any side effects beyond resource removal.

   *Property*: DELETE requests are idempotent; removing a resource multiple times does not change the outcome.

   *Feature*: Deleting a user account or a file on a cloud storage service can be achieved using DELETE.

5. **PATCH Method**

   *Nuance*: PATCH is used for making partial modifications to an existing resource. It is useful when updating specific fields of a resource.

   *Property*: PATCH requests are typically idempotent, as long as the same patch operation is applied repeatedly.

   *Feature*: Patching a user's password or updating a specific attribute of an entity are common use cases for PATCH.

6. **HEAD Method**

   *Nuance*: HEAD is similar to GET but retrieves only the headers of a resource, excluding the body. It is used to check resource metadata without transferring the data itself.

   *Property*: HEAD requests are idempotent and safe, as they do not modify the resource.

   *Feature*: Checking the last modification date of a web page using a HEAD request to determine if it has been updated.

### Real-World Examples

Let's explore HTTP methods with real-world examples to highlight their nuances and features:

#### Example 1: GET - Retrieving User Information

A user wants to view their profile on a social media platform. The client sends a GET request to retrieve their profile data:

```http
GET /users/123 HTTP/1.1
Host: api.example.com
```

The server responds with the user's profile information.

#### Example 2: POST - Creating a New Comment

A user wishes to post a comment on a blog. The client sends a POST request to create a new comment:

```http
POST /comments HTTP/1.1
Host: api.example.com
Content-Type: application/json

{
   "text": "Great article!",
   "author": "user456",
   "post_id": 789
}
```

The server creates a new comment resource and returns a confirmation.

#### Example 3: PUT - Updating a User's Email

A user wants to update their email address. The client sends a PUT request to modify the user's information:

```http
PUT /users/123 HTTP/1.1
Host: api.example.com
Content-Type: application/json

{
   "email": "new.email@example.com"
}
```

The server replaces the user's email address with the new one.

#### Example 4: DELETE - Removing a File

A user wants to delete a file from a cloud storage service. The client sends a DELETE request:

```http
DELETE /files/document.pdf HTTP/1.1
Host: api.example.com
```

The server deletes the specified file from the storage.

#### Example 5: PATCH - Updating a Product Price

An administrator wants to update the price of a product in an e-commerce platform. The client sends a PATCH request to modify the product's price:

```http
PATCH /products/789 HTTP/1.1
Host: api.example.com
Content-Type: application/json-patch+json

[
   { "op": "replace", "path": "/price", "value": 29.99 }
]
```

The server applies the partial update to the product resource.

#### Example 6: HEAD - Checking Resource Metadata

A client wants to check if a web page has been modified since their last visit. They send a HEAD request:

```http
HEAD /articles/latest HTTP/1.1
Host: example.com
```

The server responds with the headers, allowing the client to check the last-modified timestamp.

## Understanding HTTP Responses: Core Concepts

HTTP responses are generated by servers to fulfill client requests. They contain essential information about the outcome of the request and, often, data for the client to use. Here are the core concepts of handling HTTP responses:

1. **Status Codes**

   *Nuance*: Status codes are three-digit numbers that indicate the outcome of an HTTP request. They are grouped into five classes, each having a specific significance.

   *Property*: Status codes provide a standardized way to communicate the result of a request, helping clients understand what happened.

   *Feature*: A common status code is `200 OK`, indicating a successful request, while `404 Not Found` signifies that the requested resource was not located.

2. **Response Headers**

   *Nuance*: Response headers provide metadata about the response, such as the server type, content type, and caching instructions.

   *Property*: Headers offer crucial information for interpreting and processing the response on the client side.

   *Feature*: The `Content-Type` header specifies the format of the response data, such as JSON or HTML.

3. **Response Body**

   *Nuance*: The response body contains the actual data returned by the server, which can be in various formats, including JSON, XML, HTML, or plain text.

   *Property*: The response body carries the payload of the response, which clients extract and use as needed.

   *Feature*: In a JSON API, the response body might contain user data, product information, or any other requested data.

4. **Redirection**

   *Nuance*: Sometimes, servers respond with redirection status codes (e.g., `301 Moved Permanently` or `302 Found`) to instruct the client to make a new request to a different URL.

   *Property*: Redirection enables servers to guide clients to the appropriate resource or location.

   *Feature*: When a user accesses a deleted webpage, they may be redirected to a "Not Found" page to maintain a user-friendly experience.

5. **Error Handling**

   *Nuance*: Servers return error status codes (e.g., `400 Bad Request` or `500 Internal Server Error`) to indicate problems with the client request or server processing.

   *Property*: Proper error handling is crucial for diagnosing and resolving issues in web applications.

   *Feature*: An API might return a `422 Unprocessable Entity` status code if a client sends invalid data for a resource creation request.

### Real-World Examples

Let's explore the handling of HTTP responses with real-world examples to illustrate their nuances and features:

#### Example 1: Handling a Successful Response (200 OK)

A web application retrieves user data from a server. Upon receiving a `200 OK` response, the client parses and displays the user's information.

```http
HTTP/1.1 200 OK
Content-Type: application/json

{
   "id": 123,
   "username": "johndoe",
   "email": "john@example.com"
}
```

The client extracts the JSON data from the response body and renders it on the user interface.

#### Example 2: Handling Redirection (302 Found)

A web browser requests a resource that has been moved to a new URL. The server responds with a `302 Found` status code and a `Location` header.

```http
HTTP/1.1 302 Found
Location: https://example.com/new-resource
```

The browser follows the redirection by making a new request to the provided URL, ensuring the user reaches the correct resource.

#### Example 3: Handling an Error Response (404 Not Found)

A user attempts to access a non-existent page on a website. The server responds with a `404 Not Found` status code and an HTML response body containing an error message.

```http
HTTP/1.1 404 Not Found
Content-Type: text/html

<!DOCTYPE html>
<html>
   <head>
      <title>Page Not Found</title>
   </head>
   <body>
      <h1>404 - Page Not Found</h1>
      <p>The requested page does not exist.</p>
   </body>
</html>
```

The client displays the error message to the user, informing them of the issue.

## Understanding HTTP Status Codes: Core Concepts

HTTP status codes are three-digit numerical values returned by web servers in response to client requests. They provide essential information about the outcome of the request and guide clients on how to proceed. Here are the core concepts of HTTP status codes:

1. **Status Code Classes**

   *Nuance*: HTTP status codes are grouped into five classes, each with a specific meaning:
   - 1xx (Informational): Indicates that the request was received and is continuing.
   - 2xx (Successful): Indicates that the request was successfully received, understood, and accepted.
   - 3xx (Redirection): Indicates that further action is needed to complete the request.
   - 4xx (Client Error): Indicates that the request contains bad syntax or cannot be fulfilled by the server.
   - 5xx (Server Error): Indicates that the server failed to fulfill a valid request.

   *Property*: Status code classes provide a high-level categorization of responses, aiding in quick understanding of the server's intention.

   *Feature*: A `404 Not Found` belongs to the 4xx class, indicating a client error, while a `200 OK` belongs to the 2xx class, signifying success.

2. **Specific Status Codes**

   *Nuance*: Each status code within a class has a specific meaning and purpose. For instance, `200 OK` indicates a successful request, while `403 Forbidden` means that the client does not have permission to access the requested resource.

   *Property*: Specific status codes offer detailed information about the nature of the response and the required actions.

   *Feature*: A `302 Found` status code instructs the client to perform redirection, while a `503 Service Unavailable` indicates temporary unavailability of the server.

3. **Informational Status Codes (1xx)**

   *Nuance*: Informational codes are used to convey preliminary information about a request's status before it is completed.

   *Property*: They provide feedback to the client about the request's progress, such as `100 Continue` indicating that the server is ready to receive the request body.

   *Feature*: An HTTP request might initially receive a `100 Continue` response before proceeding with sending the request body.

### Real-World Examples

Let's explore HTTP status codes with real-world examples to illustrate their nuances and features:

#### Example 1: Successful Response (200 OK)

A client requests a resource, and the server successfully fulfills the request. The server responds with a `200 OK` status code.

```http
HTTP/1.1 200 OK
Content-Type: application/json

{
   "message": "Resource retrieved successfully",
   "data": {...}
}
```

The client interprets the `200 OK` status code and processes the data in the response body.

#### Example 2: Client Error (404 Not Found)

A user attempts to access a non-existent URL. The server responds with a `404 Not Found` status code.

```http
HTTP/1.1 404 Not Found
Content-Type: text/html

<!DOCTYPE html>
<html>
   <head>
      <title>Page Not Found</title>
   </head>
   <body>
      <h1>404 - Page Not Found</h1>
      <p>The requested page does not exist.</p>
   </body>
</html>
```

The client displays an error message, notifying the user that the requested resource does not exist.

#### Example 3: Redirection (301 Moved Permanently)

A website migrates to a new domain, and users access the old URL. The server responds with a `301 Moved Permanently` status code and provides the new URL in the `Location` header.

```http
HTTP/1.1 301 Moved Permanently
Location: https://new-domain.com/new-url
```

The client automatically redirects the user to the new URL to maintain accessibility.

#### Example 4: Server Error (500 Internal Server Error)

A client sends a valid request to a server, but the server encounters an unexpected error. The server responds with a `500 Internal Server Error` status code.

```http
HTTP/1.1 500 Internal Server Error
Content-Type: text/plain

Internal Server Error: An unexpected error occurred on the server.
```

The client displays an error message and may report the issue to the server administrators.

## Creating Mock REST APIs with json-server

### Understanding json-server: Core Concepts

json-server is a lightweight Node.js-based tool that allows you to create a fully functional RESTful API using a JSON file as the data source. Here are the core concepts of json-server:

1. **JSON Data File**

   *Nuance*: json-server uses a JSON file as the data source, which contains the initial data for your mock API.

   *Property*: Using a JSON file simplifies data management and allows for easy modification of the API's data.

   *Feature*: A typical data file might contain an array of JSON objects, such as `users` or `posts`, to represent resources.

2. **Resource Routes**

   *Nuance*: json-server automatically generates RESTful routes for each resource in your JSON data file. It follows conventions like `/resource` for listing and `/resource/:id` for single resource retrieval.

   *Property*: Resource routes are created dynamically, saving developers from manual route configuration.

   *Feature*: If your JSON data file contains an array of users, json-server automatically creates routes like `/users` and `/users/:id`.

3. **Query Parameters**

   *Nuance*: json-server allows clients to filter, sort, and paginate data by providing query parameters in the request URL.

   *Property*: Query parameters provide clients with flexible ways to retrieve and manipulate data.

   *Feature*: Clients can use query parameters like `?_page=1&_limit=10` to request the first 10 items from a paginated list.

4. **CRUD Operations**

   *Nuance*: json-server supports the full range of CRUD (Create, Read, Update, Delete) operations. Clients can use HTTP methods (GET, POST, PUT, DELETE) to interact with resources.

   *Property*: Full CRUD support allows developers to mimic real API behavior accurately.

   *Feature*: Clients can create new resources with POST, update existing ones with PUT, and delete them with DELETE.

### Real-World Examples

Let's explore json-server with real-world examples to illustrate its nuances and features:

#### Example 1: Creating a Simple Mock API

To create a simple mock API for managing a list of tasks, start with a JSON data file (`db.json`) containing the initial data:

```json
{
  "tasks": [
    { "id": 1, "title": "Complete project", "completed": false },
    { "id": 2, "title": "Review code", "completed": true }
  ]
}
```

Run json-server with the following command:

```bash
json-server --watch db.json
```

This starts a server with RESTful routes for the `tasks` resource. You can perform GET, POST, PUT, and DELETE operations on tasks by making HTTP requests to the appropriate routes.

#### Example 2: Filtering Data with Query Parameters

You want to retrieve all completed tasks from the mock API. Use query parameters to filter the data:

```http
GET /tasks?completed=true
```

json-server responds with a JSON array containing completed tasks.

#### Example 3: Pagination and Limiting Results

You need to paginate the tasks and limit each page to five items. Include `_page` and `_limit` query parameters:

```http
GET /tasks?_page=1&_limit=5
```

json-server returns the first five tasks in the data.

## Testing REST APIs using Postman

### Understanding Postman: Core Concepts

Postman is a feature-rich API testing and development environment that streamlines API testing and automation. To effectively test REST APIs with Postman, you need to grasp the following core concepts:

1. **API Requests and Collections**

   *Nuance*: In Postman, you create API requests to interact with RESTful endpoints. These requests can be organized into collections, making it easy to manage and execute multiple requests together.

   *Property*: Collections allow you to group related requests, helping maintain order and clarity in your testing process.

   *Feature*: You can create collections for specific features or modules of your application and store relevant requests within them.

2. **HTTP Methods and Endpoints**

   *Nuance*: Postman supports various HTTP methods (GET, POST, PUT, DELETE, etc.) to perform different actions on API endpoints (URLs).

   *Property*: It allows you to choose the appropriate HTTP method for each request, reflecting the intended action on the API resource.

   *Feature*: You can easily switch between HTTP methods in Postman to perform actions such as retrieving data, creating new resources, updating existing ones, or deleting resources.

3. **Request Headers and Parameters**

   *Nuance*: Postman enables you to define request headers and parameters, including authentication tokens, content types, and query parameters.

   *Property*: Customizing headers and parameters allows you to send tailored requests to the API, simulating real-world scenarios.

   *Feature*: You can set headers like `Authorization` for authentication and include query parameters to filter or paginate data.

4. **Assertions and Tests**

   *Nuance*: Postman allows you to write tests using JavaScript to validate API responses. You can define assertions to check specific conditions within the response.

   *Property*: Tests ensure that API responses meet expected criteria, providing automated verification of functionality.

   *Feature*: You can create tests for status codes, response body content, headers, and more to verify API behavior.

### Real-World Examples

Let's explore Postman with real-world examples to illustrate its nuances and features:

#### Example 1: Creating and Executing API Requests

1. Open Postman and create a new request.

2. Set the request method to `GET` and enter the API endpoint URL, e.g., `https://api.example.com/users`.

3. Add headers like `Content-Type: application/json` or `Authorization: Bearer <token>` as needed.

4. Click the "Send" button to execute the request.

Postman sends the request to the API and displays the response, including the status code, headers, and response body.

#### Example 2: Organizing Requests into Collections

1. Create a new collection in Postman, e.g., "User Management."

2. Add multiple requests related to user management, such as "Get User," "Create User," "Update User," and "Delete User," to the collection.

3. Run the entire collection to execute all requests at once.

Postman runs each request sequentially and provides a summary of the results for the entire collection.

#### Example 3: Writing Tests and Assertions

1. In a request, open the "Tests" tab.

2. Write JavaScript tests to validate the API response. For instance, to check if the status code is 200:

    ```javascript
    pm.test("Status code is 200", function () {
        pm.response.to.have.status(200);
    });
    ```

3. Execute the request, and Postman will run the tests automatically.

If the status code is not 200, Postman will display a test failure message.
