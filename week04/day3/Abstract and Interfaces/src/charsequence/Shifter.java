package charsequence;

import java.util.stream.IntStream;

public class Shifter implements CharSequence {

    String stringToShift;
    int shiftNumber;


    public Shifter(String stringToShift, int shiftNumber){
        this.stringToShift = stringToShift;
        this.shiftNumber =shiftNumber;

    }
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
