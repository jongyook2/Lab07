package edu.handong.csee.java.lab07.prob1; //package name
import java.util.Scanner; //import standard input from keyboard

/**
 * This class defines YearToCentury object.<br>
 * It has Constructor(public YearToCentury), main method, and cal_century method<br>
 * Summary: convert year to century and print<br>
 * @author YJW <br>
 * 
 */

public class YearToCentury {
	int year; //declare instance variable

	/**
	 * This Constructor is used to initialize instance variable year<br>
	 * parameter is int year <br>
	 * @author YJW <br>
	 * 
	 */
	public YearToCentury(int year) { //constructor
		this.year=year; //distinguish variable year from parameter year
	}
	/**
	 * This method is cal_century that converts year to century<br>
	 * @return century <br>
	 * 
	 */

	public int cal_century(int year) {
		int century; //declare loacl variable
		int yr =  year; //declare loacl variable
		if(yr%100 == 0) { //if true-> 
			century = yr/100; //century is yr/100 (1900->19th)
		}
		else century = yr/100+1; //else century is yr/100+1 (1899->19th)
		return century; //method do return century(int)
	}
	/**
	 * This method is main that gets year(int value) by users <br>
	 * instantiates YearToCentury Class to YTC <br>
	 * print year is ?th century <br>
	 * 
	 */
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in); //instantiate Class Scanner to input
		System.out.println("Input year:"); //output(Input year:) is shown in your monitor
		int year = input.nextInt(); //year is input(int type) from keyboard
		YearToCentury YTC = new YearToCentury(year); //instantiate Class YearToCentury to YTC
		System.out.print(year+ " is " +YTC.cal_century(year)+"th century"); //output(YYYY is XXth century) is shown in your monitor
	}
}
