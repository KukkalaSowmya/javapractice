import java.util.Scanner;
public class AlphabetChecker{
  public static void Alphabet(char ch){
    if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
      System.out.println(" is the aphabet");
    }
    else{
      System.out.println(" is not an alphabet");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character");
    char ch = sc.next().charAt(0);
    Alphabet(ch);
  }
}