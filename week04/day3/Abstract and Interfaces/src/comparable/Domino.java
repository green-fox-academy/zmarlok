package comparable;

import java.util.Arrays;
public class Domino implements Comparable<Domino>{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino comparedDomino) {
        if (this.left < comparedDomino.left){
            return -1;
        }
        return 1;
    }
    /* public int compareTo(Domino comparedDomino) {        - to inspect both sides
        if (this.left < comparedDomino.left) {
            return -1;
        } else if (this.right < comparedDomino.right){
            return -1;
        }
        return 1;
    } */
}