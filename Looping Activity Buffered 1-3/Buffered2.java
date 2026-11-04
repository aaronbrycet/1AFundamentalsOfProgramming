import java.io.*;

public class Buffered2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + " ");

                if (i % 20 == 0 && i != 100) {
                    System.out.println();
                }
            }

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}