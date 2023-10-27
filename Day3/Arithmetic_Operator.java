import java.util.Scanner;
public class Arithmetic_Operator{
  public static void main(String[] args) {
    int a,b;
      Scanner sc = new Scanner(System.in);
    System.out.println("enter a value");
    a=sc.nextInt();
    System.out.println("enter b value");
    b=sc.nextInt();
    sum=a+b;
    sub=a-b;
    mul=a*b;
    div=a/b;
    mod=a%b;
    System.out.println("sum:" + sum);
    System.out.println("subtraction:" + sub);
    System.out.println("multiplication:" + mul);
    System.out.println("division:" +div);
    System.out.println("modulus:" + mod); 
    sc.close();
  }
}