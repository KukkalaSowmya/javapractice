import java.util.Scanner;
public class ReverseofString{
  public static void ReverseofString(String str){
   
   str.length();
    String reverse = " ";
    for(int i=str.length()-1; i>=0; i--){
      reverse+=str.charAt(i);
    }
    System.out.println("reverse: " +reverse);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the word");
    String word = sc.nextLine();
    ReverseofString(word);
  }
}