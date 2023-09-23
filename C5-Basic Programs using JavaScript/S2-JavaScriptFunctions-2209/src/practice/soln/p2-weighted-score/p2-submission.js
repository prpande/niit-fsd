//Write solution code
const assignmentWeight= 10;
const projectWeight= 35;
const quizWeight= 10;
const midTermWeight= 15;
const finalExamWeight= 30;

function calculateTotalWeightedScore(assignmentScore, projectScore, quizScore, midTermScore, finalExamScore){

    let assignmentWeightedScore = (assignmentWeight/100) * assignmentScore;
    let projectWeightedScore = (projectWeight/100) * projectScore;
    let quizWeightedScore = (quizWeight/100) * quizScore;
    let midTermWeightedScore = (midTermWeight/100) * midTermScore;
    let finalExamWeightedScore = (finalExamWeight/100) * finalExamScore;

    let overallWeightedScore = assignmentWeightedScore + projectWeightedScore + quizWeightedScore + midTermWeightedScore + finalExamWeightedScore;

    console.log("Assessment Type    Weighted SCore");
    console.log(`Assignments        ${assignmentWeightedScore}`);
    console.log(`Projects           ${projectWeightedScore}`);
    console.log(`Quizzes            ${quizWeightedScore}`);
    console.log(`Mid Term           ${midTermWeightedScore}`);
    console.log(`Final Exam         ${finalExamWeightedScore}`);
    console.log(" ");
    console.log(`The Total Weighted Score is ${overallWeightedScore}%`);
}

let assignmentScore = 97; 
let projectScore = 82; 
let quizScore = 60;
let midTermScore = 75;
let finalExamScore = 80;

calculateTotalWeightedScore(assignmentScore, projectScore, quizScore, midTermScore, finalExamScore);