package com.java.search.SortingData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int id ;
    String name;
    String startDate;
    String endDate;
    public Student(int id, String name, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    @Override
    public String toString() {
        return "Student [endDate=" + endDate + ", id=" + id + ", name=" + name + ", startDate=" + startDate + "]";
    }

    
}

class idComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.id==o2.id){
            return 0;
        }else if(o1.id>o2.id){
            return 1;
        }else{
            return -1;
        }
    }
    
}

class NamedComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.name.compareTo(o2.name));
    }
    
}


class StartDateComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.startDate.compareTo(o2.startDate));
    }
    
}

class EndDateComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.endDate.compareTo(o2.endDate));
    }

}


// class StartAndEndDateComparator implements Comparator<Student>{

//     @Override
//     public int compare(Student o1, Student o2) {
//         return ((o1.startDate.compareTo(o2.startDate))&&(o1.endDate.compareTo(o2.endDate)));
//     }
    
// }

public class StudentSortingDataById {
    public static void main(String[] args) {
        System.out.println("This is the example of the sorting the data by student id ");

        ArrayList<Student> list1 = new ArrayList<Student>();
        list1.add(new Student(11, "sunil", "2022-09-05", "2022-09-10"));
        list1.add(new Student(21, "Harish", "2022-09-02", "2022-09-03"));
        list1.add(new Student(3, "Subham", "2022-09-12", "2022-09-11"));
        list1.add(new Student(4, "Arti", "2022-09-10", "2022-09-01"));
        System.out.println("The list is ");
        System.out.println(list1);

        // Sorting the data by Start Date 
        Collections.sort(list1, new idComparator());
        System.out.println("after sorting the list of the data  by id is  ");
        System.out.println(list1);

        // Sorting the data by Name 
        // System.out.println("after sorting the list of the data by Name is ");
        // Collections.sort(list1, new NamedComparator());
        // System.out.println(list1);

        //Sorting the data by Start Date
        // System.out.println("after sorting the data by start Date ");
        // Collections.sort(list1, new StartDateComparator());
        // System.out.println(list1);

        //Sorting the data by end date
        // System.out.println("after sorting the data by end date is ");
        // Collections.sort(list1, new EndDateComparator());
        // System.out.println(list1);


        
    }
}
