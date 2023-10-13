function printStudent(student) {
    if (student.lastName) {
        console.log("Student ID:" + student.studentId + "\n" +
            "First Name:" + student.firstName + "\n" +
            "Last Name:" + student.lastName + "\n" +
            "Course:" + student.course + "\n" +
            "Fees:" + student.fees + "\n" +
            "Avail Hostel Facility:" + student.availHostel);
    }
    else {
        console.log("Student ID:" + student.studentId + "\n" +
            "First Name:" + student.firstName + "\n" +
            "Course:" + student.course + "\n" +
            "Fees:" + student.fees + "\n" +
            "Avail Hostel Facility:" + student.availHostel);
    }
}
var hostelStudent = {
    studentId: 101,
    firstName: "Allen",
    lastName: "Keth",
    course: "Java",
    fees: 200,
    availHostel: true
};
var student1 = {
    studentId: "S102",
    firstName: "Joseph",
    course: "Angular",
    fees: 300,
    availHostel: false
};
printStudent(hostelStudent);
printStudent(student1);
