import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

    public static void main(String[] args) {

        double peso = 0.0, dollar = 0.0, euro = 0.0, sar = 0.0, inr = 0.0;
        int currency, convert;

        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);

        System.out.println("***** CURRENCY CONVERTER *****");
        System.out.println("1. Philippine Peso (PHP)");
        System.out.println("2. US Dollar (USD)");
        System.out.println("3. Euro (EUR)");
        System.out.println("4. Saudi Riyal (SAR)");
        System.out.println("5. Indian Rupee (INR)");
        System.out.print("Enter your choice: ");

        currency = sc.nextInt();

        if (currency == 1) {
            System.out.print("Enter amount in PHP: ");
            peso = sc.nextDouble();

            System.out.println("Convert to:");
            System.out.println("1. USD  2. EUR  3. SAR  4. INR");
            convert = sc.nextInt();

            if (convert == 1)
                System.out.println("USD: " + f.format(peso * 0.020));
            else if (convert == 2)
                System.out.println("EUR: " + f.format(peso * 0.017));
            else if (convert == 3)
                System.out.println("SAR: " + f.format(peso * 0.073));
            else if (convert == 4)
                System.out.println("INR: " + f.format(peso * 0.74));
            else
                System.out.println("Invalid choice!");

        } else if (currency == 2) {
            System.out.print("Enter amount in USD: ");
            dollar = sc.nextDouble();

            System.out.println("Convert to:");
            System.out.println("1. PHP  2. EUR  3. SAR  4. INR");
            convert = sc.nextInt();

            if (convert == 1)
                System.out.println("PHP: " + f.format(dollar * 51.23));
            else if (convert == 2)
                System.out.println("EUR: " + f.format(dollar * 0.87));
            else if (convert == 3)
                System.out.println("SAR: " + f.format(dollar * 3.75));
            else if (convert == 4)
                System.out.println("INR: " + f.format(dollar * 83.0));
            else
                System.out.println("Invalid choice!");

        } else if (currency == 3) {
            System.out.print("Enter amount in EUR: ");
            euro = sc.nextDouble();

            System.out.println("Convert to:");
            System.out.println("1. PHP  2. USD  3. SAR  4. INR");
            convert = sc.nextInt();

            if (convert == 1)
                System.out.println("PHP: " + f.format(euro * 58.75));
            else if (convert == 2)
                System.out.println("USD: " + f.format(euro * 1.15));
            else if (convert == 3)
                System.out.println("SAR: " + f.format(euro * 4.30));
            else if (convert == 4)
                System.out.println("INR: " + f.format(euro * 89.0));
            else
                System.out.println("Invalid choice!");

        } else if (currency == 4) {
            System.out.print("Enter amount in SAR: ");
            sar = sc.nextDouble();

            System.out.println("Convert to:");
            System.out.println("1. PHP  2. USD  3. EUR  4. INR");
            convert = sc.nextInt();

            if (convert == 1)
                System.out.println("PHP: " + f.format(sar * 13.66));
            else if (convert == 2)
                System.out.println("USD: " + f.format(sar * 0.27));
            else if (convert == 3)
                System.out.println("EUR: " + f.format(sar * 0.23));
            else if (convert == 4)
                System.out.println("INR: " + f.format(sar * 22.0));
            else
                System.out.println("Invalid choice!");

        } else if (currency == 5) {
            System.out.print("Enter amount in INR: ");
            inr = sc.nextDouble();

            System.out.println("Convert to:");
            System.out.println("1. PHP  2. USD  3. EUR  4. SAR");
            convert = sc.nextInt();

            if (convert == 1)
                System.out.println("PHP: " + f.format(inr * 0.60));
            else if (convert == 2)
                System.out.println("USD: " + f.format(inr * 0.012));
            else if (convert == 3)
                System.out.println("EUR: " + f.format(inr * 0.011));
            else if (convert == 4)
                System.out.println("SAR: " + f.format(inr * 0.045));
            else
                System.out.println("Invalid choice!");

        } else {
            System.out.println("Invalid currency selection!");
        }

        sc.close();
    }
}