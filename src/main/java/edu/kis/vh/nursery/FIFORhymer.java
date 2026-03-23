package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        int ret = -1;
        while (!isEmpty()) {

            temp.countIn(super.countOut());

            ret = temp.countOut();

            while (!temp.isEmpty()) {
                countIn(temp.countOut());
            }


        }
        return ret;
    }
}
