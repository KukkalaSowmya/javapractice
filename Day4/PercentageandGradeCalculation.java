import java.util.Scanner;
public class PercentageandGradeCalculation{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int physics, chemistry, maths, biology, computer;
    System.out.println("Enter the marks of physics");
    physics = sc.nextInt();
    System.out.println("Enter the marks of chemistry");
    chemistry = sc.nextInt();
    System.out.println("enter the marks of maths");
    maths = sc.nextInt();
    System.out.println("enter the marks of biology");
    biology = sc.nextInt();
    System.out.println("enter the marks of computer");
    computer = sc.nextInt();
    float total = physics + chemistry + maths + biology + computer;
    float percentage = (total)/500*100;
    System.out.println("total marks: " +total);
    System.out.println("percentage: " +percentage);
  }
}