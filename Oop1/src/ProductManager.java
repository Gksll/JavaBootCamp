import java.util.List;
import java.util.ArrayList;

public class ProductManager {
	List<Product> products;
	public ProductManager() {
		products = new ArrayList<Product>();
		
	}
public void add(Product product) 
{
	if(!checkIfProductNameExist(product.getName())) 
	{
		products.add(product);
	}
	else
	{
		System.out.println("Urun Mevcut");
	}
		
		
	
	
	
	}
public void delete(Product product) 
{
	
	products.remove(getById(product.getId()));
	
	}
public void update(Product product) 
{		Product productToUpdate= getById(product.getId());
productToUpdate.setDescription(product.getDescription());
productToUpdate.setName(product.getName());
productToUpdate.setUnitPrice(product.getUnitPrice());
	
	
	
	
	}
public List<Product> getAll()
{
	return products;
	}
private boolean checkIfProductNameExist(String productName) 
{
	boolean exists = false;
	for(Product item: products) 
	{
		if (item.getName()==productName) {
			exists=true;
		} else {

		}
		
	}
	return exists;
}
private Product getById(int id) 
{
	Product productToFind=null;
	for (Product item : products) {
		if (item.getId()==id) {
			
			productToFind=item;
			
		}
	}
	return productToFind;
}
}
