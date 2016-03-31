package strategydemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFlatRateDiscount {

	@Test
	public void testFlatRateDiscount1() {
		Order order = new Order("John", 200.24f);
		float discount = 10; 
		FlatRateDiscountStrategy strategy = new FlatRateDiscountStrategy(discount);
		order.setStrategy(strategy);
		assertEquals(190.24, order.getDiscountedPrice(), 0.00001);
	}

	@Test
	public void testFlatRateDiscount2() {
		Order order = new Order("John", 200.24f);
		float discount = 300; 
		FlatRateDiscountStrategy strategy = new FlatRateDiscountStrategy(discount);
		order.setStrategy(strategy);
		assertEquals(0, order.getDiscountedPrice(), 0.00001);
	}
	
	@Test
	public void testFlatRateDiscount3() {
		Order order = new Order("John", 200.24f);
		float discount = -10; 
		FlatRateDiscountStrategy strategy = new FlatRateDiscountStrategy(discount);
		order.setStrategy(strategy);
		assertEquals(200.24, order.getDiscountedPrice(), 0.00001);
	}
}

