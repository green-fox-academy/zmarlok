package fleetofthings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing getMilk = new Thing("Get Milk");
        fleet.add(getMilk);
        Thing removeObstacles = new Thing("Remove the obstacles");
        fleet.add(removeObstacles);
        Thing standUp = new Thing("Stand up");
        fleet.add(standUp);
        Thing eatLunch = new Thing("Eat Lunch");
        fleet.add(eatLunch);
        // fleet.add(new Thing("Stand up")); i can also add a new thing like this, but I can not run the .complete method on the added thing!

        standUp.complete();
        eatLunch.complete();

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch


        System.out.println(fleet);
    }
}