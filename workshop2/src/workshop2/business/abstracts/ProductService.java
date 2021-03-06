package workshop2.business.abstracts;

import java.util.List;

import workshop2.Entities.concretes.Product;

public interface ProductService {
	void add(Product product);

	void delete(Product product);

	void update(Product product);

	List<Product> getAll();

	Product getById(int id);
	
	boolean checkIfProductExist(String name);
	
	boolean checkIfProductPriceMines(Product product);
	
	int checkCategoryCount(Product product);
}
