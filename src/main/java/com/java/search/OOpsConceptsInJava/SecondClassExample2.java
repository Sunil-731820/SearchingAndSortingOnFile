package com.java.search.OOpsConceptsInJava;

class EMploy{
    int id;
    String name ;
    float salary;

    void insertRecord(int id1,String name1,float salary1){
        id = id1;
        name = name1;
        salary = salary1;
    }

    void displatInformation(){
        System.out.println("the id  " + id + " "+ "and the name is " + name + " "+ "and the salary is "+salary);
    }
}



public class SecondClassExample2 {
    public static void main(String[] args) {
        System.out.println("This is the second class Example in java");
        EMploy e1 = new EMploy();
        e1.insertRecord(1, "Arti", 20000);
        e1.insertRecord(2,"subham",300000);
        e1.displatInformation();
    }
}
