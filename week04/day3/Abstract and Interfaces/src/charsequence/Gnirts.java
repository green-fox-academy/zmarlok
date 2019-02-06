package charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence{

    String inputToReversed;
    int revertedIndex;


    public Gnirts(String inputToReversed){
        this.inputToReversed = inputToReversed;
    }
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return inputToReversed.charAt(inputToReversed.length()-index-1);
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
