import java.util.Scanner;
public class WeekofDay{
  public static void WeekofDay(int day){
    if (day==1){
      System.out.println(day+ " is moday");
    }
    else if(day==2){
      System.out.println(day+ " is tuesday");
    }
    else if(day==3){
      System.out.println(day+ " is wednesday");
    }
    else if(day==4){
      System.out.println(day+ " is thursday");
    }
    else if(day==5){
      System.out.println(day+ " is friday");
    }
    else if(day==6){
      System.out.println(day+ " is saturday");
    }
    else if(day==7){
      System.out.println(day+ " is sunday");
    }
    default{
      System.out.println("invalid day");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.pritnln("enter the day");
    int day = sc.nextInt();
    WeekofDay(day);
  }
}