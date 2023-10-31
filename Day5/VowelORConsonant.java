import java.util.Scanner;
public class VowelORConsonant{
  public static void VowelConsonant(char ch){
    if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
      System.out.println(" is a vowel");
    }
    else{
      System.out.println(" is a consonant");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Character");
    char ch = sc.next().charAt(0);
    VowelConsonant(ch);
  }
}