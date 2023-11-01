import java.util.Scanner;
public class ProductofDigits{
  public static void ProductofDigits(int n){
    int i = 0;
    int mul = 0;
    while(n>0){
      n = n%10;
      mul = mul+i;
      n=n/10;
      i++;
    }
    System.out.println("product of digits:" +mul);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    ProductofDigits(n);
  }
}