package ci.hk.demo.calculator.impl;

import java.util.List;

import ci.hk.demo.calculator.service.Calculator;

public class SimpleCalculator implements Calculator<Integer>{

	@Override
	public Double average(Integer... nb) {
		
		return List.of(nb).stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
	}

	
}
