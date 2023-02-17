import java.util.Scanner;
  class Salary{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    double salary,annual_salary,tax=0, net_salary;
    System.out.println("Enter your salary");
    salary=sc.nextDouble();
    annual_salary=salary*12;
    System.out.println("  your annual salary : " +annual_salary);
  if(annual_salary<300000){
  System.out.println("You have no gst tax");
  }
     else if(annual_salary>300000 && annual_salary<600000){
            System.out.println("you have to pay 5% of income");
             tax=annual_salary*0.5;
            
     }
      else if(annual_salary>600000 && annual_salary<900000){
            System.out.println("you have to pay 10% of income");
             tax=annual_salary*0.10;
            
      }
       else if(annual_salary>900000 && annual_salary<1200000){
            System.out.println("you have to pay 15% of income");
             tax=annual_salary*0.15;
           
       }
       else if(annual_salary>1200000 && annual_salary<1500000){
            System.out.println("you have to pay 15% of income");
             tax=annual_salary*0.15;
           
       }
         else {
            System.out.println("you have to pay 30% of income");
             tax=annual_salary*0.30;
                   }
     System.out.println( "your tax is  "+tax);
      net_salary=annual_salary-tax;
    System.out.println(" You net salary :" +net_salary);
    }
  }