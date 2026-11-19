
public class TemperatureTracker { // Gumagawa ng class
    public static void main(String[] args) { // main method

        double[] temperatures = new double[5]; // Gumagawa ng array na may 5 slots

        temperatures[0] = 32.5; // Temperature sa Day 1
        temperatures[1] = 34.0; // Temperature sa Day 2
        temperatures[2] = 31.8; // Temperature sa Day 3
        temperatures[3] = 33.2; // Temperature sa Day 4
        temperatures[4] = 35.1; // Temperature sa Day 5

        for (int i = 0; i < temperatures.length; i++) { // Inuulit hanggang 5 elements
            System.out.println(temperatures[i]); // Pinapakita ang temperature
        }

        temperatures[2] = 32.0; // Binabago ang temperature ng Day 3

        System.out.println("Updated Day 3: " + temperatures[2]); // Pinapakita ang bagong temperature
    } // Closing ng main method
} // Closing ng class
