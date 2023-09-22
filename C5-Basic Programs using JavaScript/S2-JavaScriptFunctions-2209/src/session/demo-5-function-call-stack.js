//Code Snippet-1-Calculate grade based on the average marks
//Function to calculate total marks 
function calculateTotalMarks(mathMark, scienceMark, englishMark) {
    let totalMarks = mathMark + scienceMark + englishMark;
    return totalMarks;
}

//Function to calculate average marks from the total marks
function calculateAverageOfMarks(mathMark, scienceMark, englishMark) {
    let totalMarks = calculateTotalMarks(mathMark, scienceMark, englishMark);
    let average = totalMarks / 3;
    return average;
}

//Function to calculate the grade based on the average marks
function calculateGrade(mark1, mark2, mark3) {
    let avgMarks = calculateAverageOfMarks(mark1, mark2, mark3);
    if (avgMarks > 80 && avgMarks <= 100) {
        return 'Grade A';
    }
    else if (avgMarks > 60 && avgMarks <= 80) {
        return 'Grade B';
    }
    else return 'Grade C';
}

console.log(`The student has secured ${calculateGrade(78, 67, 45)}`);