package com.threads.future.ParallelProcessor;

import java.util.concurrent.Callable;

public class SimpleAdder implements Callable<Integer> {
	
	Integer num1;
	
	Integer num2;
	
	public SimpleAdder(Integer num1,Integer num2) {
		
		this.num1 = num1;
		
		this.num2 = num2;
		
	}

	@Override
	public Integer call() throws Exception {
		
		Integer sum = num1 + num2;
		
		System.out.println("num 1 : "+num1+" |num 2 : "+num1+" | Sum : "+sum);
		
		return sum;
		
	}
	
	

}
