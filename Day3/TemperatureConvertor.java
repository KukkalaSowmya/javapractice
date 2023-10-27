import java.util.Scanner;
public class TemperatureConvertor{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the temperature in celcius");
    int celcius = sc.nextInt();
    int Farenheit = (celcius*9/5)+32;
    System.out.println("temperature in Farenheit:" + Farenheit);
    sc.close();
  }
}