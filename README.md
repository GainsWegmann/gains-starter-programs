# gains-starter-programs
My very first programs.

We all start somewhere, I will be uploading my very first projects here to see how far I have come in time.

WheelOfFoodApp is an idea for a mobile application I have to solve the problem of couples or friends not being able to decide where to eat at a particular location. So far I've created in Java two classes, one for food types and one for restaurants. In these classes are methods which are implemented in the main method to output information for the user to choose from.
      Problems solved:
        1. How to randomly generate a food type with restaurant choices if user so chooses. I used this random_int code from Stack           overflow: int random_value = (int) Math.floor(Math.random() * ((foodTypes.count - 1) - 0 + 1) + 0);
        
        Then associating random_value with the .typecount variable for each foodType, thereby outputting that food type and  
        restaurant choices.
