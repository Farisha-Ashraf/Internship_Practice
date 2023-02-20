import java.util.Scanner;
class Mondayy{
public static void main(String args[]){
 int number;
  Scanner sc=new Scanner(System.in);
 System.out.println("enter  numbers");
 System.out.println("1\n 2\n 3\n 4\n 5\n");
 number=sc.nextInt();
 switch(number){
      case 1:
          System.out.println("------Monday--------- ");
          break;
      case 2:
          System.out.println("-------Tuesday---------- ");
          break;
      case 3:
          System.out.println("--------Wednesday--------- ");
          break;
      case 4:
          System.out.println("---------Thursday---------- ");
          break;
      case 5:
          System.out.println("--------Friday---------- ");
          break;
      default:
           System.out.println("invalid operation");
    }
     
}
}