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
	public int input_year() {
		Scanner input =new Scanner(System.in);
		System.out.println("Input year:");
		int year = input.nextInt();
		return year;
	}
	
	public int cal_century() {
		int century;
		int yr=input_year();
		if(yr%100 == 0) {
			century = yr/100;
		}
		else century = yr/100+1;
		return century;
	}
	
	public void print_century() {
		System.out.print(input_year() + " is " +cal_century()+"th century");
	}

}
