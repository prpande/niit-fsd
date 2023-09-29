const fruits = ['Banana', 'lemon', 'Orange', 'Apple', 'Mango', 'Cherry'];

//Returns a shallow copy of a portion of an array into a new array
function copyArray(fruits) {
    console.log("Initial fruit list");
    console.log(fruits);

    //Returns a shallow copy of a portion of an array into a new array
    const citrusFruits = fruits.slice(1, 3);
    console.log("New array copied/sliced:")
    console.log(citrusFruits);

    const pulpyFruits= fruits.slice(3,5);
    console.log(pulpyFruits);

    const joinedFruits = citrusFruits.concat(pulpyFruits);
    console.log("Joined fruit list")
    console.log(joinedFruits);

    console.log("The source fruit array list:");
    console.log(fruits);
}

copyArray(fruits);