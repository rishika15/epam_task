package simpleInterestandCompoundInterest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleInterestAndCompoundInterestTest {

	@Test
	void testSimpleInterest() {
		SimpleInterestAndCompoundInterest sc=new SimpleInterestAndCompoundInterest(20000,2,2,10);
		assertEquals(8000.0,sc.simpleInterest());
		SimpleInterestAndCompoundInterest sc1=new SimpleInterestAndCompoundInterest(20546,2,2,10);
		assertEquals(8218.4,sc1.simpleInterest());
	}
	
	@Test
	void testCompoundInterest() {
		SimpleInterestAndCompoundInterest sc=new SimpleInterestAndCompoundInterest(20000,2,2,10);
		assertEquals(766751.9984894944,sc.compoundInterest());
		SimpleInterestAndCompoundInterest sc1=new SimpleInterestAndCompoundInterest(20546,2,2,10);
		assertEquals(787684.3280482576,sc1.compoundInterest());
		
	}

}
