public class JavaBeans {
    public static void main(String[] args) {

        //ito ung initializing ng mga variables
        int weeklySales[] = {120, 145, 130, 155, 180, 210, 195};
        String days [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // ito ung for loop and sop para ma print out ung day at sales sa day na yun
        System.out.println("---Daily Sales---");
        for (int i = 0; i < weeklySales.length; i++){
            System.out.println(days[i] + " sales: " + weeklySales[i]);
        }

        // ung mga next ay kung paano mag calculate ng mga total at average
        int totalSales = 0;
        for (int dailySales : weeklySales){
            totalSales += dailySales;
        }
        double averageSales = (double)totalSales/weeklySales.length;
        System.out.println("\n--- Weekly Summary ---");
        System.out.println("Total Sales: " + totalSales + " cups");
        System.out.println("Average Sales: " + averageSales + " cups");

        //ito ung kung paano siya mag lo-loop para hanapin ing highest value para ipakita ung best selling day
        int maxSales = weeklySales[0];
        //ito ung variable para makita ung lowest selling day
        int minSales = weeklySales[0];
        String bestSales = days[0];
        String worstSales = days[0];

        //mag s-start tayo dito sa 1 kasi 0 na ung mga max at minimum
        for (int i = 1; i < weeklySales.length; i++){

            //ito ung para ma-check kung may bagong highest selling day
            if (weeklySales[i] > maxSales){
                maxSales = weeklySales[i]; bestSales = days[i];
            }

            //ito naman ay para sa lowest selling day
            if (weeklySales[i] < minSales){
                minSales = weeklySales[i];
                worstSales = days[i];
            }
        }

        //ito na ang mga final print lines para makita lahat ng mga result ng highest selling day at lowest selling days
        System.out.println("\n--- Best day and Worst day ---");
        System.out.println("Best day was " + bestSales + " with " + maxSales + " cups");
        System.out.println("Slowest day was " + worstSales + " with " + minSales + " cups");

    }
}
