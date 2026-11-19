
public class CoffeeShopAnalyzer {
    public static void main(String[] args) {

        // Gumawa ako ng array para sa sales bawat araw
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};

        // Gumawa ako ng array para sa mga araw
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Dinisplay ang sales bawat araw
        System.out.println("--- Daily Sales ---");
        for (int i = 0; i < weeklySales.length; i++) {
            System.out.println(days[i] + " sales: " + weeklySales[i]);
        }

        // Nag-set ako ng initial total sales na zero
        int totalSales = 0;

        // Pinagsama lahat ng sales
        for (int i = 0; i < weeklySales.length; i++) {
            totalSales += weeklySales[i];
        }

        // Kunin ang average sales
        double averageSales = (double) totalSales / weeklySales.length;

        // Dinisplay ang total at average
        System.out.println("\n--- Weekly Summary ---");
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sales: " + averageSales);

        // highest at lowest na sales
        int maxSales = weeklySales[0];
        int minSales = weeklySales[0];
        String bestDay = days[0];
        String worstDay = days[0];

        // Hinahanap ang pinakamataas at pinakamababang sales
        for (int i = 1; i < weeklySales.length; i++) {
            if (weeklySales[i] > maxSales) {
                maxSales = weeklySales[i];
                bestDay = days[i];
            }

            if (weeklySales[i] < minSales) {
                minSales = weeklySales[i];
                worstDay = days[i];
            }
        }

        // Dinisplay ang best at worst day
        System.out.println("\n--- Best and Worst ---");
        System.out.println("Best Day: " + bestDay + " - " + maxSales);
        System.out.println("Worst Day: " + worstDay + " - " + minSales);
    }
}
