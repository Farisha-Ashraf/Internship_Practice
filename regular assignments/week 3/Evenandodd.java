import java.util.*;
class Evenandodd  { 
  public static void main(String args[]){     
    int n;     
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter n value");
    n=sc.nextInt();      
    System.out.println("Even numbers are");
    for(int i=1;i<=n;i++){ 
      if(i%2==0){
        System.out.println(i);   
      }
    }
    System.out.println("Odd numbers are");
    for(int i=1;i<=n;i++){ 
      if(i%2 !=0){
        System.out.println(i);
      }
  } 
  }
}

/*import java.util.*;
class EvenNOdd2N  { 
  public static void main(String args[]){     
    int n;     
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter n value");
    n=sc.nextInt();      
    for(int i=1;i<=n;i++){ 
      if(i%2==0){
        System.out.println("Even Number : ");
        System.out.println(i);   
      }
      else{
        System.out.println("Odd Number : ");
        System.out.println(i);
      }
    }       
  } 
}*/