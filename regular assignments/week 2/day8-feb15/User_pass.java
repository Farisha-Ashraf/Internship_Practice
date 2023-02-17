import java.util.Scanner;
class User_pass {
  public static void main (String args[]){
    Scanner sc= new Scanner (System.in);
    String Username,Email,userinput;
    System.out.println("Create User name");
    Username =sc.next();
    System.out.println("User name created successfully");
    Email=("user@gmail.com");
    System.out.println("Please enter username/email");
    userinput = sc.next();
    if (userinput.equals(Username) || userinput.equals(Email))
      System.out.println("Access Granted");
    else
      System.out.println("Access Denied");
  }
}