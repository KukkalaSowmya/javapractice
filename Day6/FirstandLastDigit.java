import java.util.Scanner;
public class FirstandLastDigit{
  public static void FirstandLastDigit(int n){
    while(n>=10){
      n=n/10;
    }
    System.out.println("First Digit:" +n);
    while(n<10){
      n=n/10;
    }
    System.out.println("last digit:" +n);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    FirstandLastDigit(n);
  }
}