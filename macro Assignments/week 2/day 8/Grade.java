// WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
/*  Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F */

import java.util.Scanner;
class Grade {
  public static void main (String arg[]){
    double Physics,Chemistry,Biology,Mathematics, Computer,Percentage;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the marks");
      Physics= sc.nextDouble();
      Chemistry= sc.nextDouble();
      Biology= sc.nextDouble();
      Mathematics= sc.nextDouble();
      Computer= sc.nextDouble();
    Percentage=((Physics+Chemistry+Biology+Mathematics+Computer)/500)*100;
      System.out.println("your percentage is "+Percentage);
    if( Percentage>= 90)
        System.out.println("Grade A");
   else if( Percentage>= 80)
        System.out.println("Grade B");
   else if( Percentage>= 70)
        System.out.println("Grade C");
   else if( Percentage>= 60)
        System.out.println("Grade D");
  else  if( Percentage>= 40)
        System.out.println("Grade E");
    else
        System.out.println ("Grade F");
  }
}