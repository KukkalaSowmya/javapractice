import java.util.Scanner;
public class AlphabetCheck{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the term");
   char term = sc.next().CharAt(0);
    if((term>='a' && term<='z') || (term>='A' && term<='Z')) {
      System.out.println(inputChar+ "is alphabet");
    }  
    else{
      System.out.println(inputChar+ "term is not alphabet");
    }
  }
}