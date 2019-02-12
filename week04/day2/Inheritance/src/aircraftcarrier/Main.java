package aircraftcarrier;

public class Main {

    public static void main(String[] args) {

        F16 aircraftF16 = new F16();
        F35 aircraftF35 = new F35();

        aircraftF16.fight();
        System.out.println(aircraftF16.getType());
        System.out.println(aircraftF35.getType());

        System.out.println(aircraftF16.refill(100));
        System.out.println(aircraftF16.getStatus());
        aircraftF16.fight();
        System.out.println(aircraftF16.getStatus());

        System.out.println(aircraftF16.isPriority());
        System.out.println(aircraftF35.isPriority());
    }
}
