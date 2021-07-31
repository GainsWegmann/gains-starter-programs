package wheeloffoodApp;

public class restaurants {

	/* String[][] restaurant_names = new String[2][2]; */
public static String[][] restaurant_names = {{"Mcdonalds", "Wendys", "Chikfila"},{"Lil Rosies", "Taco Bell", "Chipotle"},{"Bravo Italian", "Olive Garden", "Grille 29"}, {"I love sushi", "Rock n Roll Sushi", "Sushi Barista"}, {"Bravo Italian", "Tellinis", "Pizza Hut"}};

	
	
	public static void printRow(int r){
	    for(int i=0; i<restaurant_names[r].length; i++){
	        if(i>0){
	            System.out.print(", ");
	        }
	     System.out.print(restaurant_names[r][i]);
	    }
	    
	   
	}
}
