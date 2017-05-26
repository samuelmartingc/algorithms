package com.samuelmartingc.algorithms.binarysearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

	BinarySearch sut = new BinarySearch();
	int[] items = {1,2,3,4,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 
	int[] itemsEmpty = {};
	int searchItemFound = 6;
	int searchItemFoundFirst = 1;
	int searchItemNotFound = 5;
	int searchItemNotFoundHigh = 42;
	int searchItemNotFoundLow = -2;

	@Test
	public void testAppFound() {
        assertTrue( sut.search(items, searchItemFound) );
    }
	
	@Test
	public void testAppFoundFirst() {
        assertTrue( sut.search(items, searchItemFoundFirst) );
    }
	
	@Test    
    public void testAppNotFound() {
        assertFalse( sut.search(items, searchItemNotFound) );
    }
    
	@Test
	public void testAppNotFoundHigh() {
    	assertFalse( sut.search(items, searchItemNotFoundHigh) );
    }
    
	@Test
    public void testAppNotFoundLow() {
    	assertFalse( sut.search(items, searchItemNotFoundLow) );
    }
    
	@Test
    public void testAppNotFoundEmpty() {
    	assertFalse( sut.search(itemsEmpty, searchItemFound) );
    }

}