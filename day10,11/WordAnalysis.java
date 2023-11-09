import java.util.Scanner;
public class WordAnalysis{
  public static void main(String[] args){
    String wordanalysis;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the word");
    wordanalysis = sc.nextLine();
      int vowel = 0;
    int consonant=0;
    int length = wordanalysis.length();
    for(int i=0;i<wordanalysis.length();i++){
     char ch = wordanalysis.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u' ){
        vowel++;
      System.out.println("vowel: " +vowel);
      }
      else{
        System.out.println("consonent:" +consonant);
      }
    }
  }
}