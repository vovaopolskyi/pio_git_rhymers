package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();


    // TODO: needs refactoring - algorytm countOut() ma złożoność O(n^2)
    @Override
    public int countOut() {
        if (isEmpty())
            return -1;

        while (!isEmpty()) {
            temp.countIn(super.countOut());
        }

        int ret = temp.countOut();

        while (!temp.isEmpty()) {
            countIn(temp.countOut());
        }

        return ret;
    }
}
