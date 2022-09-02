package com.java.search.OOpsConceptsInJava;

// 1 : First method named Anonoymous method i.e means by named

class  Calculation{

    void fact(int num){
        int fac = 1;
        for(int i=1;i<=num;i++){
            fac = fac*i;
        }
        System.out.println("the factorial of the Number is " + fac);
    }

}


// 2 : Second method to create object using new keyword at runtime

class Calculation1{
    void fact1(int number){
        int fa = 1;
        for(int i=1;i<=number;i++){
            fa = fa*i;
        }
        System.out.println("the factorial of the Number is  " + fa);
    } 
}

 


public class ObjectCreationIn5Ways {
    public static void main(String[] args) {
        System.out.println("this is the example of the object creation in java ");

        // 1 : first method using anonymous method
        new Calculation().fact(5);

        // 2 : Second method using new keywords

        Calculation1 cal = new Calculation1();
        cal.fact1(7);
    }
}
