import java.util.Scanner;
public class CountingDigits{
  public static void CountingDigits(int n){
    int count = 0;
    while(n/10){
      count=n/10; System.out.println("count: " +count);
    }
     count++;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    CountingDigits(n);
  }
}