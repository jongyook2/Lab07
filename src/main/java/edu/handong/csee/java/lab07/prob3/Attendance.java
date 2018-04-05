package edu.handong.csee.java.lab07.prob3; //package name
import java.util.Random; //import Random class in java.util package

/**
 * This public class defines Attendance object.<br>
 * It has Constructor(public Attendance), main method, and random method<br>
 * Summary: instantiate Attendance class to 4 stu(Attendance(String name, String grade, int student_Num, int miss_RD)) and  print student name who miss class greater than 6<br>
 * also, give warning, do not be absent more than left chance (6-miss_RD)
 * 
 *  @author YJW <br>
 */
public class Attendance {

	String name; //declare instance variable(Attendance's name)
	String grade; //declare instance variable(Attendance's grade)
	int student_Num; //declare instance variable(Attendance's student_Num)
	int miss_RD; //declare instance variable(Attendance's miss_RD)
	/**
	 * This Constructor is used to initialize instance variable name, grade, student_Num, miss_RD <br>
	 * parameter is String name, String grade, int student_Num, int miss_RD <br>
	 * 
	 */
	public Attendance(String name, String grade, int student_Num, int miss_RD) {
		this.name=name; //distinguish variable Name from parameter Name, store name in this.name
		this.grade=grade; //distinguish variable Name from parameter Name, store grade in this.grade
		this.student_Num=student_Num; //distinguish variable Name from parameter Name, store sutdent_Num in this.sutdent_Num
		this.miss_RD=miss_RD; //distinguish variable Name from parameter Name, store attendance_RD in this.attendance_RD
	}
	/**
	 * This method is name getter of Attendance Class <br>
	 * @return name
	 */	
	public String getName() {
		return name; //getName() do return name
	}
	/**
	 * This method is Name setter of Attendance Class <br>
	 * parameter is String name <br>
	 */
	public void setName(String name) {
		this.name = name; //store name in this.name
	}
	/**
	 * This method is grade getter of Attendance Class <br>
	 * @return grade
	 */	
	public String getGrade() {
		return grade; //getGrade() do return grade
	}
	/**
	 * This method is grade setter of Attendance Class <br>
	 * parameter is String grade <br>
	 */
	public void setGrade(String grade) {
		this.grade = grade; //store grade in this.grade
	}
	/**
	 * This method is student number getter of Attendance Class <br>
	 * @return student_Num
	 */	
	public int getc() {
		return student_Num; //getStudent_Num() do return student_Num
	}
	/**
	 * This method is student number setter of Attendance Class <br>
	 * parameter is student_Num <br>
	 */
	public void setStudent_Num(int student_Num) {
		this.student_Num = student_Num; //store student_Num in this.student_Num
	}
	/**
	 * This method is miss_RD getter of Attendance Class <br>
	 * @return miss_RD
	 */	
	public int getMiss_RD() {
		return miss_RD; //getMiss_RD() do return miss_RD
	}
	/**
	 * This method is miss_RD setter of Attendance Class <br>
	 * parameter is int miss_RD <br>
	 */
	public void setMiss_RD(int miss_RD) {
		this.miss_RD = miss_RD; //store miss_RD in this.miss_RD
	}
	/**
	 * This public static int method is random that generates random number 0 to 10 (integer) <br>
	 * @return R.nextInt(10) that is absent days
	 */
	public static int random() {
		Random R= new Random(); //instantiate Random to R
		return R.nextInt(10); //R.nextInt(10) generate random number 0 to 10 and R.nextInt(10) is miss class
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
		Attendance stu1 = new Attendance("jess", "4th grade", 21400999, 0); //instantiate Class Attendance to stu1("stu1.name", "stu1.grade", stu1.student_Num, stu1.miss_RD)
		Attendance stu2 = new Attendance("Kent", "2nd grade", 0, 0); //instantiate Class Attendance to stu2("stu2.name", "stu2.grade", stu2.student_Num, stu2.miss_RD)
		Attendance stu3 = new Attendance("Lucas", "", 21833222, 0); //instantiate Class Attendance to stu3("stu3.name", "stu3.grade", stu3.student_Num, stu3.miss_RD)
		Attendance stu4 = new Attendance("", "2nd grade", 21733444, 0); //instantiate Class Attendance to stu4("stu4.name", "stu4.grade", stu4.student_Num, stu4.miss_RD)
		Attendance [] stu = {stu1, stu2, stu3, stu4}; // array instantiation to stu that has four Attendance instance(stu 1,2,3,4) 
		stu4.setName("Martha"); //store "Martha" in stu4's name(setter)
		stu3.setGrade("1st grade"); //store "1st grade" in stu3's grade(setter)
		stu2.setStudent_Num(21700111); //store 21700111 in stu3's student_Num(setter)
		for(int i=0; i<4; i++) { //for loop (runs 4times)
			stu[i].setMiss_RD(random()); // store random number in stu[i]'s miss_RD(setter)
			if(stu[i].getMiss_RD() > 6) { //we want to print students name who miss class greater than 6 
				System.out.println("I¡¯m sorry, " +stu[i].getName()+ ". You failed this course(miss: "+stu[i].miss_RD+")"); //output(I'm sorry student name. You failed this course) is shown in your monitor
			}
			else { System.out.println(stu[i].getName()+ " was absent "+ stu[i].getMiss_RD()+" class");// miss class <=6 print absent class
			System.out.println("if you are absent more than "+(6-stu[i].getMiss_RD())+", you will fail this course be careful"); //also give warning, do not be absent more than left chance 
			}
		}
	}
}
