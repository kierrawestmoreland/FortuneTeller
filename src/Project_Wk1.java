import java.util.Scanner;

public class Project_Wk1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//int quit = input.nextInt();
		//System.exit.equals("quit"); --trying to use the System.exit(0) for the user to quit at anytime
		String tryAgain;

	do {
		
			System.out.println("What is your first name?");
			String firstname = input.next();

			System.out.println("What is your last name?");
			String lastname = input.next();

			System.out.println("How old are you?");
			int age = input.nextInt();

			System.out.println("What month were you born?");
			String birthmonth = input.next();

			System.out.println("What is your favorite ROYGBIV color?");
			System.out.println("Type \"Help\" for more information.");
			// String color = new String(); //so user can change the answer to a
			// color if help is chosen first

		//	String color = new String();
			String color = input.next();
			//System.out.print(color);

			if (color.equals("help") || color.equals("Help")) { // == doesn't
																// work well
																// with String
																// data types
				System.out.println("ROYGBIV stand for the colors:");
				System.out.println("red");
				System.out.println("orange");
				System.out.println("yellow");
				System.out.println("green");
				System.out.println("blue");
				System.out.println("indigo");
				System.out.println("violet");
				System.out.println("NOW, what is your favorite ROYGBIV color?");
				color = input.next();
			} 
			//else {
				//color = input.next();
			//}
			String fortunecolor;
			if (color.equals("red") || color.equals("Red")) 
				fortunecolor = "boat";
			 else if (color.equals("orange") || color.equals("Orange")) 
				fortunecolor = "train";
			 else if (color.equals("yellow") || color.equals("Yellow")) 
				fortunecolor = "plane";
			 else if (color.equals("green") || color.equals("Green")) 
				fortunecolor = "bike";
			 else if (color.equals("blue") || color.equals("Blue")) 
				fortunecolor = ("car");
			 else if (color.equals("indigo") || color.equals("Indigo")) 
				fortunecolor = "bus";
			 else if (color.equals("violet") || color.equals("Violet")) 
				fortunecolor = "motorcycle";
			 else 													
				fortunecolor = "undefined";
			
			//System.out.println(fortunecolor);
			

			System.out.println("How many siblings do you have?");
			int sibs = input.nextInt();

			int fortuneage;
			if (age % 2 == 0) { // which means whatever the user enters would be
								// an even #
				fortuneage = 7; // years until they retire
			} else {
				fortuneage = 28; // years until they retire
			}

			String fortuneForNumberOfSiblings;

			if (sibs > 3) {
				fortuneForNumberOfSiblings = ("Circleville, Ohio");
			} 
			else {

				switch (sibs) {
				case 0:
					fortuneForNumberOfSiblings = ("Seattle");
					break;
				case 1:
					fortuneForNumberOfSiblings = ("London");
					break;
				case 2:
					fortuneForNumberOfSiblings = ("Mobile, Alabama");
					break;
				case 3:
					fortuneForNumberOfSiblings = ("Gotham City");
					break;
				default: 
					fortuneForNumberOfSiblings = "undefined";
					System.out.println("Error");
				}
			}
		

			

			char firstCharMonth = birthmonth.charAt(0);
			char secondCharMonth = birthmonth.charAt(1);
			char thirdCharMonth = birthmonth.charAt(2);
			int fortuneMonthName;
			boolean firstNameContainsMonthCharacter = firstname
					.indexOf(firstCharMonth) >= 0; // true or false
			boolean lastNameContainsMonthCharacter = lastname
					.indexOf(firstCharMonth) >= 0; // true or false
			boolean firstNameContainsMonthCharacter2 = firstname
					.indexOf(secondCharMonth) >= 0; // true or false
			boolean lastNameContainsMonthCharacter2 = lastname
					.indexOf(secondCharMonth) >= 0; // true or false
			boolean firstNameContainsMonthCharacter3 = firstname
					.indexOf(thirdCharMonth) >= 0; // true or false
			boolean lastNameContainsMonthCharacter3 = lastname
					.indexOf(thirdCharMonth) >= 0; // true or false
			// which says if the first character in the birthmonth is somewhere
			// in
			// the first name it'll be >= 0 (which would represent the index
			// position)
			// OR do the same for the last name
			if (firstNameContainsMonthCharacter
					|| lastNameContainsMonthCharacter) {
				fortuneMonthName = 10000;
			} else if (firstNameContainsMonthCharacter2
					|| lastNameContainsMonthCharacter2) {
				fortuneMonthName = 50;
			} else if (firstNameContainsMonthCharacter3
					|| lastNameContainsMonthCharacter3) {
				fortuneMonthName = 8000;
			} else {
				fortuneMonthName = 600000;
			}

			System.out.println(firstname +" "+ lastname + " will retire in "
					+ fortuneage + " years with " + fortuneMonthName
					+ " in the bank, a vacation home in " + fortuneForNumberOfSiblings + " and a " + fortunecolor + ".");
			System.out.println("Would you like to try again?");
			tryAgain = input.next();
			//input.close();
		} 
	while (tryAgain.equals("yes")||tryAgain.equals("Yes"));
	input.close();
	}
}

// Part 2
//
// Done - use mod(%) and if statement - (age%2 ==0, else) and if statements - If
// the user’s age is an odd number, then they will retire in __7__ years, or
// _28__ years if their age is an even number.
// Done - use mod(%) and switch case - If the user’s number of siblings is 0,
// then they will live in _Seattle_(location), or 1 then they will live in
// _London_(location), or 2 then they will live in _Mobile, Alabma__ (location),
// or 3 then they will live in _Gotham City__ (location), or more than 3 then
// they will live in _Compton, California___ (location).
// Done - Depending on which ROYGBIV color is the user’s favorite, they will
// have a specific mode of transportation (i.e. car, boat, plane, etc.)
// Done - use indexOf and if statement (if indexof == -1 else) - If the first
// letter of the user’s birth month can be found in either their first or last
// name, then they will have $_10000___ in the bank, or if the second letter of
// the user’s birth month can be found in either the user’s first or last name,
// then they will have $__50__ in the bank, or if the third letter of the user’s
// birth month can be found in either the user’s first or last name, then they
// will have $_8000___ in the bank. If there are no common letters, then they
// will have $__600000__ in the bank.
// Part 3
//
// The user’s fortune should be written as such:
// [First Name] [Last Name] will retire in [# of Years] with [Amount of Money]
// in the bank, a vacation home in [Location] and a [Mode of Transportation].
// After telling the user’s fortune, ask the user if they would like to try
// again. If they would then the program should start over, otherwise the
// program should end.
// Program should be able to handle whether or not a user inputs capital or
// lowercase letters.
// Optional Extension Challenge:
//
// Give the user the ability to quit the program at any point where the program
// is looking for user input, by typing “Quit” (should not be case sensitive).
// The program should print “Nobody likes a quitter...” before ending.
// Give the user the ability to restart the program at any point where the
// program is looking for user input by typing “Restart” (should not be case
// sensitive).

// }

