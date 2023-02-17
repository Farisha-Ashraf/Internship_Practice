import java.util.Scanner;
class CoffeeSho{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int stock=1000;
    System.out.println("coffee beans in stock: "+stock);
    System.out.println("Enter the number coffee beans user have :");
    int user_have=sc.nextInt();
    int current_stock=stock-user_have;
    System.out.println("Current Coffee bean in stock: "+current_stock);
    
  }
}