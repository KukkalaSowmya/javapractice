import java.util.Scanner;
public class GrossSalary{
  public static void GrossSalary(double salary){
   double hra=0, da=0, gross=0;
    if(salary<=30000){
      hra = 0.2*salary;
      da = 0.8*salary;
    }
    else if(salary<=50000){
      hra = 0.25*salary;
      da = 0.9*salary;
    }
    else if(salary<=100000){
      hra = 0.3*salary;
      da = 1*salary;
    }
    double gross = salary + hra + da;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the salary");
    double salary = sc.nextDouble();
    System.out.println("Gross salary" +gross);
    GrossSalary(salary);
  }
}