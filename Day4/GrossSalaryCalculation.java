import java.util.Scanner;
public class GrossSalaryCalculation{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the basic salary");
    double basic = sc.nextDouble();
    double hra = 0;
    double da = 0;
    double gross = 0;
    if(basic<=30000) {
      hra = 0.2*basic;
      da = 0.8*basic;
    }
    else if(basic<=50000){
      hra = 0.25*basic;
      da = 0.9*basic;
    }
    else if(basic<=100000){
      hra = 0.3*basic;
      da = 1*basic;
    }
    gross = basic + hra +da;
    System.out.println("The gross salary of the employee is:" +gross);
  }
}