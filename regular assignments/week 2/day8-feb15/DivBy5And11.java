import java.util.Scanner;
class DivBy5And11{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("enter the number : ");
    num=sc.nextInt();
    if(num%5==0&&num%11==0){
      System.out.println("number is Divisible by 5 and 11");
    }
    else {
      System.out.println("number is not Divisible by 5 and 11");
    }
  }
}