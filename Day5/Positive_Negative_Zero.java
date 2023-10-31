import java.util.Scanner;
public class Positive_Negative_Zero{
  public static void Sign(int num){
    if(num>0){
      System.out.println("positive");
    }
    else if(0<num){
      System.out.println("negative");
    }
    else{
      System.out.println("zero");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();
    Sign(num);
  }
}