import java.util.Scanner;
class CountNoDigit{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the digit: ");
    int count=0, number = sc.nextInt();
    while (number != 0) {
      number= number/10;
      count++;
    }
    System.out.println("The number of digits is " + count);
  }
}