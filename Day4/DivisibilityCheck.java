import java.util.Scanner;
public class DivisibilityCheck{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int number = sc.nextInt();
    if(number%5==0 && number%11==0){
      System.out.println("number is divisible by 5 and 11");
    }
    else if(number%5==0){
      System.out.println("number is divisible by 5");
    }
    else if (number%11==0){
      System.out.println("number is divisible by 11");
    }
    else{
      System.out.println("number is not divisible by 5 and 11");
    }
  }
}