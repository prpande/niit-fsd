//Write solution code 
const PI = 3.14;

function calculateAreaOfSquare(side){
    let intSide = parseInt(side);
    if(!intSide)
    {
        console.log(`Invalid integer input:${side}!`);
        return undefined;
    }

    return intSide * intSide;
}

function calculateAreaOfCircle(radius){
    let floatRadius = parseFloat(radius);
    if(!floatRadius)
    {
        console.log(`Invalid float input:${radius}!`);
        return undefined;
    }

    return PI * floatRadius * floatRadius;
}

function calculateAreaOfRectangle(length, breadth){
    let floatLength = parseFloat(length);
    let floatBreadth = parseFloat(breadth);
    if(!floatLength || !floatBreadth)
    {
        console.log(`Invalid float inputs:${length}, ${breadth}!`);
        return undefined;
    }

    return floatLength * floatBreadth;
}

let side = 10;
console.log(`Area of square:${calculateAreaOfSquare(side)}`);

let radius = 3.6;
console.log(`Area of circle:${calculateAreaOfCircle(radius)}`);

let length = 5.8;
let breadth = 2.7;
console.log(`Area of rectangle:${calculateAreaOfRectangle(length, breadth)}`);