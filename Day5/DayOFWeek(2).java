import java.util.Scanner;
public class DayOFWeek{
  public static void DayOFWeek(int day){
    switch(day){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("wednesday");
        break;
      case 4:
        System.out.println("thursday");
        break;
      case 5:
        System.out.println("friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("invalid");
        break;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the day");
    int day = sc.nextInt();
    DayOFWeek(day);
  }
}