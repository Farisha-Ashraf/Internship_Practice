import java.util.Scanner;
  class RockPaper{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Select one from rock,paper,scissor");
  System.out.println("Enter the user choice" );
  String userchoice=sc.next();
    System.out.println("Enter the computer choice ");
  String computerchoice=sc.next();
  if(userchoice.equals("computerchoice")){
       System.out.println("tie");
    }
   else if((userchoice.equals("Paper"))&&(computerchoice.equals("Rock"))||(userchoice.equals("Scissor"))&&(computerchoice.equals("Paper"))||(userchoice.equals("Rock"))&&(computerchoice.equals("Scissor"))){
      System.out.println("user wins");
    }
    else if((computerchoice.equals("Paper"))&&(userchoice.equals("Rock"))||(computerchoice.equals("Scissor"))&&(userchoice.equals("Paper"))||(computerchoice.equals("Rock"))&&(userchoice.equals("Scissor"))){
      System.out.println("computer wins");
    }
    else{
      System.out.println("invalid input!!");
    }
  }
}