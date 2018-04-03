package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

/**
 * This class defines YearToCentury object.<br>
 * 
 * 
 * @author YJW <br>
 * 
 */

public class YearToCentury {
		int year;
		
		public YearToCentury(int year) {
			this.year=year;
		}
		
	public int cal_century(int year) {
		int century;
		int yr =  year;
		if(yr%100 == 0) {
			century = yr/100;
		}
		else century = yr/100+1;
		return century;
	}
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Input year:");
		int year = input.nextInt();
		YearToCentury YTC = new YearToCentury(year);
		System.out.print(year+ " is " +YTC.cal_century(year)+"th century");
	}
}
