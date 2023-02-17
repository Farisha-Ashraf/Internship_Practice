import java.util.Scanner;
class EvenOrOdd {
  public static void main (String arg[]){
    int num;
    Scanner sc= new Scanner(System.in);
    System.out.println("Odd or Even");
    System.out.println("enter the number : ");
    num=sc.nextInt();
    if(num%2==0){
      System.out.println("Yes !,Number is Even");
    }
    else{
      System.out.println("Yes !,Number is Odd");
    }
    
  }
}