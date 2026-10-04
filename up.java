import java.util.Scanner;

public class up {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in pesos: ");
        int amount = input.nextInt();

        int notes1000 = amount / 1000;
        amount = amount % 1000;

        int notes500 = amount / 500;
        amount = amount % 500;

        int notes200 = amount / 200;
        amount = amount % 200;

        int notes100 = amount / 100;
        amount = amount % 100;

        int notes50 = amount / 50;
        amount = amount % 50;

        int notes20 = amount / 20;
        amount = amount % 20;

        int notes10 = amount / 10;
        amount = amount % 10;

        int notes5 = amount / 5;
        amount = amount % 5;

        int notes1 = amount / 1;

        System.out.println("1000 pesos - " + notes1000);
        System.out.println("500 pesos - " + notes500);
        System.out.println("200 pesos - " + notes200);
        System.out.println("100 pesos - " + notes100);
        System.out.println("50 pesos - " + notes50);
        System.out.println("20 pesos - " + notes20);
        System.out.println("10 pesos - " + notes10);
        System.out.println("5 pesos - " + notes5);
        System.out.println("1 peso - " + notes1);
    }
}
    
