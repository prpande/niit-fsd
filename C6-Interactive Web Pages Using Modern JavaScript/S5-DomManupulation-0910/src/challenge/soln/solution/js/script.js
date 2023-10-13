// Write solution code here to dynamically add the form fields 
const ordersList = []; // uber object tracking all the orders
let orderedItems = []; // array tracking the items ordered in the current order

const cxDataFormElement = document.getElementById("customerDetails"); // customer data form element
const orderDataFormTable = document.getElementById("orderData"); // element containing ordered items and respective elements
const totalAmountElement = document.getElementById("totalAmount"); // readonly total amount text input element
const orderNowButtonElement = document.getElementById("orderNowButton"); // order now button element

// Returns a table entry for adding new items
// Name and type accepted as parameters for the created input element
function createOrderTableEntry(name, type) {
    let itemElement = document.createElement("input");
    itemElement.name = name;
    itemElement.type = type;
    itemElement.required = true;
    if(type == "number")
    {        
        itemElement.min = 0;
    }
    itemElement.classList.add("bottomBorderOnly", "tableWidth");

    let orderTableItemElement = document.createElement("td");
    orderTableItemElement.appendChild(itemElement);
    return orderTableItemElement;
}

// Returns a button element to add items to the order
function createAddOrderButton() {
    let addOrderButtonElement = document.createElement("button");
    addOrderButtonElement.classList.add("addOrderButton");
    addOrderButtonElement.textContent = "Add";

    let addOrderButtonTdElement = document.createElement("td");
    addOrderButtonTdElement.appendChild(addOrderButtonElement);
    return addOrderButtonTdElement;
}

// Calculates and updates the amount for individual items
// Input parameters are price per item and quantity
function updateAmountElement(price, quantity, amountElement) {
    amountElement.value = parseFloat((price * quantity).toFixed(2));
}

// Sets up event listeners to update the item amount on price per item and quantity value changes by the user
function setupAmountUpdateEvent(priceElement, quantityElement, amountElement) {
    priceElement.addEventListener("change", event => {
        updateAmountElement(priceElement.value, quantityElement.value, amountElement)
    });
    quantityElement.addEventListener("change", event => {
        updateAmountElement(priceElement.value, quantityElement.value, amountElement)
    });
}

// Checks if the order inputs are valid
function checkOrderItemsValidity(addItemTrElement) {
    return Array.from(addItemTrElement
        .getElementsByTagName("input"))
        .reduce((list, element) => {
            if(!element.checkValidity()){
                list.push(element.name);
            }
            return list;
        }, [])
}
// Set up the listener when an item is added to the order
function setupAddItemEvent(addItemTrElement, addOrderButtonElement) {
    addOrderButtonElement.addEventListener("click", event => {
        let itemObj = {};
        let invalidItems = checkOrderItemsValidity(addItemTrElement);
        if(invalidItems.length > 0)
        {
            let msg = `!! Invalid Order !!\nPlease input correct values for the following items: ${invalidItems.join(", ")}.`;
            alert(msg);
            console.log(msg);
            return false;
        }

        for (child of addItemTrElement.getElementsByTagName("input")) {
            child.readOnly = true;
            itemObj[child.name] = child.value;
        }
        addOrderButtonElement.disabled = true;
        orderedItems.push(itemObj);
        console.log("Added item:");
        console.log(itemObj);
        updateTotalAmount(itemObj.amount);
    })
}

// Creates element and the row form view to add a new item to the order
function addNewItemOrderRow() {
    let categoryNameTdElement = createOrderTableEntry("categoryName", "text")
    let itemNameTdElement = createOrderTableEntry("itemName", "text")
    let priceTdElement = createOrderTableEntry("price", "number")    
    let quantityTdElement = createOrderTableEntry("quantity", "number")

    let amountTdElement = createOrderTableEntry("amount", "number")
    let amountElement = amountTdElement.firstElementChild;
    amountElement.readOnly = true;

    priceTdElement.firstElementChild.step = "0.01";
    amountElement.step = "0.01";
    
    updateAmountElement(0, 0, amountElement);

    let addOrderButtonTdElement = createAddOrderButton();

    setupAmountUpdateEvent(priceTdElement.firstElementChild, quantityTdElement.firstElementChild, amountElement);

    let addItemTrElement = document.createElement("tr");
    addItemTrElement.appendChild(categoryNameTdElement);
    addItemTrElement.appendChild(itemNameTdElement);
    addItemTrElement.appendChild(priceTdElement);
    addItemTrElement.appendChild(quantityTdElement);
    addItemTrElement.appendChild(amountTdElement);
    addItemTrElement.appendChild(addOrderButtonTdElement);

    setupAddItemEvent(addItemTrElement, addOrderButtonTdElement.firstElementChild);

    orderDataFormTable.appendChild(addItemTrElement);
}

// Updates the total amount box according to the input amount
function updateTotalAmount(amountToAdd) {
    totalAmountElement.value = parseFloat(totalAmountElement.value) + parseFloat(amountToAdd);
}

// Resets the forms and variables tracking the current order
function resetPage() {
    cxDataFormElement.reset();
    totalAmountElement.value = 0;
    orderedItems = [];
}

// define function submitOrder() to save the order details on clicking the submit button
function submitOrder(orderObj) {
    ordersList.push(orderObj);
    alert(`Total amount to be paid: $${totalAmountElement.value}`);
    resetPage();
}

// Returns order with the corresponding ID
function findOrderById(enteredId) {
    return ordersList.find(order => order.orderId === enteredId);
}

// setup event listener for add item form row
document.getElementById("initAddOrderButton").addEventListener("click", event => {
    event.preventDefault();
    addNewItemOrderRow();
});

// setup event listener for the main form submit using the Order Now button
cxDataFormElement.addEventListener("submit", event => {
    event.preventDefault();
    let orderId = document.getElementById("orderId").value;
    if (totalAmountElement.value <= 0) {
        alert("! ALERT !\nNo items ordered! Please add items from menu before placing the order.");
    }
    else if (findOrderById(orderId)) {
        alert("!!! ERROR !!!\nAnother order with the same ID exists!\nPlease enter a unique ID.");
    }
    else {
        orderDataFormTable.replaceChildren();
        let formData = new FormData(cxDataFormElement);
        let orderObj = Object.fromEntries(formData);
        orderObj["orderedItems"] = [...orderedItems];
        submitOrder(orderObj);
    }
})

resetPage();
// do not delete the code given below, it is written to export the functions to be tested
// module.exports = submitOrder;