package animal;

public class Main {

    public static void main(String[] args) {

        Animal Giraffe = new Animal();
        Animal Leopard = new Animal();
        Animal Panther = new Animal();

        Panther.drink();
        Panther.eat();
        Panther.showAnimalCondition();

        Leopard.play();
        Leopard.showAnimalCondition();

        Giraffe.play();
        Giraffe.drink();
        Giraffe.showAnimalCondition();

    }
}
