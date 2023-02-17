// 14. WAP to input basic salary of an employee and calculate its Gross     salary according to following:
//     Basic Salary <= 10000 : HRA = 20%, DA = 80%
//     Basic Salary <= 20000 : HRA = 25%, DA = 90%
//     Basic Salary > 20000 : HRA = 30%, DA = 95%

import java.util.Scanner;
class GrossSalary{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    double basic_salary,gross;
    System.out.println("enter the basic salary :");
    basic_salary=sc.nextFloat();
    if(basic_salary<=10000){
      gross=basic_salary+(basic_salary*0.2)+(basic_salary*0.8);
      System.out.println("HRA : "+basic_salary*0.2);
      System.out.println("DA :"+basic_salary*0.8);
      System.out.println("gross_salary : "+gross);
    }
    else if(basic_salary<=20000){
      gross=basic_salary+(basic_salary*0.25)+(basic_salary*0.9);
      System.out.println("HRA : "+basic_salary*0.25);
      System.out.println("DA :"+basic_salary*0.9);
      System.out.println("gross_salary : "+gross);
    }
    else {
      gross=basic_salary+(basic_salary*0.3)+(basic_salary*0.95);
      System.out.println("HRA : "+basic_salary*0.3);
      System.out.println("DA :"+basic_salary*0.95);
      System.out.println("gross_salary : "+gross);
    }
    
  }
}