import java.util.Scanner;
public class SumofEven{
  public static void SumofEven(int n){
    int i=0; 
    int sum=0;
    while(i<=n){
      if(i%2==0){
        sum = sum+i;
      }
      i++;
    }
     System.out.println("Sum of even numbers:" + sum);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    SumofEven(n);
  }
}