package com.threads.future.ParallelProcessor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.*;
import org.junit.Test;	

/**
 * Unit test for simple App.
 */
public class SumOfListTest 
{

	public SumOfListTest() {
		
	}
    @Test
    public void checkSum() {
    	
    	SumOfList checkSumList = new SumOfList(1, 10);
    	
    	int expected = 55;
    	
    	int actual = checkSumList.calculateSumParrallay();
    	
    	assertEquals(expected, actual);
    }
}
