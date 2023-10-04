const orderJSON = '{"orderId": "ABN0034", "orderDate": "05-10-2021", "customerName": "Roger Smith", "products": [{ "productName": "laptopBag","quantity":4,"inStock":true,"perUnitPrice": 15}]}';
console.log(orderJSON); // prints details in string format
console.log(typeof orderJSON); // string

const order = JSON.parse(orderJSON);
console.log(order); // prints details in object notation
console.log(typeof order); // object 