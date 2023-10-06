## Sprint 4 : Implement Stateless Communication using REST APIs and JSON

### This sprint has 6 demos

[**Demo 1 :: Install `json-server`**](demo-1-install-json-server.md)

##### Problem Statement

Download and install `Node.js` to install `npm` tool and run `json-server`.

Use the npm tool to install `json-server`

Check the installation using the command `json-server –version`.

- Start `json-server` on default port with existing db.json file.
- Start `json-server` on default port with non-existing db.json file.
- Start `json-server` on a different port with existing db.json file.

[**Demo 2 ::Install Postman**](demo-2-install-postman.md)

##### Problem Statement

Download Postman app from https://www.postman.com/downloads/ and install the desktop version of Postman tool.

[**Demo 3 :: Fetch Blog Posts**](demo-3-fetch-blog-posts.md)

##### Problem Statement

Using Postman app:
- Fetch all posts
- Fetch post with id 1
- Fetch post with title `json-server`
- Check the status code for success for each of the fetch requests.
- Check the status code if post is fetched with incorrect id.
- Check the status code with the request made with incorrect port number.
- Check the status code with the request made with incorrect resource name.

[**Demo 4 :: Save Blog Post**](demo-4-save-blog-post.md)

##### Problem Statement

Using Postman make HTTP POST request to save blog post with following details:
- id: 2
- title: "rest-api"
- author: "smith"
- isPublic: true
- keywords: ["rest", "api", "http", "post"] 

Check the status code for success of the post request.

Check the status code if the blog post with duplicate id is posted.

[**Demo 5 :: Update Blog Post**](demo-5-update-blog-post.md)

##### Problem Statement

Using Postman make HTTP PUT request to update blog post with id 2 with following details:
- title: "rest api"
- author: "smith rogers"
- isPublic: false
- keywords: ["rest","api","http","post", "put"]
 
Check the status code when the request is successful.
Check the status code if request is sent with incorrect id.

[**Demo 6 :: Delete Blog Post**](demo-6-delete-blog-post.md)

##### Problem Statement

Using Postman make HTTP DELETE request to update blog post with id 2

Check the status code when the request is successful.

Check the status code if request is made with incorrect id.