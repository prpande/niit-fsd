package com.jap;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    
    public static List getAllNames(){
        
        List listName = new ArrayList();
        listName.add("John");
        listName.add("Bob");
        listName.add("Harry");
        listName.add("William");
        listName.add("Jordan");
        
        return listName;
    }

    public static void main(String[] args) {
        List list = ListDemo.getAllNames();
        System.out.println("Size of list is : " + list.size());
        System.out.println("Index no. for the Object Bob : " + list.indexOf("Bob"));
        System.out.println("Retrieve data from 2nd Index position : " +list.get(2));
        System.out.println("Does list contains the following object Ketty : " +list.contains("Ketty"));
        System.out.println("Print the entire list ----");
        System.out.println(list);
    }
}
