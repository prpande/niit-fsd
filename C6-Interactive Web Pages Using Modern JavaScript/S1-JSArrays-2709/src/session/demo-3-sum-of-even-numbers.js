const num_array = [23, 56, 12, 32, 81, 95, 27, 62, 84, 29, 50, 69, 77, 89];

function sumOfEvenNumbersUsingFor() {
    let sum = 0;
    let val = 0;
    for (i = 0; i < num_array.length; i++) {
        val = num_array[i];
        if (val % 2 == 0) {
            sum += val;
        }
    }
    console.log(`Sum of even numbers is ${sum}`);
}

function sumOfEvenNumbersUsingForOf() {
    let sum = 0;
    for (const val of num_array) {
        if (val % 2 == 0) {
            sum += val;
        }
    }
    console.log(`Sum of even numbers is ${sum}`);
}

sumOfEvenNumbersUsingFor();
sumOfEvenNumbersUsingForOf();

