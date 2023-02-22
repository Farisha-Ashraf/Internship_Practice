import java.util.*;
class Whileascii{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    char ch='a';
    while(ch<='z'){
      System.out.println((int)ch);
      ch++;
    }
    
  }
}