import java.util.Scanner;
public class ElectricityBillCalculation{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of units consumed");
    int units = sc.nextInt();
    double bill = 0;
    if (units<=50){
      bill = units*0.50;
      System.out.println("the bill is:" +bill);
    }
    else if(units<=100){
      bill = units*1;
      System.out.println("the bill is:" +bill);
    }
    else if(units<=200){
      bill = units*2;
      System.out.println("the bill is:" +bill);
    }
    if(bill>3000){
      bill = bill + bill*0.20;
      System.out.println("the bill is:" +bill);
    }
  }
}