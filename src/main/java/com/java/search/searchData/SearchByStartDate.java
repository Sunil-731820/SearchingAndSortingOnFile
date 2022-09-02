package com.java.search.searchData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class SearchByStartDate {
    public static void main(String[] args) throws IOException {
        System.out.println("This is the search Example By Start date ");

        File input = new File("C:\\Users\\sunilg\\Desktop\\data.txt");
		FileReader fr = null;
		Scanner ob = new Scanner(System.in);
		String searchByDate , str;
		System.out.println("Enter the Start date  Here for searching the records ");
		searchByDate = ob.nextLine();
		try {
			fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);
			while((str=br.readLine())!=null) {
				if(str.contains(searchByDate)) {
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
