import java.util.Scanner;
public class MaximumBetweenThreeNumbers{
  public static void main(String[] args) {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    a = sc.nextInt();
    System.out.println("enter the second number");
    b = sc.nextInt();
    System.out.println("enter the third number");
    c = sc.nextInt();
    if(a>b){
      System.out.println("maximum number is:" +a);
    }
    else if (b>c) {
      System.out.println("maximum number is:" +b);
    }
    else{
      System.out.println("maximum number is:" +c);
     }
  }
}