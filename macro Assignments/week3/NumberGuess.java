// 1. Number Guessing Game: Create a number guessing game where the user has to guess a randomly generated number within a certain range. Use loops to repeatedly prompt the user for a guess and conditional statements to check if the guess is correct.
import java.util.Random; 
import java.util.Scanner;
class NumberGuess{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random random = new Random(); 
    int randomnumber=random.nextInt(100);
    //System.out.println(randomnumber);
    int Guess=0;
    do{
      System.out.println("Guess Number:");
      Guess=sc.nextInt();
      if(randomnumber==Guess)
        System.out.println(" Correct Guess!!Congrats");
      else
        System.out.println(" Incorrect Guess!!Try Again");
    }while(randomnumber!=Guess);
  }
}