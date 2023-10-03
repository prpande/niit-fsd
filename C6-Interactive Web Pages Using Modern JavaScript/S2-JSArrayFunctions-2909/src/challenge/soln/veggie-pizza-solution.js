const menu = [
  {
    category: "Beverages",
    name: "Soft Drink",
    price: 1.5,
  },
  {
    category: "Starters",
    name: "Garlic Bread",
    price: 2.8,
  },
  {
    category: "Starters",
    name: "Mozzarella Sticks",
    price: 5.5,
  },
  {
    category: "Main Meal",
    name: "Medium Size Margherita Pizza",
    price: 11,
  },
  {
    category: "Beverages",
    name: "Iced Tea",
    price: 1.25,
  },
  {
    category: "Starters",
    name: "Greek Wedge Salad",
    price: 4.5,
  },
  {
    category: "Beverages",
    name: "Milk Shake",
    price: 2.0,
  },
  {
    category: "Main Meal",
    name: "Veg Family Meal",
    price: 13.25,
  },
  {
    category: "Main Meal",
    name: "Large Size Vegan Pepperoni Pizza",
    price: 14.5,
  },
];
const order = {
  items: [
    {
      name: "Mozzarella Sticks",
      price: 5.5,
      quantity: 2,
    },
    {
      name: "Garlic Bread",
      price: 2.8,
      quantity: 2,
    },
    {
      name: "Soft Drink",
      price: 1.5,
      quantity: 3,
    },
    {
      name: "Medium Size Margherita Pizza",
      price: 11,
      quantity: 2,
    },
    {
      name: "Iced Tea",
      price: 1.25,
      quantity: 1,
    },
    {
      name: "Veg Family Meal",
      price: 13.25,
      quantity: 2,
    },
  ],
};
const discount = 0.05;
//function to list menu items by category
function listByCategory(menu, category) {
  return menu
    .filter((item) => {
      return item.category === category;
    })
    .sort((a, b) => {
      return a.name.localeCompare(b.name);
    });
}

//function to calculate the total of each item ordered
function calculateOrderAmountForEachItem(menu, order) {
  return order.items.map((item) => {
    let menuItem = menu.find((i) => {
      return i.name === item.name;
    });

    item["category"] = menuItem.category;
    item["amount"] = item.price * item.quantity;

    return item;
  });
}

//function to calculate the main meal count to avail freebie
function calculateMainMealCount(menu, order) {
  let mainMealCategory = "Main Meal";

  return order.items
    .filter((item) => {
      let menuItem = menu.find((i) => {
        return i.name === item.name;
      });

      return menuItem.category === mainMealCategory;
    })
    .reduce((count, i) => {
      return count + i.quantity;
    }, 0);
}

//function to calculate the total bill amount
function calculateTotalAmount(menu, order) {
  let transformedOrderObj = calculateOrderAmountForEachItem(menu, order);
  return transformedOrderObj.reduce((total, item) => {
    return total + item.amount;
  }, 0);
}

//function to calculate the final bill amount after applying discount
function calculateFinalAmount(menu, order, discount) {
  let discountAmountThreshold = 50;

  let totalAmount = calculateTotalAmount(menu, order);
  let discountAmount = 0;
  let finalAmount = totalAmount;

  if (totalAmount >= discountAmountThreshold) {
    discountAmount = totalAmount * discount;
    finalAmount = parseFloat((totalAmount - discountAmount).toFixed(2));
  }

  console.log(`Total Amount Payable: $${totalAmount}`);
  console.log(`Discount: $${discountAmount}`);
  console.log(`Final amount payable after discount: $${finalAmount}`);

  return finalAmount;
}

//function to return a message if the order is eligible for free drink or null otherwise
function isEligibleForFreeDrink(menu, order) {
  let freeDrinkThreshold = 2;
  let freeDrinkMessage =
    "Hurray!!The order is eligible for a free soft drink. Please do collect it!";

  let mealCount = calculateMainMealCount(menu, order);
  if (mealCount >= freeDrinkThreshold) {
    return freeDrinkMessage;
  }
}

module.exports = {
  listByCategory,
  calculateOrderAmountForEachItem,
  calculateMainMealCount,
  calculateTotalAmount,
  calculateFinalAmount,
  isEligibleForFreeDrink,
};

// console.log(listByCategory(menu, "Beverages"));

// console.log(calculateOrderAmountForEachItem(menu,order));

// console.log(calculateMainMealCount(menu, order));

// let orderObj = calculateOrderAmountForEachItem(menu,order);
// console.log(calculateTotalAmount(orderObj));

// calculateFinalAmount(menu, order);

// console.log(isEligibleForFreeDrink(menu, order));
