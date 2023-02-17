//A company gives its employees a bonus based on their performance. If an employee's performance is rated as "Excellent", they will receive a bonus of 10% of their salary. If their performance is rated as "Good", they will receive a bonus of 5% of their salary. If their performance is rated as "Average", they will receive a bonus of 2% of their salary. If their performance is rated as "Poor", they will receive no bonus.

import java.util.Scanner;
  class Employee{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your rating");
   String rating=sc.next();
  System.out.println("rating"+rating);
  if(rating.equals("Excellent"))
    System.out.println("you have bonus of 10%");
  else if(rating.equals("Good"))
    System.out.println("you have bonus of 5%");
  else if(rating.equals("Average"))
    System.out.println("You have bonus of 2%");
  else if(rating.equals("poor"))
    System.out.println("you have no bonus");
    }
  }