import java.util.Scanner;
public class ElectricityBillCalculator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the previous units");
    int previousunits = sc.nextInt();
    System.out.println("enter the present units");
    int presentunits = sc.nextInt();
    int unitsconsumed = previousunits - presentunits;
    double bill = 0;
    if(unitsconsumed<=50){
      bill = unitsconsumed*0.50;
    }
    else if(unitsconsumed<=150){
      bill = unitsconsumed*0.75;
    }
    else if(unitsconsumed<=250){
      bill = unitsconsumed*1.20;
    }
    else if(unitsconsumed>250){
      bill = unitsconsumed*1.50;
    }
    double gst = bill*0.18;
    double totalbillamount = bill + gst;
    System.out.println("total no of units consumed" + unitsconsumed);
    System.out.println("electricitybill excluding gst:" +bill);
    System.out.println("gst:" + gst);
    System.out.println("electricitybill including 18% gst:" + totalbillamount);
   sc.close();
  }
}