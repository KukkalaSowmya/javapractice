import java.util.Scanner;
public class CountWords{
  public static void CountWords(String str){
    int count = 1;
    str.length();
    for(int i=0; i<str.length()-1; i++){
    if((str.charAt(i) ==' ') && (str.charAt(i+1)!= ' ')){
       count++;
    }
    }
     System.out.println("words:" +count);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sentence");
    String sentence = sc.nextLine();
    CountWords(sentence);
  }
}