import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class leapYear1 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
            );

            System.out.print("Enter year: ");
            int year = Integer.parseInt(br.readLine());

            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

        } catch (IOException e) {
            System.out.println("Input error.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid year.");
        }
    }
}
