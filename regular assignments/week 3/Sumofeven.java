import java.util.*;
class Sumofeven { 
  public static void main(String args[]){     
    int n, sum=0;   
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter n value");
    n=sc.nextInt();      
    for(int i=0;i<=n;i=i+2){ 
      sum=sum+i;
    }
        System.out.println("the sum of even numbers is" +sum);   
      
    }       
  } 
