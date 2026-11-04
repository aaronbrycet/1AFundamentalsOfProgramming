import javax.swing.JOptionPane;

public class JOption3 {
    public static void main(String[] args) {

        try {
            double balance = 20000;
            double amount;

            do {
                amount = Double.parseDouble(
                    JOptionPane.showInputDialog(
                        "Enter amount (0 to stop):"));

                if (amount > 0) {
                    balance += amount;
                }
                else if (amount < 0) {
                    if (balance >= Math.abs(amount)) {
                        balance += amount;
                    } else {
                        JOptionPane.showMessageDialog(null,
                            "INSUFFICIENT FUNDS!");
                    }
                }

                if (amount != 0) {
                    JOptionPane.showMessageDialog(null,
                        "Outstanding Balance: ₱" +
                        String.format("%.2f", balance));
                }

            } while (amount != 0);

            JOptionPane.showMessageDialog(null,
                "Final Balance: ₱" +
                String.format("%.2f", balance));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Invalid input!");
        }
    }
}