## Fetch Blog Posts

Ensure `json-server` is started and serving the API `posts` with data loaded from `db.json` file.

By default `json-server` runs on port number 3000.

1. Fetch all posts
- Request URL --> http://localhost:3000/posts
- HTTP Method --> GET
- Response Expected --> Array of JSON
    ```json
    [
        {
        "id": 1,
        "title": "json-server",
        "author": "typicode"
        },
        {
        "id": 2,
        "title": "rest-api",
        "author": "typicode"
        }
    ]
    ```
    - Status Code --> 200
    - Status Message --> OK
2. Fetch post with id 1
- ID is specified as parameter in the URL in the format `http://localhost:3000/posts/{id}`
- Request URL --> http://localhost:3000/posts/1
- HTTP Method --> GET
- Response Expected --> JSON Object
    ```json
    {
        "id": 1,
        "title": "json-server",
        "author": "typicode"
    }
    ```
    - Status Code --> 200
    - Status Message --> OK
3. Fetch post with title "json-server"
- title is specified as query string parameter in the URL in the format `http://localhost:3000/posts?name=value`
- Request URL --> http://localhost:3000/posts?title=json-server
- HTTP Method --> GET
- Response Expected --> JSON Array
    ```json
    [
        {
            "id": 1,
            "title": "json-server",
            "author": "typicode"
        }
    ]
    ```
    - Status Code --> 200
    - Status Message --> OK
4. Fetch post with invalid id
- Request URL --> http://localhost:3000/posts/101
- HTTP Method --> GET
- Response Expected --> JSON Object
    ```json
    {}    
    ```
    - Status Code --> 404
    - Status Message --> Not Found
8. Check the status code with the request made with incorrect port number.
- Request URL --> http://localhost:300/posts
- HTTP Method --> GET
- Response Expected --> `Error: connect ECONNREFUSED 127.0.0.1:300`
9. Check the status code with the request made with incorrect resource name.
- Request URL --> http://localhost:3000/blogs
- HTTP Method --> GET
- Response Expected --> JSON Object
    ```json
    {}    
    ```
    - Status Code --> 404
    - Status Message --> Not Found