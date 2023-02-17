import java.util.Scanner;
class VoteEligibility {
  public static void main (String arg[]){
    int age;
    Scanner sc= new Scanner(System.in);
    System.out.println("check vote eligibility");
    System.out.println("enter the age : ");
    age=sc.nextInt();
    if(age>18){
      System.out.println("your are Eligible for vote");
    }
    else{
      System.out.println("Your are not elibile for voting");
    }
    
  }
}