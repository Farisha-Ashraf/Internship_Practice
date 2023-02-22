import java.util.*;
class Divisibleby5  { 
  public static void main(String args[]){     
    int n;     
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter n value");
    n=sc.nextInt();      
    for(int i=0;i<=n;i++){ 
      if(i%5==0){
        System.out.println(i);   
      }
    }       
  } 
}