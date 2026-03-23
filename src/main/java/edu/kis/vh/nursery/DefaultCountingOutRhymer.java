package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int DEFAULT_VALUE = -1;
    private static final int CAPACITY = 12;
    private final int[] numbers = new int[CAPACITY];

    public int total = EMPTY_RHYMER_INDICATOR;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peek() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (isEmpty())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
