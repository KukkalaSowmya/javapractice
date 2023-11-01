import java.util.Scanner;
public class ASCIIalphabets{
  public static void main(String[] args){
    char ch='a';
    for(ch='a' ; ch<='z'; ch++){
      int value = (int)ch;
      System.out.println(ch+ "=" +value);
    }
  }
}