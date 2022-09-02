package com.java.search.ListOfListInJava;

import java.util.ArrayList;
import java.util.List;

public class ListOfListExample1 {
    public static void main(String[] args) {
        List<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Delhi");
        list1.add("Mumbai");
        listOfLists.add(list1);
        System.out.println("the list1 is ");
        System.out.println(list1);
        System.out.println("the list of list is ");
        System.out.println(listOfLists);
    }
}
