import java.util.Scanner;

public class scanner4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter citizenship (C/N): ");
        char citizenship = input.next().charAt(0);

        System.out.print("Enter recommendee (R/N): ");
        char recommendee = input.next().charAt(0);

        if (recommendee == 'R' ||
            (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }

        input.close();
    }
}
