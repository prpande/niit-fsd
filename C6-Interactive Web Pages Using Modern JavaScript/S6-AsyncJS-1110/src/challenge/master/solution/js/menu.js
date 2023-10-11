let menuItems = [];


// Write code to fetch the complete menu data using Axios API when the web page is loaded 
// Note: As per test requirement, Order API should be running on port 3000
function fetchMenuItemsFromServer() {
  // the data fetched from server should be stored in the `menuItems` array.
    // the values of `menuItems` array should be displayed on the menu.html page
}

//Write code to filter the menu items from list by category
const category = document.getElementById('category');
category.addEventListener('change', function (e) {
    findItemsByCategory(category.value);
});

function findItemsByCategory(category) {
    // the filtered menu items should be displayed on the menu.html page.
}
// do not delete the code given below, it is written to export the functions to be tested
module.exports = {
    fetchMenuItemsFromServer
}
