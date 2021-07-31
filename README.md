# gains-starter-programs
My very first programs.

We all start somewhere, I will be uploading my very first projects here to see how far I have come in time.

WHEELOFFOODAPP is an idea for a mobile application I have to solve the problem of couples or friends not being able to decide where to eat at a particular location. So far I've created in Java two classes, one for food types and one for restaurants. In these classes are methods which are implemented in the main method to output information for the user to choose from.

Problems solved:
 1. How to randomly generate a food type with restaurant choices if user so chooses. I used this random_int code from 			     Stackoverflow: int random_value = (int) Math.floor(Math.random()*((foodTypes.count - 1) - 0 + 1) + 0);
	  Then associating random_value with the .typecount variable for each foodType, thereby outputting that food type along 		  with restaurant choices.
	  
 2. If user chooses the "choose" branch then chooses a food type had to align restaurant choices nicely. I used string formatting 		such as \n and \t in order to align the choices.

Features I'd like to add in an android application:
1. Choose the food types randomly chosen by the application
2. Google directions embedded within app
3. Have a smooth wheel that randomly stops on one of the user's selected food types.
4. Flow of the App: Startup>User chooses food types and confirms>Spins wheel with food types on it>Whatever type the wheel lands on, the app outputs the top 3-5 restaurants in the area with the best reviews>User can instantly get Google Maps directions to any of those restaurants or respin.
