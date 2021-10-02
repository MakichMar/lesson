package iterations;

import java.util.Scanner;

public class guessingGame{
  public void  paly(){
      int randomNumb = (int) (Math.random() * 10);
      Scanner inputScanner = new Scanner(System.in);
      boolean userWon = false;
      do {
          System.out.println("Please insert your guess.");
          int guess = inputScanner.nextInt();
          System.out.println("You insserted ; " + guess);
          if (guess == randomNumb) {
              System.out.println("you won ");
              userWon = true;
          }else {
              System.out.println(" Your guess was incorrect .\nTry again. ");

          }

      }while(!userWon);




    }
}
