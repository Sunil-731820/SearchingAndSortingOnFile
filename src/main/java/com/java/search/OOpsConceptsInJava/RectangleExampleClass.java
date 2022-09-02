package com.java.search.OOpsConceptsInJava;

class Rectange{
    // int length;
    // int width;

    void area(int l , int w){
        int area1 = l*w;
        System.out.println("the area of the reactangle is "+ area1);
    }

    void perimeter(int l ,int w){
        int peri = 2*(l+w);
        System.out.println("the perimeter of the rectangle is " + peri);
    }
}

public class RectangleExampleClass {
    public static void main(String[] args) {
        System.out.println("the rectangle is ");

        Rectange rec1 = new Rectange();
        rec1.area(10, 10);

        rec1.perimeter(20, 30);


    }
}
