import java.util.Scanner;
public class OddNum{
  public static void OddNum(int n) {
    int i=0;
    while(i<=n) {
      if(i%2!=0) {
        System.out.println(i); 
      }
      i++;
    }
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    OddNum(n);
  }
}