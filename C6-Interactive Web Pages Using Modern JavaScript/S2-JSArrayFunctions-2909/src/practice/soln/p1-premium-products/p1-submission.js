const { products } = require("../data/products");

//filter premium products from the products passed as parameter using arrow functions
function filterProducts(products) {
  let premiumProducts = products.filter((product) => {
    const premiumPriceThreshold = 300;
    return product.price > premiumPriceThreshold;
  });
  return premiumProducts;
}

// do not delete below code, it is written to make the functions exportable for testing purpose
module.exports = {
  filterProducts,
};

// console.log(products);
// console.log(filterProducts(products));
