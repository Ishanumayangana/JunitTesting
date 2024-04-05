package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumUnit {

	@Test
	void test() {
		UnitTesting obj1  = new UnitTesting();
		int output_f = obj1.sum(4,6);
		
		//Test the output
		
		assertEquals(10,output_f);
	}

}
