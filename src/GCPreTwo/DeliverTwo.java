package GCPreTwo;

import java.util.Scanner;

public class DeliverTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int year1 = 0;
		int year2 = 0;
		int month1 = 0;
		int month2 = 0;
		int date1 = 0;
		int date2 = 0;
		int totalDays = 0;
		
		System.out.println("Provide the earlier date entry for four digit year:");
		
		year1 = scnr.nextInt(); 
		System.out.println("Provide the earlier date entry for two digit month:");
		
		month1 = scnr.nextInt();
		System.out.println("Provide the earlier date entry for two digit date:");
		
		date1 = scnr.nextInt();
		
		System.out.println("Provide the later date entry for four digit year:");
		
		year2 = scnr.nextInt(); 
		System.out.println("Provide the later date entry for two digit month:");
		
		month2 = scnr.nextInt();
		System.out.println("Provide the later date entry for two digit date:");
		date2 = scnr.nextInt();
		
		totalDays = ((date2 - date1) + (month2-month1) *30) + ((year2-year1)*365);
		System.out.println(totalDays +  " days is the difference between the two dates");

	}

}
