package construction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostEstimatorTest {

	@Test
	void testConstructionCost() {
		
		//if area give negative value
		CostEstimator ce=new CostEstimator(new Standard("above standard"),-20,false);
		assertThrows(IllegalArgumentException.class,() -> ce.constructionCost());
		
		CostEstimator ce1=new CostEstimator(new Standard("above standard"),20,false);
		assertEquals(30000,ce1.constructionCost());
		
		CostEstimator ce2=new CostEstimator(new Standard("standard"),20,true);
		assertThrows(IllegalArgumentException.class,() -> ce2.constructionCost());
		
		CostEstimator ce3=new CostEstimator(new Standard("high standard"),5,true);
		assertEquals(12500,ce3.constructionCost());
		
		CostEstimator ce4=new CostEstimator(new Standard("high standard"),5,false);
		assertEquals(9000,ce4.constructionCost());
		
	}

}
