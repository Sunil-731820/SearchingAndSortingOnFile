package com.java.search.searchData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class SearchByEndDate {
    public static void main(String[] args) throws IOException {
        System.out.println("this is the example of the search By End Date examples");
        File input = new File("C:\\Users\\sunilg\\Desktop\\data.txt");
		FileReader fr = null;
		Scanner ob = new Scanner(System.in);
		String searchByName , str;
		System.out.println("Enter the End Date  Here for searching the records  ");
		searchByName = ob.nextLine();
		try {
			fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);
			while((str=br.readLine())!=null) {
				if(str.contains(searchByName)) {
					System.out.println(str);
				}
			}
		}
		catch (Exception e) {
			Logger.getLogger("Not found ");
			// TODO: handle exception
		}
		finally {
			fr.close();
		}
		
    }
}
