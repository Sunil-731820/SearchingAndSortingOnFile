package com.java.search.OOpsConceptsInJava;

class Student{
    //these are called as instance variable
    int id;
    String name;

    // 2 : Initilising Objects through Method 

    void insertRecord(int r ,String nam){
        id = r;
        name = nam;
    }

    //fucntion for displaying the data 
    void display(){
        System.out.println("the roll Number is "+ id + " the name is  "+ name);
    }

}

public class FirstClassExample1 {

    public static void main(String[] args) {
        System.out.println("this is the example of the class ");
//      creeting the instance of the variable 
        Student s1 =  new Student();
        // s1.id =1 ;
        // s1.name = "sunil";
        System.out.println("the id is "+ s1.id + " name is "+ s1.name);

        // you can initialised the object in three ways

        // 1 : By Reference 
        // 2 : By Method
        // 3 : By Constructor

        // 1 : By Reference 
        // This is initialising the data by refence
        s1.id = 100;
        s1.name = "Sunil";
        System.out.println("the id is "+ s1.id + "the name is "+s1.name);


        // 2 : Initialised Object  through Method 

        Student s2 = new Student();
        s2.insertRecord(100, "Harish");
        s2.display();


        // 3 :ceating objects through  By Constructor

        





    }
}
