import java.util.Scanner;
class AlphaOrDigitOrSpcl{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the character :");
    char chara=sc.next().charAt(0);
    if (chara >= 'a' && chara <= 'z'|| chara >= 'A' && chara <= 'Z'){
      System.out.println("its is alphabet ");
    }
    else if(chara >='0' && chara <='9'){
      System.out.println("its digit");
    }
    else{
      System.out.println("its special character");
    }
  }
}