import java.util.Scanner;
public class LeapYearChecker{
  public static void leapyear(int year){
    if(year%4==0){
      System.out.println(" is a leapyear");
    }
    else{
      System.out.println(" is not a leap year");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year");
    int year = sc.nextInt();
    leapyear(year);
  }
}