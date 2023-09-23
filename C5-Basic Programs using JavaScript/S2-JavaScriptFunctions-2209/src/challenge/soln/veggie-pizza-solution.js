//Write the solution code here

const menu = {
  Pizza: {
    Regular: 9.99,
    Medium: 11.99,
    Large: 13.99,
  },

  GarlicBread: 5.99,

  Beverages: 1.99,
};

let cxDetails = {
  customerName: "Gary",
  customerPhoneNo: "+4123123435",
};

let orderDetails = {
  Pizza: {
    Regular: 10,
  },

  GarlicBread: 5,

  Beverages: 10,
};

function alertCxDetails(details) {
    alert(    `   Customer Details\n`+
                    `---------------------------\n`+
                    `   Customer Name          :   ${details.customerName}\n`+
                    `   Customer Phone Number   :   ${details.customerPhoneNo}`);
}

function alertMenuDetails(menu){
    alert(`Menu Items\n`+
                `   S.No    Item Category       Price\n`+
                `------------------------------------\n`+
                `   1)      Pizza (Regular)     $${menu.Pizza.Regular}\n`+
                `   2)      Pizza (Medium)      $${menu.Pizza.Medium}\n`+
                `   3)      Pizza (Large)       $${menu.Pizza.Large}\n`+
                `   4)      Garlic Bread        $${menu.GarlicBread}\n`+
                `   5)      Beverages           $${menu.Beverages}\n`);
}

function getPizzaPrice(size)
{
    return menu.Pizza[size];
}

function getGarlicBreadPrice(){
    return menu.GarlicBread;
}

function getBeveragePrice(){
    return menu.Beverages;
}

function calculateSubTotal(quantity, price){
    return quantity * price;
}

function calculateTotalBill(pizzaSubTotal, garlicBreadSubTotal, beverageSubTotal){
    return pizzaSubTotal + garlicBreadSubTotal + beverageSubTotal;
}

function calculateFinalBill(totalBill){
    let finalBill = totalBill;
    if(totalBill >= 50)
    {
        finalBill = 0.9 * totalBill;
    }

    return finalBill;
}

function alertFinalBillDetails(orderDetails, totalBill, finalBill)
{
    let discountAmount = totalBill - finalBill;
    let alertStr =  `Bill Details\n------------------------\n`;
    for(let type in orderDetails.Pizza)
    {
        alertStr += `Pizza(${type})     : ${orderDetails.Pizza[type]}\n`;
    }

    alertStr +=     `Garlic Bread       : ${orderDetails.GarlicBread}\n`;
    alertStr +=     `Beverages          : ${orderDetails.Beverages}\n`;
    alertStr +=     `---------------------------------------\n`+
                    `The total bill Amount is        : $ ${totalBill.toFixed(2)}\n`+
                    `Discount Amount                 : $ ${discountAmount.toFixed(2)}\n`+
                    `The final bill Amount is        : $ ${finalBill.toFixed(2)}`;
    
    alert(alertStr);
}

alertCxDetails(cxDetails);
alertMenuDetails(menu);

let totalPizzaBill = 0;
for(let key in orderDetails.Pizza)
{
    let itemPrice = getPizzaPrice(key)
    totalPizzaBill += calculateSubTotal(orderDetails.Pizza[key], itemPrice);
}

let totalGarlicBreadBill = calculateSubTotal(orderDetails.GarlicBread, getGarlicBreadPrice());
let totalBeveragesBill = calculateSubTotal(orderDetails.Beverages, getBeveragePrice());

let totalBill = calculateTotalBill(totalPizzaBill, totalGarlicBreadBill, totalBeveragesBill);

let finalBill = calculateFinalBill(totalBill);

alertFinalBillDetails(orderDetails, totalBill, finalBill);