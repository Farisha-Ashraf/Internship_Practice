import java.util.Scanner;
class Online{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to ecart:");
    double balance=50;
    System.out.println("Select item:pen");
    String Item=sc.next();
    int amt=0,pen=10;
    System.out.println("quantity:");
    int q=sc.nextInt();
    if(pen<q){
      System.out.println("out of stock and available quantity is : "+pen); 
    }
    if(Item.equals("pen")&& pen>q)
    {
      amt=q*5;
      System.out.println("Amount"+amt);
    }
    else
      System.out.println("Product is out of stock");
    
    if(amt<=balance && q<=pen)
    {
        System.out.println("Purchased "+Item);
        balance=balance-amt;
        System.out.println("Balance:"+balance);
    }
    else if(amt>balance)
      System.out.println("Add more money to your account!!Insufficient balance");
  }
}