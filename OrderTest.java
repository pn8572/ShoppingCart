package test.retail.shopping;

import java.util.Iterator;

import retail.shopping.Order;
import retail.shopping.Product;

public class OrderTest {

	public static void main (String[] s) throws Exception {
		
		Order o = new Order("Prasanth Pillai");		
		o.addProduct(new Product("p101","Orange",12,10));
		o.addProduct(new Product("p102","Banana",4,5));
		o.addProduct(new Product("p103","Apple",10,10));
		
		System.out.println("\nNo. of Product : "+o.productCount());
		System.out.println ("Order Places By: "+o.uid);
		
    // code to remove product from Cart
    // o.removeProduct("p103");
    // Get Product By its Id  
    // Product p = o.getProductFromCart("p102");	
    
    System.out.println ("Cart Total : "+o.getCartPrice());   
		final Iterator<Product> it = o.getCartDetails().iterator();
		while(it.hasNext()){		
			System.out.println (it.next());
		}
	}

}