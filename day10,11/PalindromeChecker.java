import java.util.Scanner;
public class PalindromeChecker{
  public static void PalindromeChecker(String str){
   String reverse = new String();
     char[] ch=str.toCharArray();
    for(int i=str.length()-1; i>=0; i--){
     reverse=reverse+str.charAt(i);

    }
   if(str.equals(reverse)){
      System.out.println(str+ " is a palindrome");
   }
     
   else{
      System.out.println(" is not a palindrome");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the word");
    String word = sc.nextLine();
    PalindromeChecker(word);
  }
}