import java.util.*;
class AtmTransaction{
    public static void main(String args[]){
    Scanner sc =new Scanner (System.in); 
    double balance=1000; 
    String pin = "1234";
    String newPin;
      int choice,withraw;
    System.out.println("welcome to the bank of baroda"); 
    System.out.println("1.check balance");
    System.out.println("Enter the choice(1-5)");
    choice=sc.nextInt();
    switch(choice){
    case 1:
          System.out.println("The balance is"+balance);
          break;
    case 2:
        System.out.println("Enter the pin");
        pin = sc.next();
        if(pin.equals("1234")&&balance>=1000){
          System.out.println("Enter the amount to withraw");
          withraw=sc.nextInt();
          System.out.println("Enter the amount to be withdrawed");
          withraw=sc.nextInt();
            
         }
          else if(pin.equals("1234")&&balance<1000){
              System.out.println("Insufficient Balance");
              }
          else{
              System.out.println("Enter the correct pin");
        }
        break;
     case 3:
        if(pin.equals("1234")){
          System.out.println("Enter the amount to be deposited");
          }
       else{
      System.out.println("Enter the correct pin");
          }
        break;
 case 4:
      if(pin.equals("1234")){
      System.out.println("Enter your new pin: ");
      newPin = sc.next();
      System.out.println("ReEnter your new pin: ");
      newPin = sc.next();
      System.out.println("Your pin as been succesfully changed : ");
      }
      else{
          System.out.println("Your pin is incorrect: ");
        }
      break;
 case 5:
      System.out.println("Thank you for Banking with us ");
      break;
  default:
      System.out.println("Invalid: ");
      }  
}    
}

