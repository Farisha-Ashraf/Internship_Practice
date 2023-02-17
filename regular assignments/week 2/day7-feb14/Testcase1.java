import java.util.Scanner;
class Testcase1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the integer number");
    int num1=sc.nextInt();
    System.out.println("enter the number");
    double num2=sc.nextDouble();
    System.out.println("enter boolean number");
    boolean num3=sc.nextBoolean();
    System.out.println("enter character");
    char ch=sc.next().charAt(0);
    
    System.out.println("integer : "+num1);
    System.out.println("Double :"+num2);
    System.out.println("Boolean :"+num3);
    System.out.println("character :"+ch);
  }
}