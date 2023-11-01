import java.util.Scanner;

public class FrequencyofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a integer.");
        } else {
            countFrequencyofDigits(number);
        }
    }
    public static void countFrequencyofDigits(int num) {
        int[] frequency = new int[10];
        while (num > 0) {
            int digit = num % 10;
            frequency[digit]++;
            num /= 10;
        }

        System.out.println("FrequencyofDigits:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
    }
}
