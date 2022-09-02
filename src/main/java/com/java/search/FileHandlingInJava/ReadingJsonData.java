package com.java.search.FileHandlingInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingJsonData {
    public static void readJsonData(){ 
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sunilg\\Desktop\\json.txt"));
            String line = null;
            while((line=br.readLine())!=null){
                System.out.println(line);     
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("This is the example of json data ");
        System.out.println("after calling the json read function ");
        readJsonData();
    }
}
