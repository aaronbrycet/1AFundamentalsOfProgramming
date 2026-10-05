import javax.swing.JOptionPane;

public class jOption2 {
    public static void main(String[] args) {

        double rate = Double.parseDouble(
            JOptionPane.showInputDialog("Enter hourly pay rate:")
        );

        double hours = Double.parseDouble(
            JOptionPane.showInputDialog("Enter hours worked:")
        );

        double grossPay = rate * hours;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholding = grossPay * taxRate;
        double netPay = grossPay - withholding;

        String result =
            "Gross Pay: Php " + grossPay +
            "Withholding Tax: Php " + withholding +
            "Net Pay: Php " + netPay;

        JOptionPane.showMessageDialog(null, result);
    }
}
