public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String ColonyName = "SpaceX";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        ShipFood = ShipFood - (ShipPopulation * .75);
        ShipFood = ShipFood - (ShipPopulation * .75);

        System.out.println(ShipFood);

        ShipFood = ShipFood + (ShipFood * .5);

        ShipPopulation = ShipPopulation + 5;

        String LandingLocation = "The Hill";
        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bzzz Landing on the Plain Black Tee");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on your mom");
        }

        Landing = LandingCheck(100);
        new GuessingGame();
        new MarsExpedition();


        new FindingsLists();


    }

    public static boolean LandingCheck (int Loops) throws InterruptedException {
        for (int i = 0; i <= Loops; i++) {
            //1if 2eif 1e
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Keep Center");
            } else if ((i % 5) == 0) {
                System.out.println("Right");
            } else if ((i % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }

            Thread.sleep(250);
        }

        System.out.println("Landed");

        return false;
    }

}
