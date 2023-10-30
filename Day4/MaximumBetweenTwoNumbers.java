import java.util.Scanner;
public class MaximumBetweenTwoNumbers {
  public static void main (String[] args) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    a = sc.nextInt();
    System.out.println("enter the second number");
    b = sc.nextInt();
    if(a>b){
      System.out.println("maximum number is:" +a);
    }
      else{
      System.out.println("maximum number is:" +b);
    }
  }
}