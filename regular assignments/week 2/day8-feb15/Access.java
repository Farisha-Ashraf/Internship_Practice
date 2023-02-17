import java.util.Scanner;
class Access{
  public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
    System.out.println("Create your Login Password");
    String Login_Password=sc.next();
    System.out.println("Successfully created Password" );
    System.out.println(" Enter your Password");
    String Password=sc.next();
    if(Password.equals(Login_Password)){
      System.out.println(" Granted access to the system");
    }
    else
      System.out.println("Incorrect Password : Access denied");
  }
}