//Code Snippet-1 Calculate the largest of two numbers
function calculateMax(num1, num2 = 100) {
    return (num1 > num2 ? num1 : num2)
}
console.log(calculateMax(35,20));//35

//Will use the default value for the second parameter
max = calculateMax(90);
console.log(max); //100



