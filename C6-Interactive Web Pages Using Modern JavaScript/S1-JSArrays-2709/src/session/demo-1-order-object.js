const order = { orderNumber: "S001", orderDate: "12-Dec-2022", itemName: "Chicken Burger",
quantity: 2, price: 3.5, customerName: "James"};

function displayObjectProperties(obj) {
    console.log("Displaying car property values");
    console.log(`make: ${obj.orderNumber}`);
    console.log(`model: ${obj.orderDate}`);
    console.log(`color: ${obj.itemName}`);
    console.log(`year: ${obj.quantity}`);
    console.log(`year: ${obj.price}`);
    console.log(`year: ${obj.customerName}`);

}
displayObjectProperties(order);

