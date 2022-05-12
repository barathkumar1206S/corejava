package com.chainsys.introduction;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserName();
	}
	public static void UserName() {
	Scanner sc = new Scanner(System.in); // Input Stream
	// Prompt a message in the display console
	System.out.println("Enter your name");
	// Get name from the keyboard input device and store the name in a local
	// variable
	String username = sc.nextLine();
	sc.close(); // Closing the input Stream
	// Streams are created and managed by the OS.Scanner is just a handle
	System.out.println("Name is:" + username); // Display the input value
	char[] nameAsCharacters = username.toCharArray();
	int lengthofCharArray = nameAsCharacters.length;
	System.out.println("Length of your name is : " + lengthofCharArray);
	if (lengthofCharArray < 3) {
	System.out.println("Name must have atleast 3 characters");
	return;
	}
	if (lengthofCharArray > 15) {
	System.out.println("Name must not have more than 15 Charcters");
	return;
	}
	// ASCII value for alphabets is 65 to 90 for UPPER CASE
	String nameinuppercase = username.toUpperCase();
	// remove blank space before and after the name
	nameinuppercase = nameinuppercase.trim();

	char[] uppercaseCharArray = nameinuppercase.toCharArray();
	lengthofCharArray = uppercaseCharArray.length;
	int asciivalue = 0;

	for (int index = 0; index < lengthofCharArray; index++) {
	asciivalue = (int) uppercaseCharArray[index];

	System.out.println("ASCII : " + asciivalue);

	if (asciivalue < 65 || asciivalue > 90) {
	if (asciivalue != 32) {
	System.out.println(" In valid character in name : ");
	return;
	}
	}
	}
		

	}

}
