import java.util.Scanner;
public class PasswordStrengthChecker{
  public static void PasswordStrengthChecker(String str){
    int check = 0;
    int loweralpha = 0;
    int upperalpha = 0;
    int digit = 0;
    int splchar = 0;
    int n = str.length();
    for(int i=0; i<=n; i++){
      char ch = str.charAt(0);
      if(ch>='a' && ch<='z'){
         System.out.println("Lowercase:" +loweralpha);
        loweralpha++;
      }
      else if(ch>='A' && ch<='Z'){
        System.out.println("Uppercase:" +upperalpha);
        upperalpha++;
      }
      else if(ch>='0' && ch<='9'){
        System.out.println("Digit:" +digit);
        digit++;
      }
      else{
         System.out.println("Splchar:" +splchar);
        splchar++;
      }
    }
    if(n>8 && loweralpha>0 && upperalpha>0 && digit>0 && splchar>0){
      System.out.println("password is strong");
    }
    else{
       System.out.println("password is weak");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the password");
    String str = sc.nextLine();
    PasswordStrengthChecker(str);
  }
}
