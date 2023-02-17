import java.util.Scanner;
  class EmployeeRating{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your rating");
   String rating=sc.next();
  System.out.println("rating "+rating);
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