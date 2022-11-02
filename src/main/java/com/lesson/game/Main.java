package com.lesson.game;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menuStart();
		recordInput();
	}
	
	public static void menuStart() {
		System.out.println("Welcome to the game____");
		System.out.println("Please select from the following options____");
		System.out.println("1 - Create new charachter for party");
		System.out.println("2 - Edit charachter for party");
		System.out.println("3 - view current party\n");
		
	}
	
	public static boolean recordInput() {
	    Scanner scanner = new Scanner(System.in);
	    String inputNum = scanner.nextLine();
	    scanner.close(); 
		switch(inputNum) {
			case "1" :
				System.out.println("chose option 1");
				return true;
			case "2":
				System.out.println("chose option 2");
				return true;
			case "3":
				System.out.println("chose option 3");
				return true;
			default:
				return false;
		}
		
	}
}
