package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import exception.InalidIdEeption;
import exception.ProductInsertionException;
import model.Product;

public class ProductService {
	List<Product> list=new ArrayList();
	//this method add a product object into a list
//if the product id <=0 then product willbe stored into list 
	//it will thorw user defined exception cll ProducvtInsertionException
	public String addProductToCart(Product product) 
			throws ProductInsertionException
	{
		String res=null;
		if(product.getProductId()<=0)
		{
			throw new ProductInsertionException("invalid product");
		}
		if(list.add(product))
		{
			res= "product added sucessfully";
		}return res;
	}
	
	
	public Optional<Product> findProductById(int id)throws InalidIdEeption
	{
		if(id<=0)
		{
			throw new  InalidIdEeption("Invalid");
		}
		return list.stream().
				filter((product)->product.getProductId()==id).findFirst();
		
	}
public Map<String, Long> countProductForEachCategory()
{
	return  list.stream().collect
			(Collectors.groupingBy(Product::getProductCategory, 
					Collectors.counting()));
}
} 
