import java.util.Scanner;
public class Upper_Lower{
  public static void upperlower(char ch){
    if(ch>'a' && ch<'z'){
      System.out.println(" is a lower case letter");
    }
    else if(ch>'A' && ch<'Z'){
      System.out.println(" is a upper case letter");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the term");
    char ch = sc.next().charAt(0);
    upperlower(ch);
  }
}