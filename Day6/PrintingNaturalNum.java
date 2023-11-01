import java.util.Scanner;
public class PrintingNaturalNum{
  public static void PrintingNaturalNum(int n){
    int i = 0;
    while(i<n){
      System.out.println(i);
     i++;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    PrintingNaturalNum(n);
  }
}