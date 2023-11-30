package com.jap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class HashSetDemoCode
{
    public static Set<Student> getAllStudentsData(){
        Student student1 = new Student("Johny",21,567);
        Student student2 = new Student("Tim",34,555);
        Student student3 = new Student("Bob",23,456);
        Student student4 = new Student("William",35,678);
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        return studentSet;

    }

    public static void iterateThroughStudentData(Set<Student> studentSet){

        Iterator<Student> iterator = studentSet.iterator();
        System.out.println("Name   " + " TotalMarks  " );
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.getName() +   "    " + " " + student.getTotalMarks());
        }


    }

    public static Set<Student> removeStudentWithRollNo(Set<Student> set, int rollNo){
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getRollNo() == rollNo){
                iterator.remove();
            }
        }
        return set;
    }


    public static void main( String[] args )
    {
        Set<Student> studentSet = getAllStudentsData();
        iterateThroughStudentData(studentSet);
        Set<Student> set = removeStudentWithRollNo(studentSet,34);
        System.out.println(set);
    }
}
