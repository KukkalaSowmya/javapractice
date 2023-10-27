import java.util.Scanner;
public class AreaPerimeter{
  public static void main(String[] args){
    int l,b;
      Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of rectangle");
    l=sc.nextInt();
    System.out.println("enter the breadth of rectangle");
    b=sc.nextInt();
    int area = l*b;
    int perimeter = 2*(l+b);
      System.out.println("area of rectangle" +area);
    System.out.println("perimeter of rectangle" + perimeter);
  }
}