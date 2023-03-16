package org.howard.edu.assignment5;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



	public class IntegerSetTest {
	    private IntegerSet set;

	    @Test
	    public void setUp() {
	        set = new IntegerSet();
	    }

	    public void testClear() throws IntegerSetException {
	        set.add(1);
	        set.add(2);
	        set.clear();
	        Assertions.assertEquals(0, set.length());
	    }
	       
	  

	    @Test
	    public void testLength() throws IntegerSetException {
	    	set = new IntegerSet();
	    }

	    @Test
		public void testEquals() {
			// TODO: write test for equals()
		}
	    
	    @Test
		public void testContains() throws IntegerSetException {
			IntegerSet set = new IntegerSet();
			set.add(1);
			set.add(2);
			set.add(3);
			
			assertTrue(set.contains(1));
			assertTrue(set.contains(2));
			assertTrue(set.contains(3));
			assertFalse(set.contains(4));
		}

	    @Test
		public void testLargest() {
			// TODO: write test for largest()
		}

	    
	    @Test
		public void testSmallest() {
			// TODO: write test for smallest()
		}
	    

	    @Test
		public void testAdd() {
			// TODO: write test for add()
		}
		
		@Test
		public void testRemove() {
			// TODO: write test for remove()
		}
		
		@Test
		public void testUnion() {
			// TODO: write test for union()
		}
		
		@Test
		public void testIntersect() {
			// TODO: write test for intersect()
		}
		
		@Test
		public void testDiff() {
			// TODO: write test for diff()
		}

	    @Test
	    public void testIsEmpty() throws IntegerSetException {

	    }

	    @Test
	    public void testToString() throws IntegerSetException {
	    }
	}
