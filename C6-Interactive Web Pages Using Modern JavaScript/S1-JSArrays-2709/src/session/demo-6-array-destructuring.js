function getReverseArray(arr) {
    //we traverse only one half of the length of the given array and swap the elements in 
    //equal distance from first and the last i,e, 
    //first element and last and second with second last and so on
    let lastElementIndex = arr.length - 1;
    for (let i = 0; i < Math.floor(arr.length / 2); i++) {
        //Array destructuring
        [arr[i], arr[lastElementIndex - i]] = [arr[lastElementIndex - i], arr[i]];
    }
    return arr;
}
let arr = [10, 20, 30, 40, 50, 60, 70, 80];
console.log(`Reversed Array: ${getReverseArray(arr)}`);
