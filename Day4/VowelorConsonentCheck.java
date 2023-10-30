import java.util.Scanner;
public class VowelorConsonentCheck{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the term");
    char term = sc.next().charAt(0);
    if(term=='a' || term=='e' || term=='i' || term=='o' || term=='u' || term=='A' || term=='E' || term=='I' || term=='O' || term=='U');{
      System.out.println(term+ "is a vowel");
    }
   else {
     System.out.println("term is consonent");
   }
  }
}