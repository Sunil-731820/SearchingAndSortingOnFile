package com.java.search.FileHandlingInJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingXMLData {

    
    public static void readXml() throws IOException{
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sunilg\\Desktop\\xml.txt"));
            String line = null;
            while((line=br.readLine())!=null){
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("after calling the readXmlData Functions");
        readXml();
        
    }
}
