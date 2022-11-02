package com.lesson.game;

import java.util.HashMap;

public class Wizard extends Character {

	private HashMap<String, Integer> magic = new HashMap<String, Integer>();

	public Wizard(String newName) {
		super(newName, "Wizard");

		setMagic("Heal", 10);
		setMagic("BLAST", 20);
		setMagic("invisiBLE", 30);

	}

	public int doMagic(int amount) {
		System.out.println("Doing magic " + amount + "...");
		return amount * 2;
	}

	public int getMagic(String spell) {
		spell = spell.toLowerCase();
		if (magic.containsKey(spell)) {
			return magic.get(spell);
		} else {
			return -1;
		}
	}	

	public int getMagicCount() {
		return magic.size();
	}
	
	public boolean maxSpells() {
		if(getMagicCount()> 5) {
			return true;
		}
		else {
			return false;
		}
	}

	public void setMagic(String spell, int value) {
		// create temporary default hashmap
		// insert value to default field
		// put the created hashamp into magic
		magic.put(spell.toLowerCase(), value);
	}

	/*
	 * public void setMagic(String spell, HashMap<String,Integer> value) {
	 * magic.put(spell.toLowerCase(), value); }
	 */

	public void testMagic() {
		System.out.println(magic);
	}

	// IF
	// SWITCH
	// HASHMAP

	public int doMagic(String spell) {
		int result = 0;
		switch (spell.toLowerCase()) {
		case "open seasme":
			result = doMagic(5);
			break;

		case "heal":
			result = doMagic(10);
			break;
		}

		return result;
	}

	public int doMagicHashMap(String spell) {
		HashMap<String, Integer> magic = new HashMap<String, Integer>();

		magic.put("heal", 10);
		magic.put("blast", 20);
		magic.put("invisible", 30);

		return magic.get(spell);
	}

}