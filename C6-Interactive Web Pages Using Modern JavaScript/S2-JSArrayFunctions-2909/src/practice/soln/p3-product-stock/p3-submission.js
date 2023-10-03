const { products } = require("../data/products");

//Find the inventory of each product type using arrow functions
//Pass the products as parameter to the function
function findProductInventory(products) {
  let inventory = products.reduce((invList, product) => {
    let name = product.productName;
    let inventoryItem = invList.find((item) => item.productName === name);
    if (!inventoryItem) {
      let item = {
        productName: name,
        stock: 1,
      };
      invList.push(item);
    } else {
      inventoryItem.stock++;
    }

    return invList;
  }, []);

  return inventory;
}

// do not delete below code, it is written to make the functions exportable for testing purpose
module.exports = {
  findProductInventory,
};

// console.log(findProductInventory(products));
