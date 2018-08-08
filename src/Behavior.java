/*
 * HW Assignment 
 * Author:Clarissa Mercado
 * Date: 8-07-18
 */
//import java.lang.reflect.*; //needed to import this to invoke private method

public class Behavior {
	public static void main(String args[]) { //throw exception needed
		
		//String color, String name, String breed, int hungry, int energy
		Dog dog1 = new Dog("Black", "Spiky", "Bulldog", 5, 6);
		Dog dog2 = new Dog("White", "Nemo", "Husky", 6, 7);
		
		//use the below if we want to asscess the private method directly in another class
		/*Method m = Dog.class.getDeclaredMethod("bark");
		m.setAccessible(true); //helps get passed illegalaccess exception
*/		
		
		dog1.Sleep();
		dog1.eat();
		dog1.play();
		dog1.alertHost();
		System.out.println(dog1.toString());
		
		dog2.Sleep();
		dog2.eat();
		dog2.play();
		dog2.alertHost();
		System.out.println(dog2.toString());
		
	}
}
