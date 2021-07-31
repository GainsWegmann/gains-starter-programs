package wheeloffoodApp;

import java.util.Scanner;

public class realApp {

	public static void main(String[] args) {

//******NEED TO FIX THIS PART, FIGURE OUT WHERE TO END METHOD BODIES******//
// Scanner input allows user input which is a crucial part of this program.
		Scanner input = new Scanner(System.in);

// Names of each foodType is entered. This method chosen for easy reference		// below.
		foodTypes type1 = new foodTypes("Fast Food");
		foodTypes type2 = new foodTypes("Mexican");
		foodTypes type3 = new foodTypes("Fine Dining");
		foodTypes type4 = new foodTypes("Sushi");
		foodTypes type5 = new foodTypes("Italian");

//Initial user input request to start program
		System.out.println("Hello! Would you like to get started? Please type 'Yes' or 'No' then press enter.");
		String line1 = input.nextLine();
//switch method to either end program or continue
		switch (line1) {
//this case to start program and ask for a random computer choice or user choice.
		case "Yes":
			System.out.println("Okay, please type 'random' for the computer to choose a food type or 'choose.'");
			break;
//This cases to end program.
		case "No":
			System.out.println("Okay, goodbye.");
			break;
		}
//Input requested to determine whether user would like to choose a category or have the computer choose.
		String line2 = input.nextLine();
		switch (line2) {
//*******FOR EACH OF THESE CASES NEED TO DETERMINE HOW TO PRINT JUST THOSE RESTAURANT CHOICES*****///
		case "random":

			int random_value = (int) Math.floor(Math.random() * ((foodTypes.count - 1) - 0 + 1) + 0);

			if (random_value == type1.typecount) {
				System.out.println("Fast food is the chosen category.");
				restaurants.printRow(0);
			}
			if (random_value == type2.typecount) {
				System.out.println("Mexican is the chosen category.");
				restaurants.printRow(1);
			}
			if (random_value == type3.typecount) {
				System.out.println("Fine dining is the chosen category.");
				restaurants.printRow(2);
			}
			if (random_value == type4.typecount) {
				System.out.println("Sushi is the chosen category.");
				restaurants.printRow(3);

			}
			if (random_value == type5.typecount) {
				System.out.println("Italian is the chosen category.");
				restaurants.printRow(4);
			}
			break;

		case "choose":

			System.out.printf("You don't trust me? Just kidding, your choices are: \n\t" + type1.getName() + "\n\t"
					+ type2.getName() + "\n\t" + type3.getName() + "\n\t" + type4.getName() + "\n\t" + type5.getName());
			System.out.printf("\nPlease choose one.");
			String line3 = input.nextLine();

			switch (line3) {
			case "Fast Food":
				System.out.println("Okay your choices are: ");
				restaurants.printRow(0);
				break;
			case "Mexican":
				System.out.println("Okay your choices are: ");
				restaurants.printRow(1);
			case "Fine Dining":
				System.out.println("Okay your choices are: ");
				restaurants.printRow(2);
				break;
			case "Sushi":
				System.out.println("Okay your choices are: ");
				restaurants.printRow(3);
				break;
			case "Italian":
				System.out.println("Okay your choices are: ");
				restaurants.printRow(4);
			}
		}
		// *********NEED TO FIGURE OUT HOW TO FORMAT SO CHOICES ARE ALIGNED NICELY

		// STRAIGHT DOWN*********////

	}
}
