package edu.handong.csee.java.lab07.prob3; //package name
import java.util.Random; //import Random class in java.util package

/**
 * This public class defines Attendance object.<br>
 * It has Constructor(public Attendance), main method, and random method<br>
 * Summary: instantiate Attendance class to 4 stu(Attendance(String Name, double Price, int stars)) and  print student name who miss class greater than 6<br>
 * 
 */
public class Attendance {
	String name; //declare instance variable(Attendance's name)
	String grade; //declare instance variable(Attendance's grade)
	int student_Num; //declare instance variable(Attendance's student_Num)
	int attendance_RD; //declare instance variable(Attendance's attendance_RD)
	/**
	 * This Constructor is used to initialize instance variable name, grade, student_Num, attendance_RD <br>
	 * parameter is String name, String grade, int student_Num, int attendance_RD <br>
	 * @author YJW <br>
	 * 
	 */
	public Attendance(String name, String grade, int student_Num, int attendance_RD) {
		this.name=name; //distinguish variable Name from parameter Name, store name in this.name
		this.grade=grade; //distinguish variable Name from parameter Name, store grade in this.grade
		this.student_Num=student_Num; //distinguish variable Name from parameter Name, store sutdent_Num in this.sutdent_Num
		this.attendance_RD=attendance_RD; //distinguish variable Name from parameter Name, store attendance_RD in this.attendance_RD
	}
	/**
	 * This public static int method is random that generates random number 0 to 10 (integer) <br>
	 * @return 10-R.nextInt(10) that is absent days
	 */
	public static int random() {
		Random R= new Random(); //instantiate Random to R
		return 10-R.nextInt(10); //R.nextInt(10) generate random number 0 to 10 and 10-R.nextInt(10) is miss class
	}
	/**
	 * This public static void method is main <br>
	 * instantiates Attendance Class to stu 1,2,3,4 <br>
	 * check student's absent days 4 times by for loop and if
	 * finally, it shows student name who absents class greater than 6 <br>
	 * if they are less than 6 or equal, it will give warning left chance <br> 
	 * 
	 */	
	public static void main(String[] args) {
		Attendance stu1 = new Attendance("jess", "4th grade", 21400999, random()); //instantiate Class Attendance to stu1("stu1.name", "stu1.grade", stu1.Attendance, stu1.attendance_RD)
		Attendance stu2 = new Attendance("Kent", "2nd grade", 21700111, random()); //instantiate Class Attendance to stu2("stu2.name", "stu2.grade", stu2.Attendance, stu2.attendance_RD)
		Attendance stu3 = new Attendance("Lucas", "1st grade", 21833222, random()); //instantiate Class Attendance to stu3("stu3.name", "stu3.grade", stu3.Attendance, stu3.attendance_RD)
		Attendance stu4 = new Attendance("Martha", "2nd grade", 21733444, random()); //instantiate Class Attendance to stu4("stu4.name", "stu4.grade", stu4.Attendance, stu4.attendance_RD)
		Attendance [] stu = {stu1, stu2, stu3, stu4}; // array instantiation to stu that has four Attendance instance(stu 1,2,3,4) 
		for(int i=0; i<4; i++) { //for loop (runs 3times)
			if(stu[i].attendance_RD > 6) { //we want to print students name who miss class greater than 6 
				System.out.println("I¡¯m sorry, " +stu[i].name+ ". You failed this course(miss: "+stu[i].attendance_RD+")"); //output(I'm sorry student name. You failed this course) is shown in your monitor
			}
			else { System.out.println(stu[i].name+ " was absent "+ stu[i].attendance_RD+" class");// miss class <=6 print absent class
			System.out.println("if you are absent more than "+(6-stu[i].attendance_RD)+", you will fail this course be careful"); //also give warning, do not be absent more than left chance 
			}
		}
	}
}
