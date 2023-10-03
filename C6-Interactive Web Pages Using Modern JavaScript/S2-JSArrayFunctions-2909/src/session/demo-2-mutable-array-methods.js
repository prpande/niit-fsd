//Push and pop methods to add /remove values at the end of the array
function addOrRemoveFruitValuesAtTheEnd() {
    const fruits = ['Banana', 'Orange', 'Apple'];
    console.log('Intial fruit list:');
    console.log(fruits);
    fruits.push('Mango', 'Grapes');
    console.log(`Adding fruits at the end of the array: `);
    console.log(fruits);
    fruits.pop();
    console.log(`Removing the last fruit from the end of the array:`)
    console.log(fruits);
    console.log("=============================================================");
}

//Unshift and shift methods to add /remove values at the beginning of the array
function addOrRemoveFruitValuesAtTheStart() {
    const fruits = ['Banana', 'Orange', 'Apple'];
    console.log('Intial fruit list:');
    console.log(fruits);
    fruits.unshift('Mango', 'Grapes');
    console.log(`Adding fruits at the start of the array:`);
    console.log(fruits);
    fruits.shift();
    console.log(`Removing the first fruit from the start of the array:`);
    console.log(fruits);
    console.log("=============================================================");
}

//Add or Remove or Replace using splice method
function addOrRemoveorReplaceElements() {
    const fruits = ['Banana', 'Orange', 'Apple'];
    console.log('Intial fruit list:');
    console.log(fruits);
    console.log("Adding 2 elements at the second position");
    fruits.splice(2, 0, 'Lemon', 'Kiwi');
    console.log(fruits);
    console.log("Removing 2 elements at the first position");
    fruits.splice(1, 2);
    console.log(fruits);
    console.log("Replacing 1 element at the zero position");
    fruits.splice(0,1,'Pineapple');
    console.log(fruits);
    console.log("=============================================================");
}

//Functions like reverse and sort which mutates the array elements
function rearrangeElements() {
    const colors = ['Violet', 'Indigo', 'Blue', 'Green', 'Yellow', 'Orange', 'Red'];
    console.log(`Reversed Array values: ${colors.reverse()}`);
    console.log(`=============================================================`);
    console.log(`Sorted Array values:`);
    console.log(colors.sort());
}

//Search array elements
function searchElements(){
    const colors = ['Violet', 'Indigo', 'Blue', 'Green', 'Yellow', 'Orange', 'Red','Blue','Brown'];
    console.log(`Index position of Blue color in the array: ${colors.indexOf('Blue')}`);
    console.log(`Index position of Blue color when searched backwards: ${colors.lastIndexOf('Blue')}`);
 }

addOrRemoveFruitValuesAtTheEnd();

addOrRemoveFruitValuesAtTheStart();

addOrRemoveorReplaceElements();

rearrangeElements();

searchElements();

