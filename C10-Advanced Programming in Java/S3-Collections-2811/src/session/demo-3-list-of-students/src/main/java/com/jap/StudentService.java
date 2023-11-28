package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentService {
    public static List<Student> getAllStudents(){
        Student student = new Student("William","101",56);
        Student student1 = new Student("Jerry","102",87);
        Student student2 = new Student("Harry","103",65);
        Student student3 = new Student("Henry","104",72);
        Student student4 = new Student("Bob","105",89);
                  List<Student> studentList = new ArrayList<>();
                  studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
                  return studentList;

    }

    public static List<String> getAllNamesStartsWithH(List<Student> studentList){
       List<String> list = new ArrayList<>();
        Iterator<Student> iterator = studentList.iterator();
        while(iterator.hasNext()){
            String name = iterator.next().getName();
            if(name.startsWith("H")){
                list.add(name);
            }
        }
        return list;

    }

    public static float averageAllMarks(List<Student> studentList){
        float totalMarks = 0;
        Iterator<Student> studentIterator = studentList.iterator();
        while (studentIterator.hasNext()){
            totalMarks  = totalMarks + studentIterator.next().getMarks();
        }
        float average = totalMarks/studentList.size();
        return average;
    }

    public static boolean removeNameStartsWithB(List<Student> studentList){
        boolean flag = false;
        Iterator<Student> studentIterator = studentList.iterator();
        while (studentIterator.hasNext()){
            String name = studentIterator.next().getName();
            if(name.startsWith("B")){
                studentIterator.remove();
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        List<Student> studentList = getAllStudents();
        System.out.println("Students List : " + studentList );
        List<String> name = getAllNamesStartsWithH(studentList);
        System.out.println("Name : " + name);
        System.out.println("Average Marks : " + averageAllMarks(studentList));
        System.out.println(removeNameStartsWithB(studentList));
        System.out.println("Student list after removing name starting with B : " + studentList);
    }

}
