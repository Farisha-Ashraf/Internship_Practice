import java.util.*;
class WhileEven  { 
  public static void main(String args[]){     
    int n;     
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter n value");
    n=sc.nextInt();
    int i=0;
    while(i<=n){ 
      if(i%2==0){
        System.out.println(i); 
        
      }
      i++;
    }       
  } 
}