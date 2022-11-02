package com.lesson.game;

public class Character{
	private int health = 100;
	private String name = "unknown";
	public int strength = 0;
	public String type = "unknown";

	public Character() {
		System.out.println("Character initiated -- without -- name");
	}

	public Character(String newName) {
		name = newName;
		System.out.println(type + " character initiated with name...");
	}

	public Character(String newName, String type) {
		// this(newName);
		this.type = type;
		name = newName;
		System.out.println(type + " initiated with name...");
	}

	public int getHealth() {
		return health;
	}

	public String getName() {
		return name;
	}

	public String getName(String version) {
		String name = this.getName();
		switch (version.toUpperCase()) {
		case "STYLISH":
			name = "#" + name + "#";
			break;
		case "WARNING":
			name = name.toUpperCase();
			break;
		case "REMINDER":
			name = "[" + name + " " + name + "]";
			break;
		}
		return name;
	}

	public String getType() {
		return type;
	}

	public void doSomething() {
		System.out.println("I will do something...");
	}

	/*
	 * public boolean setHealth(int value) { boolean valid = value >= 0; if(valid) {
	 * this.health = value; } return valid;
	 * 
	 * }
	 */

	public int setHealth(int value) {
		if (value >= 0) {
			this.health = value;
		} else {
			this.health = 0;
		}
		return this.health;

	}

	public void setName(String name) {
		this.name = name;
	}
	
    public String[] getInventory() {
        String[] inventory = null;
        return inventory;

    }

}