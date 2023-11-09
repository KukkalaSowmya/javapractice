import java.util.Scanner;
public class CountOccurances{
  public static void CountOccurances(String str, char ch){
    int count = 0;
    int n = str.length();
    for(int i=0; i<str.length(); i++){
      if(str.charAt(i)==ch){
        count++;
      }
    }
    System.out.println("Total no of occurances:" +count);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sentence:");
    String str = sc.nextLine();
    System.out.println("Enter the character:");
    char ch = sc.next().charAt(0);
    CountOccurances(str,ch);
  }
}