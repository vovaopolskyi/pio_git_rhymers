package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ERROR = -1;
    private static final int STACK_CAPACITY = 12;
    private final int[] NUMBERS = new int[STACK_CAPACITY];

    public int total = ERROR;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean isEmpty() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == STACK_CAPACITY-1;
    }

    protected int peek() {
        if (isEmpty())
            return ERROR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (isEmpty())
            return ERROR;
        return NUMBERS[total--];
    }

}
