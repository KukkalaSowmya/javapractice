import java.util.Scanner;
public class MessagingApplication{
  public static void MessagingApplication(String str){
    int n = str.length();
    for(int i=0; i<str.length(); i++){
    if(character.isLowercase(c)){
      char toUpperCase = (char) (c-32);
     str.CharAt(i, toUpperCase);
    }
      else{
        char toLowerCase = (char) (c+32);
        str.CharAt(i, toLowerCase);
      }
  }
    System.out.println(str);
  }
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the message:");
  String str = sc.nextLine();
  MessagingApplication(str);
}
}