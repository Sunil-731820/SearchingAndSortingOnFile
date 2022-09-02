package com.java.search.FileHandlingInJava;

import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

// class MyJSONComparator implements Comparator<JsonObject> {

//     @Override
//     public int compare(JsonObject o1, JsonObject o2) {
//         String v1 = (String) ((JsonObject) o1.get("attributes")).get("COMMERCIALNAME_E");
//         String v3 = (String) ((JsonObject) o2.get("attributes")).get("COMMERCIALNAME_E");
//         return v1.compareTo(v3);
//     }
    
//     }

public class AgainReadingAndSorting {
    public static void main(String[] args) {
        System.out.println("Reading and sorting data from json ");
        JsonParser parser = new JsonParser();
    try {
        JsonObject o = (JsonObject) parser.parse(new FileReader("C:\\Users\\sunilg\\Desktop\\json2.txt"));
        JsonArray array = (JsonArray) o.get("results");
        ArrayList<JsonObject> list = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            list.add((JsonObject) array.get(i));
        }
        // Collections.sort(list, new MyJSONComparator());

        for (JsonObject obj : list) {
            System.out.println(((JsonObject) obj.get("attributes")).get("OBJECTID"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
