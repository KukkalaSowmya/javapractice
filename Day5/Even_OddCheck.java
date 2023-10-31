import java.util.Scanner;
public class Even_OddCheck{
  public static void Even_Odd(int num){
    if(num%2==0){
      System.out.println(" is an even number");
    }
    else{
      System.out.println(" is an odd number");
       }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int number = sc.nextInt();
    Even_Odd(num);
  }
}