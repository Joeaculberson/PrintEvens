package com.joe.culberson.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int evenNumber = getEvenNumber();
		printAllEvenNumbers(evenNumber);
	}

	private static void printAllEvenNumbers(int evenNumber) {
		//another way
		//for(int i = 0; i < evenNumber; i++) {
			//if(i % 2 == 0) {
			  //System.out.println(evenNumber);
			//}
		//}
		
		for(int i = 0; i < evenNumber; i = i + 2) {
			System.out.println(i);
		}
		System.out.println(evenNumber);
	}

	private static int getEvenNumber() {
		Scanner scanner = new Scanner(System.in);
		int evenNumber = -1;
		
		while(evenNumber % 2 != 0) {
			System.out.println("Enter an even number:");
			String evenNumberString = scanner.nextLine();
			evenNumber = Integer.parseInt(evenNumberString);
			
			if(evenNumber % 2 != 0) {
				System.out.println(evenNumber + " is not a valid entry. Please try again.");
			}
		}
		return evenNumber;
	}

}
