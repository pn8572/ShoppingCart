package retail.shopping.exception;

public class ProductNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ProductNotFoundException(){}
	public ProductNotFoundException(String msg){
		super(msg);
	}
}