import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bufferedReader4 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            );

            System.out.print("Enter height: ");
            double height = Double.parseDouble(br.readLine());

            System.out.print("Enter age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter citizenship (C/N): ");
            char citizenship = br.readLine().charAt(0);

            System.out.print("Enter recommendee (R/N): ");
            char recommendee = br.readLine().charAt(0);

            if (recommendee == 'R' ||
                (height >= 200 && age >= 21 &&
                 age <= 25 && citizenship == 'C')) {

                System.out.println("ACCEPTED");

            } else {
                System.out.println("REJECTED");
            }

        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}
