package textAdventure;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Introduction and name/class selection
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome mighty adventurer! What shall we call you?");

		String nameInput = input.nextLine();

		String adventurerName = nameInput;

		System.out.println(adventurerName + "...a um mighty name I suppose yes. You are a witch I suppose?");

		String response1 = input.nextLine();

		switch (response1) {

		case "Yes":
			System.out.println("Great");
			break;
		case "yes":
			System.out.println("Great");
			break;
		default:
			System.out.println("Well y'are now heh. Other classes are...too complicated to include");
		}
			System.out.println("Anyways, you've just woken up in a small, damp cell. Moss grows on the walls. You see a weak looking iron door, do you try and push it? Y/N");
			System.out.println("Your current health point(s): " + Witchclass.getHealth() );
		
		String response2 = input.nextLine();
		
		switch(response2) {
		
		case "Y":
		System.out.println("You're to small and feeble, the door doesn't quite give.");
			break;
		case "N":
			System.out.println("Ah so you just want to rot right here then? Got it.");
			break;
		default:
			System.out.println("Hm what?");
			
		}
		System.out.println("Would you like to 'charge' the door (loud) or use a witchy 'spell' (quiet)?");
		
		String response3 = input.nextLine();
		
		switch(response3) {
		
		case "charge":
		System.out.println("You put the entirety of your light weight behind the charge but you just end up with a sore head and shouldero budge the door. Just use your witchy powers...okay? Press Enter");
		Witchclass.Health=Witchclass.Health - 1;
		System.out.println("Your current health point(s): " + Witchclass.getHealth());
		break;
		case "spell":
		System.out.println("The iron disintegrates into dust and falls silently to the ground..");
		break;
		}
		
		
		
		
		
		System.out.println(Witchclass.getFireball());
		System.out.println(Witchclass.getmindPulse());
		
		Witchclass.getHealth();
	}

}
////****Can build an interface for combat, including 2 attacking methods and perhaps a fleeing method****///
////***By using the interface I can have a generic method "att1" "fleeattempt" etc. for each encounter and have different outputs***///