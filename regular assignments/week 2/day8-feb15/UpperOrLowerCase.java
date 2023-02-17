import java.util.Scanner;
class UpperOrLowerCase{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the character :");
    char chara=sc.next().charAt(0);
    if (chara >= 'a' && chara <= 'z'){
      System.out.println("it is lower case ");
    }
    else if(chara >= 'A' && chara <= 'Z'){
      System.out.println("it is upper case");
    }
    else{
      System.out.println("not alphabet");
    }
  }
}