import java.util.Scanner;
public class AlphabetDigitorSpecialCharacterCheck{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the term");
    char term = sc.next(). charAt(0);
    if((term>='a') && (term<='z') || (term>='A') && (term<='Z')) {
      System.out.println(term+ " is an alphabet");
    }
    else if(term>=0 && term<=9){
      System.out.println(term+ " is a special character");
    }
    else {
      System.out.println(term+ " is number");
    }
  }
}