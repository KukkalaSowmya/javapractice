import java.util.Scanner;
public class SumofFirstandLast{
  public static void SumofFirstandLast(int n){
    int sum = 0;
    while(n>=10){
      n=n/10;
    }
    while(n<10){
      n=n/10;
    }
     sum = n+n;
    System.out.println("sum of first and last digit:" +sum);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    SumofFirstandLast(n);
  }
}