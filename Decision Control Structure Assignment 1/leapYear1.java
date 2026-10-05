import java.io.*;

public class leapYear1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
        System.out.print("Enter year: ");
        int year = Integer.parseInt(br.readLine());
        

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        } catch (){}
    }
}
