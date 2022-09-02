package com.java.search.SortingData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AnotherWayToReadDataFromFile {
    public static void readFiledata(File f) throws IOException{
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int numberOfLine = 0;
        // List<List<String> list11 = new 
        // List<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
        // ArrayList<String> list1 = new ArrayList<String>();
        while((line = br.readLine())!=null){
            System.out.println(line.toCharArray());
            // list1.add(line);
            // // listOfLists.add(list1);
            numberOfLine++;
        }

        // List<List<String>> list22 = Arrays.asList(
        //     Arrays.asList("a","b","c"),
        //     Arrays.asList("D","E","F")
        // );
        // System.err.println("the list is ");
        // System.out.println(list22);
        System.out.println("the NumberOfLines is "+ numberOfLine);

        // System.out.println("the list1 is ");
        // System.out.println(list1);

        // List<List<String>> data;
        // for(int i=0;i<list1.size();i++){
        //     List<String> temp = list1.toArray().getClass();
        //     data.add(temp);
        // }
        // // for(int i=0;i<list1.size();i++){
        //     ArrayList<String> temp = list1.get(i).split(",");
        //     listOfLists.add(temp);
        // }
        // // // listOfLists.add(list1);
        // for(int i=0;i<list1.size();i++){
        //     // listOfLists.add(e)
        // }
        // System.out.println("the list1 is ");
        // System.out.println(list1);
        // // System.out.println("the list of list is ");
        // System.out.println(listOfLists);
       
        // String arr[][] = new String[6][4];
        // for(int i=0;i<numberOfLine;i++){
        //     for(int j=0;j<4;j++){
        //         arr.

        //     }
        // }


        br.close();
        fr.close();
    }
    public static void main(String[] args) {
        File f = new File("C:\\Users\\sunilg\\Desktop\\data.txt");
        try {
            System.out.println("the tostring data is ");
            readFiledata(f);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
