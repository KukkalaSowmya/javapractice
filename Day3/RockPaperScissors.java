import java.util.Scanner;
public class  RockPaperScissors{
  public static void main(String[] args){
   String computer,player1;
    System.out.println("computer starts with ");
    computer=sc.nextLine();
    Scanner sc = new Scanner(System.in);
    System.out.println("player1 start with ");
    player1=sc.nextLine();
    
    if(computer=="rock" && player1=="paper"){
      System.out.println("player1 wins");
    }
    if(computer=="paper" && player1=="rock");{
      System.out.println("computer wins");
    }
    if(computer=="paper" && player1=="scissors");{
      System.out.println("player1 wins");
    }
    if(computer=="scissors" && player1=="paper"){
      System.out.println("computer wins");
    }
    if(computer=="rock" && player1=="scissors"){
      System.out.println("computer wins");
    }
    if(computer=="scissors" && player1=="rock"){
      System.out.println("player1 wins");
    }
    if(computer=="rock" && player1=="scissors");{
      System.out.println("player1 wins");
    }
    if(computer=="rock" && player1=="rock");{
      System.out.println("tie");
    }
    if(computer=="paper" && player1=="paper");{
      System.out.println("tie");
    }
    if(computer=="scissors" && player1=="scissors");{
      System.out.println("tie");
    }
    sc.close();
  }
}