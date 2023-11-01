import java.util.Scanner;
public class SumofDigits{
  public static void SumofDigits(int n){
    int i = 0;
    int sum = 0;
    while(n>0){
      n = n%10;
      sum = sum+i;
      n=n/10;
      i++;
    }
    System.out.println("sum of digits:" +sum);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    SumofDigits(n);
  }
}