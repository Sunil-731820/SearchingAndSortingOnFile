package com.java.search.SerializableAndDeseriazableInJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student11 implements Serializable{
    int id;
    String name ;
    public Student11(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
}

public class Serilization {
    public static void main(String[] args) throws IOException {
        System.out.println("This is the example of the serilization ");

        try {
            // Creating the object of the student class 
        Student11 s1 = new Student11(1, "harish");
        
      
        FileOutputStream fout=new FileOutputStream("C:\\Users\\sunilg\\Desktop\\f.txt");    
        ObjectOutputStream out=new ObjectOutputStream(fout);    
        out.writeObject(s1);    
        out.flush();    
        //closing the stream    
        out.close();    
        System.out.println("success");  

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
