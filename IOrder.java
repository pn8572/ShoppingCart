package retail.shopping;
/**
 * Interface for Order.
 * More functions are provided for better functionality
 */

import java.util.Collection;

import retail.shopping.exception.ProductNotFoundException;

public interface IOrder {
	boolean addProduct(Product p);
	boolean removeProduct(String pid) throws ProductNotFoundException;
	Collection<Product> getCartDetails();
	Product getProductFromCart(String pid) throws ProductNotFoundException;
	int productCount();
	double getCartPrice();
}