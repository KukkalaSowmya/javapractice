import java.util.Scanner;
public class CountFrequency{
  public static void CountFrequency(String str){
    int n = 256;
    int count[] = new int[n];
    
    for(int i=0; i<str.length(); i++)
      count[str.charAt(i)]++;
    charAt = new str.charAt();
    for(int i=0; i<str.length(); i++){
      ch[i]=str.charAt(i);
      int m=0;
      for(int j=0; j<i; j++){
        if(str.charAt(i)==str.charAt(j))
          m++;
        }
        if(m==1){
          System.out.println("Frequency of " +str.charAt(i)+ " is " +count[str.charAt(i)]);
        }
      }
  }
  
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the sentence:");
  String str = sc.nextLine();
  
  CountFrequency(str);

}
}