import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in the source currency: ");
        double sourceAmount = sc.nextDouble();
        System.out.println("Enter the exchange rate: ");
        double exchangeRate = sc.nextDouble();
        double targetAmount = sourceAmount * exchangeRate;

        System.out.println("The converted amount in the target currency is: " + targetAmount);
}
}