package mypack;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import dao.ProductService;
import exception.ProductInsertionException;
import model.Product;

public class TestProduct {
	static ProductService service=null;
	@BeforeAll
	public static void setUp()
	{
		service=new ProductService();
		
	}
	@Test
	public void addProedtTestValid()
	{//product added sucessfully
		Product p=new Product(1, "Laptop", "electronics", 6700.00);
	/*	try {
			assertEquals("product added sucessfully", 
					service.addProductToCart(p));
		} catch (ProductInsertionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		assertDoesNotThrow(()->
		assertEquals("product added sucessfully",
				service.addProductToCart(p)));
		
	}
	@Test
  public void testinvailidProdcut()
  {
		Product p=new Product(-1, "Laptop", "electronics", 6700.00);
ProductInsertionException e=	  assertThrows(ProductInsertionException.class, 
			  ()->service.addProductToCart(p));
	  assertEquals("invalid product",e.getMessage() );
  }
}
