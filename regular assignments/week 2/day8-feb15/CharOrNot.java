import java.util.Scanner;
class CharOrNot {
  public static void main (String arg[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter character");
    char chara=sc.next().charAt(0);
    if (chara >= 'a' && chara <= 'z'|| chara >= 'A' && chara <= 'Z'){
      System.out.println("its is alphabet ");
    }
    else{
      System.out.println("its not alphabet");
    }
  }
}