import java.util.Scanner;
public class AgeCalculator{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your date of birth (dd/mm/yyyy)");
    int dob = sc.nextInt();
    System.out.println("enter current year");
    int currentyear = sc.nextInt;
    int age = currentyear - dob;
    System.out.println("your age is:" +age);
    if(age<18){
      System.out.println("you are a minor");
    }
    else (age>18) {
      System.out.println("you are an adult");
      sc.close();
    }
  }
}