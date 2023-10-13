package org.example;

public class Main {

    public static void main(String[] args) {

        Doughnut[] myDoughnut = new Doughnut[6];

        myDoughnut[0] = new Doughnut("Apple Cheesecake", 455, 4.72,
                "Apple buttercream frosted pastry infused with cheesecake-flavored custard filling; " +
                        "garnished with lemon zest.");
        myDoughnut[1] = new Doughnut("Apple Cheesecake", 455, 4.72,
                "Apple buttercream frosted pastry infused with cheesecake-flavored custard filling; " +
                        "garnished with lemon zest.");
        myDoughnut[2] = new Doughnut("Apple Cheesecake", 455, 4.72,
                "Apple buttercream frosted pastry infused with cheesecake-flavored custard filling; " +
                        "garnished with lemon zest.");
        myDoughnut[3] = new Doughnut("Apple Cheesecake", 455, 4.72,
                "Apple buttercream frosted pastry infused with cheesecake-flavored custard filling; " +
                        "garnished with lemon zest.");
        myDoughnut[4] = new Doughnut("Apple Cheesecake", 455, 4.72,
                "Apple buttercream frosted pastry infused with cheesecake-flavored custard filling; " +
                        "garnished with lemon zest.");
        myDoughnut[5] = new Doughnut("Apple Cheesecake", 455, 4.72,
                "Apple buttercream frosted pastry infused with cheesecake-flavored custard filling; " +
                        "garnished with lemon zest.");

        for (Doughnut doughnut: myDoughnut) {
            System.out.println(doughnut);
        }


    }
}


class Doughnut {

    String doughnutType;
    int caloriesPerServing;
    double doughnutPrice;
    String doughnutDescription;

    Doughnut() {
        doughnutType = "Apple Cheesecake";
        caloriesPerServing = 455;
        doughnutPrice = 4.72;
        doughnutDescription = "Apple buttercream frosted pastry, " +
                "infused with cheesecake-flavored custard filling; garnished with lemon zest.";
    }

    public Doughnut(String doughtnutType, int caloriesPerServing, double doughnutPrice, String doughnutDescription) {
        this.doughnutType = doughtnutType;
        this.caloriesPerServing = caloriesPerServing;
        this.doughnutPrice = doughnutPrice;
        this.doughnutDescription = doughnutDescription;
    }

    @Override
    public String toString() {
        return "Doughnut{" +
                "Doughnut Type: " + doughnutType +
                ", Calories Per Serving: " + caloriesPerServing +
                ", Doughnut Price: " + doughnutPrice +
                ", Doughnut Description: " + doughnutDescription +
                '}';
    }
}