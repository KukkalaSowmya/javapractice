import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first boolean value: ");
        boolean firstValue = sc.nextBoolean();
        System.out.print("Enter the second boolean value: ");
        boolean secondValue = sc.nextBoolean();
        // Perform logical operations
        boolean andResult = firstValue && secondValue;
        boolean orResult = firstValue || secondValue;
        boolean notResult = !firstValue;
        // Display the results
        System.out.println("Logical AND Result: " + andResult);
        System.out.println("Logical OR Result: " + orResult);
        System.out.println("Logical NOT Result for first value: " + notResult);
        sc.close();
    }
}
