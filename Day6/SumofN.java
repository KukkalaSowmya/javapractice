import java.util.Scanner;
public class SumofN{
  public static void SumofN(int n){ 
    int i = 0;
     int sum=0;
    while(i<=n){
     sum+=i;
      i++;  
    } 
    System.out.printnln("Sum of N: " +i);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the term");
    int n = sc.nextInt();
    SumofN(n);
  }
}