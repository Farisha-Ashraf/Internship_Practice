import java.util.Scanner;
class VowelOrCosonant {
  public static void main (String arg[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter character");
    char chara=sc.next().charAt(0);
    if (chara == 'a' || chara=='e' || chara == 'i' || chara == 'o' || chara == 'u'){
      System.out.println("it is vowel ");
    }
    else{
      System.out.println("it is consonant");
    }
  }
}