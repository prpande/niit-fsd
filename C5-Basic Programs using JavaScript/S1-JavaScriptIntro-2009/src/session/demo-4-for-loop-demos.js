//Code Snippet 1 - Calculate average of even numbers between 1 and 10

let sum = 0;
let count = 0;
for (let i = 1; i <= 10; i++) {
  if (i % 2 === 0) {
    sum = sum + i;
    count++;
  }

}
console.log(`Average is : ${sum / count}`); //Average is : 6

//Code Snippet 2 - Display Numbers between 1 and 10 in Reverse order

for (let i = 10; i > 0; i--) {
  console.log(i); // 10 9 8 7 6 5 4 3 2 1
}

//Infinite loop -1
for (; ;) {
  console.log("Infinite loop");
}

//Infinite loop -2

for (let i = 0; ; i++) {
  console.log(i);
}
