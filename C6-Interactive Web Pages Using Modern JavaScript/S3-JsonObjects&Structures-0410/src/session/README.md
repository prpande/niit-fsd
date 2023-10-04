## Sprint 3  : Model Real World Data Using Objects

### This sprint has 5 demos

[**Demo 1 :: Create JSON and Validate it**](demo-1-simple-json.json)

##### Problem Statement

Create simple JSON data that represents a single movie with details given below:

| Movie Title        | Year Of Release | Genre  | Is On OTT |
| ----------------- | ------------- | ------ | ------- |
| Top Gun: Maverick | 2022          | action | false   |

**Note: The JSON key names should follow the lowerCamelCase convention and should not include any symbols or spaces (except underscore)**

Validate the json using online validator at https://jsonlint.com/.

[**Demo 2 :: Create JSON Array and Validate it**](demo-2-json-array.json)

##### Problem Statement

Create JSON array that represents list of movies with details given below: 

| Movie Title        | Year Of Release | Genre  | Is On OTT |
| ----------------------- | ------------- | --------- | ------- |
| Top Gun: Maverick       | 2022          | action    | false   |
| Spider-Man: No Way Home | 2021          | adventure | true    |

Validate the json using online validator at https://jsonlint.com/. 

**Note: The JSON key names should follow the lowerCamelCase convention and should not include any symbols or spaces (except underscore)**

[**Demo 3 :: Create complex JSON and Validate it**](demo-3-complex-json.json)

##### Problem Statement

Create complex JSON data using arrays and objects to represent the list of movies where each movie contains array of movie star cast.

| movieTitle              | yearOfRelease | director        | cast 1 | cast 2  | cast 3 | genre     | isOnOTT |
| ----------------------- | ------------- | --------------- | ---------------- | ------------------- | ----------------- |----------------- |  ------------------- |  
| Top Gun: Maverick       | 2022          | Joseph Kosinski | Actor Name -> Tom Cruise<br/>Screen Name -> Capt. Pete | Actor Name -> Jennifer Connelly<br/>Screen Name -> Penny Benjamin | Actor Name -> Miles Teller<br/>Screen Name -> Lt. Bradley | action    | false   |
| Spider-Man: No Way Home | 2021          | Jon Watts       | Actor Name -> Tom Holland<br/>Screen Name -> Peter Parker        | Actor Name -> Zendaya<br/>Screen Name -> MJ                  |   | adventure | true    |

**Here, in the table, Cast 1, Cast 2 and Cast 3 should be defined as 3 elements of `cast` array. Each element would be an object with two properties `Actor Name` and `Screen Name`**

Validate the json using online validator at https://jsonlint.com/. 

**Note: The JSON key names should follow the lowerCamelCase convention and should not include any symbols or spaces (except underscore)**

[**Demo 4 :: Convert JavaScript Object to JSON**](demo-4-js-to-json.js)

##### Problem Statement

Write JavaScript program to convert JavaScript object to JSON.

The JavaScript object is created to represent a customer with following details:

| firstName | lastName | email              | age | phoneNumbers.0 | phoneNumbers.1 | phoneNumbers.2 | address.streetNumber | address.streetName | address.city | address.state | address.postalCode |
| --------- | -------- | ------------------ | --- | -------------- | -------------- | -------------- | -------------------- | ------------------ | ------------ | ------------- | ------------------ |
| Robert    | Johnson  | robert.j@gmail.com | NaN | +12055110415   | +12514120145   | +12565130876   | 252a                 | Hale Hall          | Huntsville   | Alabama       | AL                 |

Convert the object to JSON and display the converted value.

Also display the type for both JavaScript Object and converted JSON.

[**Demo 5 :: Convert JSON to JavaScript Object**](demo-5-json-to-js.js)

##### Problem Statement

Write JavaScript program to convert JavaScript object to JSON.

The JSON for Order with below details is provided:

| orderId | orderDate  | customerName | products.0.productName | products.0.quantity | products.0.inStock | products.0.perUnitPrice |
| ------- | ---------- | ------------ | ---------------------- | ------------------- | ------------------ | ----------------------- |
| ABN0034 | 05-10-2021 | Roger Smith  | laptopBag              | 4                   | true               | 15                      |

**Note: Here `products.0.XXX` indicates products is an array of object with `productName`, `quantity`, `inStock` and `perUnitPrice` properties

Convert the JSON to JavaScript object and display the converted value.

Also display the type for both JSON and converted JavaScript Object.