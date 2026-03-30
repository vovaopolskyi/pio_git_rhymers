package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    // TODO: totalRejected powinien być prywatny z getterem, nie package-private
    private int totalRejected = 0;


    // TODO: rozważyć reset licznika - brak metody resetRejected()
    public int reportRejected() {
    return totalRejected;
}

    // TODO: brak Javadoc dla tej metody override
    @Override
    public void countIn(int in) {
        if (!isEmpty() && in > peek()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}
