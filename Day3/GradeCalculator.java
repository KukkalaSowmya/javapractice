import java.util.Scanner;
public class GradeCalculator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the marks");
    int marks = sc.nextInt();
    if(marks>=90){
      System.out.println("grade is A");
    }
    if(marks>=75){
      System.out.println("grade is B");
    }
    if(marks>=60){
      System.out.println("grade is C");
    }
    if(marks>=50){
      System.out.println("grade is D");
    }
    if(marks>=40){
      System.out.println("grade is E");
    }
  }
}