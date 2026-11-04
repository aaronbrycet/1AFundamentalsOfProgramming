import javax.swing.JOptionPane;

public class JOpt2 {
    public static void main(String[] args) {
        try {
            String output = "";

            for (int i = 2; i <= 100; i += 2) {
                output += i + " ";

                if (i % 20 == 0) {
                    output += "\n";
                }
            }

            JOptionPane.showMessageDialog(null, output);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "An error occurred!");
        }
    }
}