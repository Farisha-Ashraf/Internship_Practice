import java.util.*;
class FactorsWhile{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n, fact;
    System.out.println("Enter the number");
    n=sc.nextInt();
    int i=1;
    while(i<=n/2){
      if(n%i==0){
      System.out.println(i);
      }
        i++;
    
  }
}
}