package counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.add();
        counter.add(6);
        counter.get();
        counter.reset();
        counter.get();
        counter.add();
        counter.get();


    }
}
