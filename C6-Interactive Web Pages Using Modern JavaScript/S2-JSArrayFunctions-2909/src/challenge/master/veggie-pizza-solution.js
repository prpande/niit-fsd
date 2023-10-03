const menu = [
    {
        'category': 'Beverages',
        'name': 'Soft Drink',
        'price': 1.5
    },
    {
        'category': 'Starters',
        'name': 'Garlic Bread',
        'price': 2.8
    },
    {
        'category': 'Starters',
        'name': 'Mozzarella Sticks',
        'price': 5.5
    },
    {
        'category': 'Main Meal',
        'name': 'Medium Size Margherita Pizza',
        'price': 11
    },
    {
        'category': 'Beverages',
        'name': 'Iced Tea',
        'price': 1.25
    },
    {
        'category': 'Starters',
        'name': 'Greek Wedge Salad',
        'price': 4.5
    },
    {
        'category': 'Beverages',
        'name': 'Milk Shake',
        'price': 2.0
    },
    {
        'category': 'Main Meal',
        'name': 'Veg Family Meal',
        'price': 13.25
    },
    {
        'category': 'Main Meal',
        'name': 'Large Size Vegan Pepperoni Pizza',
        'price': 14.5
    },
]
const order = {
    'items': [
        {
            'name': 'Mozzarella Sticks',
            'price': 5.5,
            'quantity': 2
        },
        {
            'name': 'Garlic Bread',
            'price': 2.8,
            'quantity': 2
        },
        {
            'name': 'Soft Drink',
            'price': 1.5,
            'quantity': 3
        },
        {
            'name': 'Medium Size Margherita Pizza',
            'price': 11,
            'quantity': 2
        },
        {
            'name': 'Iced Tea',
            'price': 1.25,
            'quantity': 1
        },
        {
            'name': 'Veg Family Meal',
            'price': 13.25,
            'quantity': 2
        },
    ]
};
const discount = 0.05;
//function to list menu items by category
function listByCategory() {
  
}

//funtion to calculate the total of each item ordered
function calculateOrderAmountForEachItem() {
   
}

//function to calculate the main meal count to avail freebie
function calculateMainMealCount() {
   
}

//function to calculate the total bill amount 
function calculateTotalAmount() {
    
}

//funtion to calculate the final bill amount after applying discount
function calculateFinalAmount() {
   
}

//function to return a message if the order is eligible for free drink or null otherwise
function isEligibleForFreeDrink(menu, order) {
    
}


module.exports = {
    listByCategory,
    calculateOrderAmountForEachItem,
    calculateMainMealCount,
    calculateTotalAmount,
    calculateFinalAmount,
    isEligibleForFreeDrink
}




