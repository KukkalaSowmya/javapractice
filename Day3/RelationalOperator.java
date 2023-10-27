import java.util.Scanner;
public class RelationalOperator{
  public static void main(String[] args) {
    //declare 2 variables
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a value:");
    a=sc.nextInt();
    System.out.println("enter b value:");
    b=sc.nextInt();
    if(a>b){
      System.out.println("a is greater than b");
    }
    else if (a<b){
      System.out.println("a is less than b");
    }
    if (a==b){
      System.out.println("a is equal to b");
    }
  }
}