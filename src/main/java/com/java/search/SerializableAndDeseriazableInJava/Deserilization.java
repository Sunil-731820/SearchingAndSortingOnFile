package com.java.search.SerializableAndDeseriazableInJava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable{
    int id ;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
}
public class Deserilization {
    public static void main(String[] args) {
        System.out.println("This is the example of the deserilizations in java");

        try{  
            //Creating stream to read the object  
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\sunilg\\Desktop\\f.txt"));  
            Student s=(Student)in.readObject();  
            //printing the data of the serialized object  
            System.out.println(s.id+" "+s.name);  
            //closing the stream  
            in.close();  
            }catch(Exception e){System.out.println(e);} 

    }
}
