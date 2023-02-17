//A user is trying to purchase an item online. If the item is in stock and they have enough funds in their account, the transaction will be processed. If the item is out of stock, they will be asked to try again later. If they do not have enough funds, they will be asked to add more money to their account.

import java.util.Scanner;
  class User{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the item");
  System.out.println("Book,specs,cloth");
  String item=sc.next();
  System.out.println("Enter the number of items need");
  int quantity=sc.nextInt();
  System.out.println("Enter the balance");
  int balance=sc.nextInt();
  int bookstock=10,specsStock=15,clothstock=20,amount;
  System.out.println("item" +item);
  if(item.equals("Book")){
    if(bookstock<quantity){
      System.out.println(" out of stock.Available stock is" +bookstock);
    }
    else{
      amount=quantity*20;
      if(amount<=balance)
      System.out.println(" transaction processed");
      else 
      System.out.println("add more money. your available balance is "+balance);
        }
  }
  else if( item.equals("specs")){
    if(specsStock<quantity)
      System.out.println(" out of stock.Available stock is" +specsStock);
    else{
      amount=quantity*2000;
      if(amount<=balance)
      System.out.println(" transaction processed");
      else 
      System.out.println("add more money. your available balance is "+balance);
        }
  }
  else if( item.equals("cloth")){
    if(clothstock<quantity)
      System.out.println(" out of stock.Available stock is" +clothstock);
    else{
      amount=quantity*2000;
      if(amount<=balance)
      System.out.println(" transaction processed");
      else 
      System.out.println("add more money. your available balance is "+balance);
        }
  }
  }
}

//A company gives its employees a bonus based on their performance. If an employee's performance is rated as "Excellent", they will receive a bonus of 10% of their salary. If their performance is rated as "Good", they will receive a bonus of 5% of their salary. If their performance is rated as "Average", they will receive a bonus of 2% of their salary. If their performance is rated as "Poor", they will receive no bonus.