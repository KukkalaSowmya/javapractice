import java.util.Scanner;
public class SumofOdd{
  public static void SumofOdd(int n){
    int i=0;
    int sum = 0;
    while(i<=n){
      if(i%2!=0){
        sum=sum+i; 
      }
      i++;
    }
     System.out.println("sum of odd numbers:" +sum);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    int n = sc.nextInt();
    SumofOdd(n);
  }
}