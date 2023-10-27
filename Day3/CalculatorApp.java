import java.util.Scanner;
public class CalculatorApp{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    double num1 = sc.nextDouble();
    System.out.println("enter the operator");
    char operator = sc.next().charAt(0);
    System.out.println("enter the second number");
    double num2 = sc.nextDouble();
    double result = 0;
    switch(operator){
      case '+':
        result = num1 + num2;
        System.out.println("sum:" + result);
      break;
      case '-':
        result = num1 - num2;
        System.out.println("sub:" + result);
      break;
      case '*':
        result = num1*num2;
        System.out.println("mul:" + result);
        break;
      case '/':
        result = num1/num2;
        System.out.println("div:" + result);
        break;
      case '%':
        result = num1%num2;
        System.out.println("div:" + result);
        break;
      default:
        System.out.println("invalid operator");
        break;
    }
  }
}