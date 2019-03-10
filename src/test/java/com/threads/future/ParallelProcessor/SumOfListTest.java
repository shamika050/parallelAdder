package com.threads.future.ParallelProcessor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


/**
 * Unit test for simple App.
 */
public class SumOfListTest 
{

	@Mock
	ISumOfList sumOfList;
	
	public SumOfListTest() {
		
	}
    @Test
    public void checkSum() {
    	
    	SumOfList checkSumList = new SumOfList(1, 10);
    	
    	int expected = 55;
    	
    	int actual = checkSumList.calculateSumParrallay();
    	
    	assertEquals(expected, actual);
    }
    
    @Test
    public void checkSumwWithMock() {
    	
    	SumOfList checkSumList = new SumOfList(1, 10);
    	
    	ISumOfList sumOfList = Mockito.mock(SumOfList.class);
    	
    	when(sumOfList.calculateSumParrallay()).thenReturn(55);
    	
    	
    	int actual = checkSumList.calculateSumParrallay();
    	
    	assertEquals(sumOfList.calculateSumParrallay(), actual);
    }
    
}
