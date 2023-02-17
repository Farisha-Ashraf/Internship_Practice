import java.util.Scanner;
class PosNegZero{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("enter the number : ");
    num=sc.nextInt();
    if(num>0){
      System.out.println("number is Positive");
    }
    else if (num<0){
      System.out.println("number is Negative");
    }
    else {
      System.out.println("number is zero");
    }
  }
}