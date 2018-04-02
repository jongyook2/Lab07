package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

/**
 * This class defines Buginfestation object.<br>
 * 
 * 
 * @author YJW <br>
 * 
 */

public class YearToCentury {
		
	public static int cal_century(int year) {
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
		int century = cal_century(year);
		System.out.print(year+ " is " +century+"th century");
	}
}
