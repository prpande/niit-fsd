## Delete Blog Post

Ensure `json-server` is started and serving the API `posts` with data loaded from `db.json` file.

By default `json-server` runs on port number 3000.

1. Update post with id 2
- Request URL --> http://localhost:3000/posts/2
- HTTP Method --> DELETE
- Response Expected --> JSON Object
    ```json
    {}
    ```
    - Status Code --> 200
    - Status Message --> OK
2. Update post with id 22
- Request URL --> http://localhost:3000/posts/22
- HTTP Method --> DELETE
- Response Expected --> JSON Object
    ```json
    {}    
    ```
    - Status Code --> 404
    - Status Message --> Not Found