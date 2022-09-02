package com.java.search.SerializableAndDeseriazableInJava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Student1 implements Serializable{
    int id;
    String name ;
    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
}
public class DeserilizationOfArrayList {
    public static void main(String[] args) {
        int i;
        Student1[] student = new Student1[2];
        System.out.println("Now i am going to Deserilize the data using arrayList");
        try{  
            //Creating stream to read the object  
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\sunilg\\Desktop\\f1.txt"));  
            Student s=(Student)in.readObject();  
           List<Student1> obj ;
           obj = new ArrayList<Student1>();
           for(int j=0;j<obj.size();j++){
            obj.add(student[j]);
           }
           


            //printing the data of the serialized object 
            // System.out.println(); 
            System.out.println(s.id+" "+s.name);  
            //closing the stream  
            in.close();  
            }catch(Exception e){
                System.out.println(e);
            } 
    }
}
