package main;
import org.evosuite.coverage.branch.*;
import annotations.After;
import annotations.Before;
import annotations.Calculation;

public class BranchCoverage {
	@Before
	public void initialize() {
		
	}
	
	@Calculation
	public double calculation(Solution solution) {
		return 0.0;
	}
	
	@After
	public void tearDown() {
		
	}

}
