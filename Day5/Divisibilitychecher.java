import java.util.Scanner;
public class Divisibilitychecher{
  public static void Divisibility(int num){
    if(num%5==0 && num%11==0){
      System.out.println(" is divisible by 5 and 11");
    }
    else if(num%5==0){
      System.out.println(" is divisible by 5");
    }
    else if (num%11==0){
      System.out.println(" is divisible by 11");
    }
    else{
      System.out.println(" is not divisible by 5 and 11");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();
    Divisibility(num);
  }
}