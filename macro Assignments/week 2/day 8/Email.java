//5.A user is logging into a website. They can use their email address or username to log in. If they use their email address, their email will be validated. If they use their username, their username will be validated.
/*import java.util.Scanner;
class Email{
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String action=new String("SignUp");
    System.out.println("------------Welcome---------------");
    System.out.println(" SignUp?   Login?" );
    action=sc.next();
    System.out.println("------->" +action);
    
    String SignUp,  NewUsername, EmailID;
   if(action.equals("SignUp")){ 
          System.out.println(" Create your NewUsername ");
          NewUsername=sc.next();
          System.out.println("Enter your EmailID");
          EmailID= sc.next();
          System.out.println("------------ Successfully created profile------------");
        }
    else{
          String Login;
          System.out.println("------->Login");
          System.out.println(" Enter your Username ");
          String Username= sc.next();
          System.out.println("Enter your EmailID");
          EmailID= sc.next();
          if(Username.equals("NewUsername") && EmailID.equals("EmailID"))
                System.out.println("------------ Success------------");
          else
                System.out.println(" EmailID or Username is incorrect");
    }
  }
} */

import java.util.Scanner;
class Emailusername {
public static void main (String args[]){
Scanner sc= new Scanner (System.in);
  String userinput;
  System.out.println("Please enter username/email");
  userinput = sc.next();
  System.out.println("Verifying");
  if (userinput.equals("User2") || userinput.equals("user@gmail.com"))
      System.out.println("Access Granted");
  else
      System.out.println("Access Denied");
    }
}