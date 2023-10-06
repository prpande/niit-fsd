## Save Blog Post

Ensure `json-server` is started and serving the API `posts` with data loaded from `db.json` file.

By default `json-server` runs on port number 3000.

1. Save post
- Request URL --> http://localhost:3000/posts
- HTTP Method --> POST
- Request Body
    - Content Type --> JSON
    - Body
    ```json
    {
        "id": 3,
        "title": "json",
        "author": "smith",
        "isPublic": true,
        "keywords": ["json", "javascript", "object", "json-server"]
    }
    ```
- Response Expected --> JSON Object
    ```json
    {
        "id": 3,
        "title": "json",
        "author": "smith",
        "isPublic": true,
        "keywords": ["json", "javascript", "object", "json-server"]
    }
    ```
    - Status Code --> 201
    - Status Message --> Created
2. Save post with duplicate id
- Request URL --> http://localhost:3000/posts
- HTTP Method --> POST
- Request Body
    - Content Type --> JSON
    - Body
    ```json
    {
        "id": 2,
        "title": "rest-api",
        "author": "smith",
        "isPublic": true,
        "keywords": ["rest", "api", "http", "post"]
    }
    ```
- Response Expected --> Error
    - Error Message --> Error: Insert failed, duplicate id
    - Status Code --> 500
    - Status Message --> Internal Server Error