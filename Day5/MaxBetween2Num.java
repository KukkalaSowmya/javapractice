import java.util.Scanner;
class MaxBetween2Num{
 public static main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("num1:");
   int num1 = sc.nextInt();
   System.out.println("num2:");
   int num2 = sc.nextInt();
   int max = Math.max(num1,num2);
   System.out.println("max: " +max);
 }
  public static int max(int num1, int num2){
    return Math.max(num1,num2);
  }
}