import java.util.Scanner;
public class MultiplicationTable{
  public static void MultiplicationTable(int n){
    int i=1;
    while(i<=10){
    }
    System.out.println(n+"*"+i+"="+(n*i));
    i++;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n value");
    int n = sc.nextInt();
    MultiplicationTable(n);
  }
}