import java.util.Scanner;
public class UpperCaseorLowerCaseAlphabetCheck{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the term");
    char term = sc.next().charAt(0);
    if((term>='a') || (term<='z')){
      System.out.println(term+ " is a lowercase alphabet");
    }
    else if(term>='A' && term<='Z'){
      System.out.println(term+ " is a upper case alphabet");
    }
  }
}