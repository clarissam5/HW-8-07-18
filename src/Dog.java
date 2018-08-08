/*
 * HW Assignment 
 * Author:Clarissa Mercado
 * Date: 8-07-18
 */
public class Dog {
	//Class Attributes
	private String color;
	private String name;
	private String breed;
	private int hungry;
	private int energy;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getHungry() {
		return hungry;
	}

	public void setHungry(int hungry) {
		this.hungry = hungry;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	
	
	//constructor
	Dog (String color, String name, String breed, int hungry, int energy) {
		this.color = color;
		this.name = name;
		this.breed = breed;
		this.hungry = hungry;
		this.energy = energy;
	}
	
	//Instance methods 
	public void Sleep() {
		this.hungry++;
		this.energy++;
	}
	
	public void eat() {
		this.hungry--;
		this.energy++;
	}
	
	public void play() {
		this.hungry = this.hungry + 3;
		this.energy = this.energy-4;
	}
	
	public void alertHost() {
		if (hungry >= 8 || energy <= 2) {
			this.bark();
		}
	}
	
	private void bark() {
		System.out.println("bow wow");
	}
	
	
	@Override
	public String toString() {
		return "Dog [color=" + color + ", name=" + name + ", breed=" + breed + ", hungry=" + hungry + ", energy="
				+ energy + "]";
	}
		
	
}
