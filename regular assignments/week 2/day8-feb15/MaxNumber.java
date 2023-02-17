import java.util.Scanner;
class MaxNumber{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int num1,num2,num3;
    System.out.println("enter the number1 : ");
    num1=sc.nextInt();
    System.out.println("Enter the numer 2:");
    num2=sc.nextInt();
    System.out.println("Enter the numer 3:");
    num3=sc.nextInt();
    if(num1>num2&&num1>num3){
      System.out.println("number1 is max");
    }
    else if (num2>num1&&num2>num3){
      System.out.println("number2 is max");
    }
    else{
      System.out.println("number3 is max");
    }
    
  }
}