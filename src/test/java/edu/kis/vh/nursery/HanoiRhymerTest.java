package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class HanoiRhymerTest {
    @Test
    public void testOnlyDecreasingValuesAccepted() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(10);
        rhymer.countIn(5);
        rhymer.countIn(3);

        Assert.assertEquals(3, rhymer.countOut());
        Assert.assertEquals(0, rhymer.reportRejected());
    }

    @Test
    public void testRejectedCountIncreases() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(5);
        rhymer.countIn(10); // rejected - większa od peek
        rhymer.countIn(8);  // rejected - większa od peek (5)

        Assert.assertEquals(2, rhymer.reportRejected());
    }

    @Test
    public void testReportRejectedInitiallyZero() {
        HanoiRhymer rhymer = new HanoiRhymer();
        Assert.assertEquals(0, rhymer.reportRejected());
    }

    @Test
    public void testEqualValueIsRejected() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(5);
        rhymer.countIn(5); // równa wartość - odrzucona (in > peek jest false, więc akceptowana!)
        // in > peek => 5 > 5 = false => przyjęta
        Assert.assertEquals(0, rhymer.reportRejected());
    }
}
