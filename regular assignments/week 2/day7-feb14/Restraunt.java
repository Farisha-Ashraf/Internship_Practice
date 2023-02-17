import java.util.Scanner;
class Restraunt{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Restaurant Bill");
    System.out.println("Enter the cost of the food :");
    double cost=sc.nextDouble();
    double tax=cost*18/100;
    System.out.println("enter the tip : ");
    int tip=sc.nextInt();
    double total=cost+tax+tip;
    System.out.println("total cost = "+total);
    System.out.println(tax);
  }
}