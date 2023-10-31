import java.util.Scanner;
public class AlphaNumSplchar{
  public static void AlphaNumSpl(String s){
    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
      System.out.println(" is an alphabet");
    }
    else if(ch>=0 && ch<=9) {
      System.out.println(" is a special character");
    }
    else{
      System.out.println(" is a number");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the term");
    char ch = sc.next().charAt(0);
    AlphaNumSpl(s);
  }
}