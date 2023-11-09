import java.util.Scanner;
public class FirstOccurance{
  public static void FirstOccurance(String str, char ch){
   for(int i=0; i<str.length(); i++){
     if(str.charAt(i)==ch){
       System.out.println("First occurance of " +ch+ " is at position " +i);
       
     }
   }
   
  }
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String str = sc.nextLine();
    System.out.println("Enter the character");
    char ch = sc.next().charAt(0);
    FirstOccurance(str,ch);
  }
}