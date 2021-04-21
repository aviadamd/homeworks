package euclid;

import algorithms.euclid.Euclid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclidTests {

    private Euclid euclid;

    @BeforeEach
    public void beforeTests() {
        euclid = new Euclid();
    }

    @Test
    public void greatCommonDivisor1Test() {
        assertEquals(2, euclid.greatCommonDivisor1(10,2));
        assertEquals(2, euclid.greatCommonDivisor1(22,6));
    }

    @Test
    public void greatCommonDivisor2Test() {
        assertEquals(2, euclid.greatCommonDivisor2(10,2));
        assertEquals(2, euclid.greatCommonDivisor2(22,6));
    }

    @Test
    public void greatCommonDivisor1Vs2Test() {
        assertEquals(euclid.greatCommonDivisor1(10,2), euclid.greatCommonDivisor2(10,2));
        assertEquals(euclid.greatCommonDivisor1(22,6), euclid.greatCommonDivisor2(22,6));
        assertEquals(euclid.greatCommonDivisor1(182,74), euclid.greatCommonDivisor2(182,74));
    }
}
