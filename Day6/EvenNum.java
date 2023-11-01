import java.util.Scanner;
public class EvenNum{
  public static void EvenNum(int n){
    int i=0; 
    while(i<=n){
      if(i%2==0){
        System.out.println(i);
      }
        i++;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
   EvenNum(n);
  }
}