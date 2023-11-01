import java.util.Scanner;
public class PrintReverseNaturalNum{
  public static void PrintReverseNaturalNum(int n){
    int i = 0;
    while(n>=i){
      System.out.println(n);
        n--;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    PrintReverseNaturalNum(n);
  }
}