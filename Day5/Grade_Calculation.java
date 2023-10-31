import java.util.Scanner;
public class Grade_Calculation{
  public static void Grade_Calculation(String marks){
    int physics, chemistry, maths, biology, computer;
    int total = physics + chemistry + maths + biology + computer;
    float percentage = (total)/500*100;
    if(percentage>=90){
      System.out.println(percentage+ " is Grade A");
    }
    else if(percentage>=80){
      System.out.println(percentage+ " is Grade B");
    }
    else if(percentage>=70){
      System.out.println(percentage+ " is Grade C");
    }
    else if(percentage>=60){
      System.out.println(percentage+ " is Grade D");
    }
    else if(percentage>=40){
      System.out.println(percentage+ " is Grade E");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("physics marks");
    int physics = sc.nextInt();
    System.out.println("chemistry marks");
    int chemistry = sc.nextInt();
    System.out.println("maths marks");
    int maths = sc.nextInt();
    System.out.println("biology marks");
    int biology = sc.nextInt();
    System.out.println("computer marks");
    int computer = sc.nextInt();
    System.out.println("total marks: " +total);
    System.out.println("percentage: " +percentage);
    System.out.println("Grade: " +Grade);
    Grade_Calculation(marks);
  }
}