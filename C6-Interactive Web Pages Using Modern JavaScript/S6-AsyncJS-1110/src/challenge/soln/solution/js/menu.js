let menuItems = []; // array tracking the menu items
let categoryList = []; // array tracking the categories present

// Write code to fetch the complete menu data using Axios API when the web page is loaded 
// Note: As per test requirement, Order API should be running on port 3000

const menuUrl = "http://localhost:3000/menu";
const category = document.getElementById("category");
const menuItemsTable = document.getElementById("menuItemsTable");
const allCategoryString = "All";

// Fetches the menu items from the json server and populates the menu items cache array
function fetchMenuItemsFromServer() {
    // the data fetched from server should be stored in the `menuItems` array.
    // the values of `menuItems` array should be displayed on the menu.html page
    const getPromise = axios.get(menuUrl);
    getPromise
        .then(response => {
            console.log(`Response: [Status:${response.status} Message:${response.statusText}] Menu: [Count:${response.data.length}]`);

            console.log("Refreshing menu cache...")
            menuItems = [];
            menuItems.push(...response.data);
        })
        .catch(error => {
            let msg = `GET failed for [URL:${todoURL}]!`
            alert(msg);
            console.log(msg);
            console.error(error);
        });

    return getPromise;

}

// Piggy backs on fetchMenuItemsFromServer and populates the valid menu item Categories in local categories array
function fetchCategoriesFromServer() {
    let getPromise = fetchMenuItemsFromServer();
    getPromise.then(() => {
        console.log("Figuring out the categories...");
        categoryList = menuItems.reduce((list, item) => {
            let uriCategory = encodeURIComponent(item.category);
            if (!list.find(cat => cat === uriCategory)) {
                list.push(uriCategory);
            }
            return list;
        }, []);
    });

    return getPromise;
}

// Entry point to initialize the categories selector on the HTML page with the categories fetched from the server
function initializeCategories() {
    let getPromise = fetchCategoriesFromServer();
    getPromise.then(() => {
        console.log(`Category fetched count: ${categoryList.length}`);
        addCategoriesToPage();
        findItemsByCategory(allCategoryString);
    })
}

// Adds the HTML elements to the document for the categories present in the server
function addCategoriesToPage() {
    let allCatElement = createCategoryElement(allCategoryString);
    allCatElement.selected = true;
    category.appendChild(allCatElement);

    categoryList.forEach(cat => {
        let catElement = createCategoryElement(cat);
        category.appendChild(catElement);
    })
}

// Creates individual category elements for the selector
function createCategoryElement(item) {
    let categoryElement = document.createElement("option");
    categoryElement.value = item;
    categoryElement.text = decodeURIComponent(item);
    console.log(`Created category element: [value:${categoryElement.value} text:${categoryElement.text}]`);
    return categoryElement;
}

//Write code to filter the menu items from list by category
category.addEventListener('change', function (e) {
    findItemsByCategory(category.value);
});

// Filters the menu items based on the input category and adds them to the HTML document
function findItemsByCategory(category) {
    // the filtered menu items should be displayed on the menu.html page.
    let filteredItems = menuItems;
    if (category !== allCategoryString) {
        filteredItems = filteredItems.filter(item => item.category === decodeURIComponent(category));
        console.log(`Filtered by Category:${category} Count:${filteredItems.length}`);
    }
    menuItemsTable.replaceChildren();
    filteredItems.forEach(item => {
        menuItemsTable.appendChild(createMenuItemElement(item));
    });
}

// Creates individual menu item table row element
function createMenuItemElement(item){

    let menuItemNameElement = document.createElement("td");
    menuItemNameElement.textContent = item.itemName;

    let menuItemPriceElement = document.createElement("td");
    menuItemPriceElement.textContent = item.price;

    menuItemNameElement.classList.add("tableColWidth");

    let menuItemTrElement = document.createElement("tr");
    menuItemTrElement.appendChild(menuItemNameElement);
    menuItemTrElement.appendChild(menuItemPriceElement);

    return menuItemTrElement;
}

// do not delete the code given below, it is written to export the functions to be tested
module.exports = {
    fetchMenuItemsFromServer
}
