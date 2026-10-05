import java.io.*;

public class bufferedReader3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter NSAT score: ");
            double nsat = Double.parseDouble(br.readLine());

            System.out.print("Enter parents' salary: ");
            double salary = Double.parseDouble(br.readLine());

            System.out.print("Enter entrance exam score: ");
            double exam = Double.parseDouble(br.readLine());

            double average = (nsat + exam) / 2;

            if (salary > 10000 || nsat < 90 || exam < 85) {
                System.out.println("Rejected");
            } else if (salary <= 3500 && average >= 91) {
                System.out.println("Accepted");
            } else {
                System.out.println("For further study");
            }

        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
    
}