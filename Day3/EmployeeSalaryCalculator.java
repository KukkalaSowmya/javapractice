import java.util.Scanner;
public class EmployeeSalaryCalculator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter employee monthly salary:");
    double monthlySalary = sc.nextDouble();
    double annualSalary = monthlySalary*12;
    double tax = 0;
    if(annualSalary <= 250000) {
      tax = 0;
    }
    else if (annualSalary <= 500000) {
      tax = 0.05*(annualSalary-250000);
    }
    else if(annualSalary <= 1000000) {
      tax = 0.2*(annualSalary-500000);
    }
    else if (annualSalary > 1000000) {
      tax = 0.3*(annualSalary-1000000);
    }
    double netSalary = annualSalary - tax;
    System.out.println("Annual Salary:" + annualSalary);
    System.out.println("tax:" + tax);
    System.out.println("Net Salary:" + netSalary);
    sc.close();
  }
}