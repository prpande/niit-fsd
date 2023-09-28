// function to access every character in an array of string names using nested loop

function extractEachCharacter() {
    const names = ["Abby", "Bobby", "Freddy"];
    for (let i = 0; i < names.length; i++) {
        console.log(`Full name in the outer loop ${names[i]}`)
        for (let j = 0; j < names[i].length; j++) {
            console.log(`Character in the inner loop ${names[i][j]}`)
        }
    }
}

extractEachCharacter();

