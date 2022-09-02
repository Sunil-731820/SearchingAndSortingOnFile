package com.java.search.searchData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class SearchByStartAndEndDate {
    public static void main(String[] args) throws IOException {
        System.out.println("This is the example of the search by start and end date");
        File input = new File("C:\\Users\\sunilg\\Desktop\\data.txt");
		FileReader fr = null;
		Scanner ob = new Scanner(System.in);
		String searchByStartDate , str,searchByEndDate;
		System.out.println("Enter the Start Date Here ");
		searchByStartDate = ob.nextLine();
		System.out.println("Enter the end Date Here ");
		searchByEndDate = ob.nextLine();
		try {
			fr = new FileReader(input);
			BufferedReader br = new BufferedReader(fr);
			while((str=br.readLine())!=null) {
				if(str.contains(searchByStartDate) && (str.contains(searchByEndDate))) {
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
