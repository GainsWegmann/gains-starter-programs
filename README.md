# gains-starter-programs
My very first programs.

We all start somewhere, I will be uploading my very first projects here to see how far I have come in time.

WHEELOFFOODAPP is an idea for a mobile application I have to solve the problem of couples or friends not being able to decide where to eat at a particular location. So far I've created in Java two classes, one for food types and one for restaurants. In these classes are methods which are implemented in the main method to output information for the user to choose from.

Problems solved:
 1. How to randomly generate a food type with restaurant choices if user so chooses. I used this random_int code from 			     Stackoverflow: int random_value = (int) Math.floor(Math.random()*((foodTypes.count - 1) - 0 + 1) + 0);
	  Then associating random_value with the .typecount variable for each foodType, thereby outputting that food type along 		  with restaurant choices.
	  
 2. If user chooses the "choose" branch then chooses a food type had to align restaurant choices nicely. I used string formatting 		such as \n and \t in order to align the choices.

textAdventure is a very simple console-based adventure application in progress. Right now I've implemented a Witch class for the user and a Combat interface. The interface's purpose is to make two attacks (and perhaps a defense and flee method) for each class. I am creating static Strings with getters to be implemented in the main method. I've created a Health integer which is updated after each interaction.

Problems solved:
1. Dealing with mistaken user inputs. If a user inputs something that doesn't match up with the options I move on with a quirky message and repeat the question using a switch method.

Features planned:
*Additional class, berserker
*3 different enemy types
*At least a flee method added to combat interface
