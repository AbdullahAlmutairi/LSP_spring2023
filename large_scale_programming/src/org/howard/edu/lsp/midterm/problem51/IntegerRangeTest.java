package org.howard.edu.lsp.midterm.problem51;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerRangeTest {
    private IntegerRange range;

    @BeforeEach
    public void setUp() {
        range = new IntegerRange(1, 10);
    }

    @Test
    public void testContains() {
        Assertions.assertTrue(range.contains(1));
        Assertions.assertTrue(range.contains(5));
        Assertions.assertTrue(range.contains(10));
        Assertions.assertFalse(range.contains(0));
        Assertions.assertFalse(range.contains(11));
    }

    @Test
    public void testOverlaps() throws EmptyRangeException {
        IntegerRange otherRange = new IntegerRange(5, 15);
        IntegerRange nonOverlappingRange = new IntegerRange(11, 20);

        Assertions.assertTrue(range.overlaps(otherRange));
        Assertions.assertTrue(otherRange.overlaps(range));
        Assertions.assertFalse(range.overlaps(nonOverlappingRange));
        Assertions.assertThrows(EmptyRangeException.class, () -> range.overlaps(null));
    }

    @Test
    public void testSize() {
        Assertions.assertEquals(10, range.size());

        IntegerRange smallRange = new IntegerRange(1, 1);
        Assertions.assertEquals(1, smallRange.size());

        IntegerRange largeRange = new IntegerRange(1, 100);
        Assertions.assertEquals(100, largeRange.size());
    }
}
