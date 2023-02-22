import java.util.*;
class Whiledivisibleby5sum{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n,sum=0;
    System.out.println("Enter the value");
    n=sc.nextInt();
    int i=1;
      while(i<=n){
        if(i%5==0){
        sum=sum+i;
      }
     i++;
          }
    System.out.println(i);
  }
}
