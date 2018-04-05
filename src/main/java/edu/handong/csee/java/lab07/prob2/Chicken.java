package edu.handong.csee.java.lab07.prob2; //package name

/**
 * This class defines Chicken object.<br>
 * It has Constructor(public Chicken), getter, setter, main method, and print_Menu method<br>
 * Summary: instantiate 3 menus(Chicken(String Name, double Price, int stars)) and  print 3 menus by for loop<br>
 * 
 */
public class Chicken {
	String Name; //declare instance variable(Chicken's Name)
	double Price; //declare instance variable(Chicken's Price)
	int stars; //declare instance variable(Chicken's stars)
	/**
	 * This Constructor is used to initialize instance variable Name, Price, and stars<br>
	 * parameters are Name, Price, and stars <br>
	 * 
	 */
	public Chicken(String Name, double Price, int stars) {
		this.Name=Name; //distinguish variable Name from parameter Name, store Name in this.Name
		this.Price=Price; //distinguish variable Price from parameter Price, store price in this.Price
		this.stars=stars; //distinguish variable stars from parameter stars, store stars in this.stars
	}
	/**
	 * This method is print_Menu that prints menu's name and menu's stars <br>
	 * parameter is Chicken menu(instantiated Class)
	 * 
	 */
	public static void print_Menu(Chicken menu) {
		System.out.println(menu.getName()+"'s rating is "+menu.getStars()); //print menu.Name and menu.stars	
	}
	/**
	 * This method is main <br>
	 * instantiates Chicken Class to menu1,2,3 <br>
	 * call print_Menu method 3 times by for loop
	 * finally, it shows 3 menus's name and stars <br>
	 * 
	 */	
	public static void main(String[] args) {

		Chicken menu1 = new Chicken("Cheese_mustard",16000.0 ,3 ); //instantiate Class Chicken to menu1("menu.Name", menu.Price, menu.stars)
		Chicken menu2 = new Chicken("Honey_mustard",16000.0 ,4 ); //instantiate Class Chicken to menu2("menu.Name", menu.Price, menu.stars)
		Chicken menu3 = new Chicken("Spicey_chicken",16000.0 ,4 ); //instantiate Class Chicken to menu3("menu.Name", menu.Price, menu.stars)
		menu1.setName("cheese cheese super_mustard"); //change menu1's name by setName method(setter)
		menu2.setPrice(26000.0); //change menu2's Price by setPrice method(setter)
		menu3.setStars(1); //change menu3's Stars by setStars method(setter)
		Chicken [] menu= {menu1, menu2, menu3}; // array instantiation to menu that has three Chicken instance(menu1,2,3) 
		for(int i=0; i<3; i++) { //for loop (runs 3times)
			print_Menu(menu[i]); //call print_Menu method, parameter is menu(array)
		}

	}
	/**
	 * This method is Name getter of Chicken Class <br>
	 * @return Name
	 */	
	public String getName() {
		return Name; // getName() do return Name
	}
	/**
	 * This method is Name setter of Chicken Class <br>
	 * parameter is String name <br>
	 */
	public void setName(String name) {
		Name = name; //store name in Name
	}
	/**
	 * This method is Price getter of Chicken Class <br>
	 * @return Price
	 */
	public double getPrice() {
		return Price; // getPrice() do return Price
	}
	/**
	 * This method is Price setter of Chicken Class <br>
	 * parameter is double price <br>
	 */
	public void setPrice(double price) {
		Price = price; //store price in Price
	}
	/**
	 * This method is Stars getter of Chicken Class <br>
	 * @return stars
	 */
	public int getStars() {
		return stars; // getStars() do return Price
	}
	/**
	 * This method is Stars setter of Chicken Class <br>
	 * parameter is int stars <br>
	 */
	public void setStars(int stars) {
		this.stars = stars; //store stars in this.stars

	}
}
