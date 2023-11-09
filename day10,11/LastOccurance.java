import java.util.Scanner;
public class LastOccurance{
  public static void Occurance(String str,char ch){
    String reverse = new String();
  
   int last = -1;
    for(int i=str.length()-1; i>=0; i--){
      if(str.charAt(i)==ch){
        last = i;
      }
    }
    if(last == -1){
      System.out.println("No occurance " +ch+ " found");
    }
    else{
      System.out.println("Last occurance " +ch+ " is at position " +i);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String str = sc.nextLine();
    System.out.println("Enter the character: ");
    char ch = sc.next().charAt(0);
    Occurance(str,ch);
  }
}