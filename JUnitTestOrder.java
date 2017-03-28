package test.retail.shopping;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import retail.shopping.Order;
import retail.shopping.Product;
import retail.shopping.exception.ProductNotFoundException;

public class JUnitTestOrder {
	
	public Order o;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Add more values here as required.
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		o = new Order("Customer 1");		
		o.addProduct(new Product("p101","Orange",12,10));
		o.addProduct(new Product("p102","Banana",4,5));
		o.addProduct(new Product("p103","Apple",10,10));
		o.addProduct(new Product("p104","Lemons",5,20));
		o.addProduct(new Product("p105","Peaches",5,5));
	}


	@Test
	public final void testAddProduct() {
		assertTrue(o.addProduct(new Product("p101","Orange",12,10)));
	}

	@Test
	public final void testRemoveProduct() throws ProductNotFoundException {
		assertTrue(o.removeProduct("p103"));
	}
	
	
	
	@Test
	public final void testOrderWithListOfFruits() throws ProductNotFoundException {
		Map<String, Product> map = new HashMap<String, Product>();
		Product p1 = new Product("p101","Orange",12,10);
		Product p2 = new Product("p102","Banana",4,5);
		Product p3 = new Product("p103","Apple",10,10);
		Product p4 = new Product("p104","Lemons",5,20);
		Product p5 = new Product("p105","Peaches",5,5);
		map.put("Customer1", p1);
		map.put("Customer1", p2);
		map.put("Customer1", p3);
		map.put("Customer1", p4);
		map.put("Customer1", p5);
		
		Order o1 = new Order("1",map);
		
		final Iterator<Product> it = o1.getCartDetails().iterator();
		while(it.hasNext()){		
				System.out.println (it.next());
		}
	}
	
	@Test
	public final void testGetCartDetails() {
		System.out.println("\nNo. of Product : "+o.productCount());
		System.out.println ("Order Places By: "+o.uid);
		System.out.println ("Cart Total : "+o.getCartPrice());   
		final Iterator<Product> it = o.getCartDetails().iterator();
		while(it.hasNext()){		
				System.out.println (it.next());
		}
	}

	@Test
	public final void testGetProductFromCart() throws ProductNotFoundException {
		assertEquals("Banana", o.getProductFromCart("p102").getPname()); ;
	}

	@Test
	public final void testGetCartPrice() {
		assertEquals(365.0, o.getCartPrice(),0.0);
	}

}
