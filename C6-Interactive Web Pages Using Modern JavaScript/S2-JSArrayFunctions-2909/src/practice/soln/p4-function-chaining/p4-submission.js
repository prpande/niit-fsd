const { products } = require("../data/products");
//Find the inventory of each non-premium products using function chaining
//Pass the products as parameter to the function
function findInventoryUsingFunctionChaining(products) {
  return products
    .filter((product) => {
      const premiumPriceThreshold = 300;
      return product.price <= premiumPriceThreshold;
    })
    .reduce((invList, product) => {
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
}
// do not delete below code, it is written to make the functions exportable for testing purpose
module.exports = {
  findInventoryUsingFunctionChaining,
};

// console.log(findInventoryUsingFunctionChaining(products));
