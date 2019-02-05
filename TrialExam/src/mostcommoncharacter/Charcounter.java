package mostcommoncharacter;

public class Charcounter {
    Character c;
    int counter;

    public Charcounter(Character c) {
        this.c = c;
        counter = 1;
    }

    public void add() {
        counter++;
    }
}
