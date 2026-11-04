import java.io.*;

public class Buffered3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

            double balance = 20000;
            double amount;

            do {
                System.out.print("Enter amount (0 to stop): ");
                amount = Double.parseDouble(br.readLine());

                if (amount > 0) {
                    balance += amount;
                }
                else if (amount < 0) {
                    if (balance >= Math.abs(amount)) {
                        balance += amount;
                    } else {
                        System.out.println("INSUFFICIENT FUNDS!");
                    }
                }

                if (amount != 0) {
                    System.out.println("Balance: " + balance);
                }

            } while (amount != 0);

            System.out.println("Final Balance: " + balance);

        } catch (IOException | NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
}