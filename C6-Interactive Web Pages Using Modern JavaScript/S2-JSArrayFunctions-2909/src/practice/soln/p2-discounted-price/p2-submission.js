const { products } = require("../data/products");

//Find the discounted price for non-premium products using arrow functions
//Pass the products as parameter to the function
function calculateDiscountedPrice(products) {
  let nonPremiumProducts = products.filter((product) => {
    const premiumPriceThreshold = 300;
    return product.price <= premiumPriceThreshold;
  });

  let discountedPrices = nonPremiumProducts.map((product) => {
    let discount = 0.1;
    product.price = (1 - discount) * product.price;
    return product;
  });

  return discountedPrices;
}

// do not delete below code, it is written to make the functions exportable for testing purpose
module.exports = {
  calculateDiscountedPrice,
};

// console.log(calculateDiscountedPrice(products));