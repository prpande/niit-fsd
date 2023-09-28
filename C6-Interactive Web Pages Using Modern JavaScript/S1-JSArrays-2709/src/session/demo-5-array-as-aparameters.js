//function to convert even to odd numbers from an array of numbers passed as parameter
function evenToOdd(numArray) {
    let newArray = [];
    for (let index in numArray) {
        val = numArray[index];
        if (val % 2 == 0) {
            val++;
            newArray[index] = val;
        }
        else
            newArray[index] = val;
    }
    return newArray;
}

const numArray = [23, 56, 12, 32, 81, 95, 27, 62, 84, 29, 50, 69, 77, 89];
let resultArray= evenToOdd(numArray);
console.log(`Before conversion, the array is ${numArray}`);
console.log(`After Conversion, the new array is ${resultArray}`);

//function to calculate the maximum of marks from an array passed as parameter
function calaculateMax(listOfMarks) {
    let maxValue = -Infinity;
    for (item of listOfMarks) {
        // find maximum value
        if (item > maxValue)
            maxValue = item;
    }
    return maxValue;
}
const marksList = [89, 56, 76, 98, 34, 51, 41];
console.log(`Maximum marks: ${calaculateMax(marksList)}`);