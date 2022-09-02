package com.java.search.ListOfListInJava;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int num = sc.nextInt();
        int saveNumber = num;
        // for(int i=1;i<num;i++){
        //     if(num%i==0){ //this is not working for 1 if i enters 
        //         sum +=i;
        //     }
        // }
        int i=1;
        do{
            if(num%i==0){
                sum +=i;
            }
        }while(i<num);
        if(saveNumber==sum){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
        
    }
}
