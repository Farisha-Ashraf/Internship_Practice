import java.util.Scanner;
class HotelRoom{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int room_rate=1000;
    System.out.println("Rate of the room : "+room_rate);
    System.out.println("Number of night they want too stay :");
    int stay=sc.nextInt();
    int total_cost=room_rate*stay;
    System.out.println("total cost: "+total_cost);
    
  }
}