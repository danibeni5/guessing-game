//Daniel stepanenko
//A2 Major assigment
//Guess my number
//This program creates a game where you guess from 1 to 1000
//You only get 10 tries to guess the number, Trying again is possible

import java.util.*;
public class a2MajorStepanenkoDaniel {
;
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in);
   //Stores int
      int loop;
      int guess;
   
   //Game name
      System.out.println("Guess my number game");
      System.out.println("Created by Daniel Stepanenko");
      System.out.println("");
   
   
   
   
   //The loop that stops the game and gen ran num
      do{
      
      //Stores count
         int count=10;
         
      //Generates random numbers
         Random numGenerator = new Random(); 
         int ranNum;
      
      //Prints random number
         ranNum = numGenerator.nextInt(1000) + 1;
         System.out.println(ranNum);
      
      
      //The game loop
         do{
                     
         //Asks user for input
            System.out.println("Guess a number from 1 to 1000");
            guess = keyboard.nextInt();
         
         
           
         
                     
         //Tells user if number out of range
            if(guess >1000)
            {
               System.out.println("Number out of range");
            }
            else if(guess <0)
            {
               System.out.println("Number out of range");
            }
            //Tells user if num higher or lower
            else if(guess > ranNum)
            {
               System.out.println("Lower");
            }
            else if(guess < ranNum)
            {
               System.out.println("Higher");
            }
            
            //Removes your count
            count--;
         
         //Says your tries left
            if(count>=0){
               System.out.println("you have "+count +" Tries left");
            }
         //Stops program if out of tries 
            if(count<=0){
               System.out.println("You lose");
               System.out.println("The correct number was "+ranNum);
               break;
            }
         
         
         }while (guess != ranNum); //End of game
         
         
         
      //Says you won if you won
         if(ranNum == guess){
            System.out.println("You win");
         } 
      
      //Asks user to play again
         System.out.println("Type 1 to play again and 0 to stop");
         loop = keyboard.nextInt();
         
         
      }while(loop == 1);  
      //End of main loop
   
   
      System.out.println("Thank you for playing");
   }
}

