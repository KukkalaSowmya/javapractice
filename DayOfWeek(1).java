import java.util.Scanner;
public class DayOfWeek{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the day");
    int day = sc.nextInt();
    String dayOfWeek;

    if (weekNumber == 1) {
        dayOfWeek = "Sunday";
    } else if (weekNumber == 2) {
        dayOfWeek = "Monday";
    } else if (weekNumber == 3) {
        dayOfWeek = "Tuesday";
    } else if (weekNumber == 4) {
        dayOfWeek = "Wednesday";
    } else if (weekNumber == 5) {
        dayOfWeek = "Thursday";
    } else if (weekNumber == 6) {
        dayOfWeek = "Friday";
    } else if (weekNumber == 7) {
        dayOfWeek = "Saturday";
    } else {
        dayOfWeek = "Invalid input. Please enter a number between 1 and 7.";
    }

    System.out.println("The day of the week is: " + dayOfWeek);
  }
}