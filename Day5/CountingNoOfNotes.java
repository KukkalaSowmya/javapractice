import java.util.Scanner;
public class CountingNoOfNotes{
  public static void CountingNoOfNotes(int amount){
    int amount500 = 0, amount100 = 0, amount50 = 0;
    if(amount>=500){
      System.out.println(amount+ "is divided into 500");
      notes500 = amount/500;
      amount = amount%500;
    }
    else if(amount>=100){
      System.out.println(amount+ "is divided into 100");
      notes100 = amount/100;
      amount = amount%100;
    }
    else if(amount>=50){
      System.out.println(amount+" is divided into 50");
      notes50 = amount/50;
      amount = amount%50;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the amount");
    int amount = sc.nextInt();
    CountingNoOfNotes(amount);
  }
}