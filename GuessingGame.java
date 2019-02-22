import java.util.*;
class GuessingGame {
    public static void main(String[] args) {
      char inputAns = 'y';
      Scanner menu = new Scanner(System.in);
      while (inputAns == 'y') {
        playGame();
        System.out.print("Would you like to play again? (\"y\" for yes, \"n\" for no): ");
        inputAns = menu.next().charAt(0);
      }
      
    }
    
    public static void playGame() {
      int tries = 0;
      int inNum = 0;
      int finalNum = random1to100();
      Scanner userInput = new Scanner(System.in);
      System.out.print("Please Guess A Number: ");
      while (inNum != finalNum) {
        if (tries != 0) {
          System.out.print("Try " + (tries + 1) + ": ");
        }
        inNum = userInput.nextInt();
        tries++;
        if (inNum < finalNum){
          System.out.println("too LOW!");
        } else if (inNum > finalNum) {
          System.out.println("too HIGH!");
        }
      }
      System.out.println("\nSuccess! Congrats! " + finalNum + " was the number! It only took you a whopping " + tries + " tries!");
    }
    public static int random1to100() {
      Random rand = new Random();
      int num = rand.nextInt(99);
      num++;
      return num;
    }
}
