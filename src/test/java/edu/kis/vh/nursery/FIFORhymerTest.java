package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {
    @Test
    public void testFIFOOrder() {
        FIFORhymer rhymer = new FIFORhymer();
        rhymer.countIn(1);
        rhymer.countIn(2);
        rhymer.countIn(3);

        Assert.assertEquals(1, rhymer.countOut());
        Assert.assertEquals(2, rhymer.countOut());
        Assert.assertEquals(3, rhymer.countOut());
    }

    @Test
    public void testCountOutOnEmpty() {
        FIFORhymer rhymer = new FIFORhymer();
        Assert.assertEquals(-1, rhymer.countOut());
    }

    @Test
    public void testSingleElement() {
        FIFORhymer rhymer = new FIFORhymer();
        rhymer.countIn(42);
        Assert.assertEquals(42, rhymer.countOut());
        Assert.assertTrue(rhymer.isEmpty());
    }
}
