package com.java.search.SerializableAndDeseriazableInJava;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student111 implements Serializable{
    int id ;
    String name ;
    public Student111(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
}

public class SerilizingArraylist {
    public static void main(String[] args) {
        System.out.println("Now i am going to serilize the ArrayList Data ");
        // Creating the arrayList using collections
        ArrayList<Student111> list1 = new ArrayList<Student111>();

        try {
            
            // Creating the object to serilize the data 
            list1.add(new Student111(1, "suman"));
            list1.add(new Student111(2, "harish"));
            list1.add(new Student111(3, "arti"));
            FileOutputStream fout=new FileOutputStream("C:\\Users\\sunilg\\Desktop\\f1.txt");    
            ObjectOutputStream out=new ObjectOutputStream(fout);    
            out.writeObject(list1);    
            out.flush();    
        //closing the stream    
        out.close();    
        System.out.println("success");  

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
