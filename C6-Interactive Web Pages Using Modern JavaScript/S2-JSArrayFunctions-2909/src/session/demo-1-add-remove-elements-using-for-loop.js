let arr = [10, 21, 32, 43, 54, 65, 76];

//function to add an element at the beginning of the array
function addElementAtBeginning(arr, element) {
    arr.length = arr.length + 1;
    for (let i = arr.length - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
    }
    arr[0] = element;
}
addElementAtBeginning(arr, 1);
console.log(arr);

//function to add elements at the end of the array
function addElementAtEnd(arr, element) {
    arr.length = arr.length + 1;
    arr[arr.length - 1] = element;
}
addElementAtEnd(arr, 87);
console.log(arr);

//function to remove an element from the end of the array
function removeElement(arr) {
    let lastElement = arr[arr.length - 1];
    arr.length = arr.length - 1;
    return lastElement;
}

console.log(removeElement(arr));
console.log(arr);
