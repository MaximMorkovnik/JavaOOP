package com.gmail.morkovnik.maxim;

public class Cat {

	private String name;
	private String type;
	private String eyeColor;
	private double weight;
	private boolean hunger;

	public Cat(String name, String type, String eyeColor, double weight, boolean hunger) {
		super();
		this.name = name;
		this.type = type;
		this.eyeColor = eyeColor;
		this.weight = weight;
		this.hunger = hunger;
	}

	public Cat() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isHunger() {
		return hunger;
	}

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}

	public String eat() {
		String phrase = " ";
		if (isHunger() == true) {
			phrase = "Meow, I`m hungry";
			setHunger(false);
		} else {
			phrase = "Now I`m full";
		}
		return phrase;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + ", eyeColor=" + eyeColor + ", weight=" + weight + ", hunger="
				+ hunger + "]";
	}

}
