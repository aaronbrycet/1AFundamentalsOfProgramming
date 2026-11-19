
import java.util.Arrays; // Iniimport ang Arrays class

public class CinemaSeating { // Gumagawa ng class
    public static void main(String[] args) { // Main method

        String[][] seats = { // Gumagawa ng 2D array
            {"Alice", "Bob", "Charlie"}, // Mga pangalan sa Row 1
            {"David", "Emma", "Frank"} // Mga pangalan sa Row 2
        }; // Closing ng 2D array

        System.out.println(seats[1][2]); // Pinapakita si Frank sa Row 2, Column 3

        seats[0][1] = "Vacant"; // Pinapalitan si Bob ng Vacant

        System.out.println(Arrays.deepToString(seats)); // Pinapakita ang buong seating arrangement
    } // Closing ng main method
} // Closing ng class
