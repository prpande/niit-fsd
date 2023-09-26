//Code Snippet-1-Calculate grade based on the average marks
//Function to calculate total marks 
function calculateTotalMarks(mathMark, scienceMark, englishMark) {
    if (mathMark === undefined || scienceMark === undefined || englishMark === undefined)
        return "Insufficient Inputs";
    if (typeof mathMark !== "number" || typeof scienceMark !== "number" || typeof englishMark !== "number")
        return "Invalid Input Types, Mark Should Be A Number !!";
    if (mathMark < 0 || scienceMark < 0 || englishMark < 0)
        return "Incorrect Input, Mark Cannot Be Negative !!";
    let totalMarks = mathMark + scienceMark + englishMark;
    return totalMarks;
}

//Function to calculate average marks from the total marks
function calculateAverageOfMarks(mathMark, scienceMark, englishMark) {
    if (mathMark === undefined || scienceMark === undefined || englishMark === undefined)
        return "Insufficient Inputs";
    if (typeof mathMark !== "number" || typeof scienceMark !== "number" || typeof englishMark !== "number")
        return "Invalid Input Types, Mark Should Be A Number !!";
    if (mathMark < 0 || scienceMark < 0 || englishMark < 0)
        return "Incorrect Input, Mark Cannot Be Negative !!";
    let totalMarks = calculateTotalMarks(mathMark, scienceMark, englishMark);
    let average = totalMarks / 3;
    return average;
}

//Function to calculate the grade based on the average marks
function calculateGrade(mark1, mark2, mark3) {
    if (mark1 === undefined || mark2 === undefined || mark3 === undefined)
        return "Insufficient Inputs";
    if (typeof mark1 !== "number" || typeof mark2 !== "number" || typeof mark3 !== "number")
        return "Invalid Input Types, Mark Should Be A Number !!";
    if (mark1 < 0 || mark2 < 0 || mark3 < 0)
        return "Incorrect Input, Mark Cannot Be Negative !!";
    let avgMarks = calculateAverageOfMarks(mark1, mark2, mark3);
    if (avgMarks > 80 && avgMarks <= 100) {
        return 'Grade A';
    }
    else if (avgMarks > 60 && avgMarks <= 80) {
        return 'Grade B';
    }
    else return 'Grade C';
}

// console.log(`The student has secured ${calculateGrade(78, 67, 45)}`);

module.exports = {
    calculateTotalMarks,
    calculateAverageOfMarks,
    calculateGrade
}
