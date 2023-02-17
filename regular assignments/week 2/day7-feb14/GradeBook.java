import java.util.Scanner;
class GradeBook{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Student Grade book");
    System.out.println("Enter the garde of subject1:");
    int sub1=sc.nextInt();
    System.out.println("Enter the garde of subject2:");
    int sub2=sc.nextInt();
    System.out.println("Enter the garde of subject3:");
    int sub3=sc.nextInt();
    int avg=(sub1+sub2+sub3)/3;
    System.out.println("Average grade of student :"+avg);
    
  }
}