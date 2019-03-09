package com.threads.future.ParallelProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumOfList {
	
	private int start;
	
	private int end;
	
	private final int POOLSIZE = 10;
	
	public SumOfList(int start,int end) {
		
		this.start = start;
		
		this.end = end;
		
	}

	
	public int calculateSumParrallay() {
		
		ExecutorService threadPool = Executors.newFixedThreadPool(POOLSIZE);
		
		List<Future<Integer>> asynAdderList = new ArrayList<Future<Integer>>();
		
		int count = 0;
		
		for(int i=getStart();i<= getEnd();i++) {
			
			if(count % 2 == 0) {
				
				Future<Integer> asyncSum = threadPool.submit(new SimpleAdder(i, i+1));

				asynAdderList.add(asyncSum);
				
			}
			
			count++;
			
		}
		
		int finalSum = 0;
		
		for(Future<Integer> asyncSum : asynAdderList) {
			
			try {
				
				finalSum = finalSum + asyncSum.get();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			} catch (ExecutionException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		return finalSum;
		
	}


	public int getStart() {
		return start;
	}
	
	public int getEnd() {
		return end;
	}


	public void setStart(int start) {
		this.start = start;
	}
}
