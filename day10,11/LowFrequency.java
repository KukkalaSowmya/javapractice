import java.util.Scanner;
public class LowFrequency{
  public static void LowFrequency(String str){
    int low = 0;
    char ch = ' ';
    for(int i=0;i<str.length();i++){
      int count =0;
      for(int j=0;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
        count++;
      }
    }
    if(count<low){
      low=count;
      ch=str.charAt(i);
    } 
  }
   System.out.println("LowFrequency: " +ch);
}
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the string:");
  String str = sc.nextLine();
  LowFrequency(str);
}
}