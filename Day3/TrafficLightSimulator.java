import java.util.Scanner;
public class TrafficLightSimulator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the color of light");
    String color = sc.nextLine();
    if(color.equals("red")){
      System.out.println("stop");
    }
    else if(color.equals("yellow")){
      System.out.println("be ready");
    }
    else if(color.equals("green")){
      System.out.println("go");
    }
    sc.close();
  }
}