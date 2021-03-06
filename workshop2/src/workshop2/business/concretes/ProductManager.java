package workshop2.business.concretes;

import java.util.ArrayList;
import java.util.List;

import workshop2.Entities.concretes.Product;
import workshop2.business.abstracts.ProductService;
import workshop2.dataAccess.abstracts.ProductRepository;

public class ProductManager implements ProductService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	List<Product> tmp = new ArrayList<Product>();

	@Override
	public void add(Product product) {
		if (!checkIfProductExist(product.getName())) {
			if (checkIfProductPriceMines(product)) {
				if (checkCategoryCount(product)<3) {
					productRepository.add(product);
				} else {
					System.out.println("aynı kategoriden en fazla 5 adet eklenebilir");
				}
			}

		} else {
			System.out.println("Urun daha once eklenmis");
		}

	}

	@Override
	public void delete(Product product) {
		productRepository.delete(getById(product.getId()));

	}

	@Override
	public void update(Product product) {
		productRepository.update(product);

	}

	@Override
	public List<Product> getAll() {

		return productRepository.getAll();
	}

	@Override
	public Product getById(int id) {
		Product product = productRepository.getById(id);
		return product;
	}

	@Override
	public boolean checkIfProductExist(String name) {
		boolean exists = false;
		for (Product item : productRepository.getAll()) {
			if (item.getName() == name) {
				exists = true;
			}
		}
		return exists;
	}

	@Override
	public boolean checkIfProductPriceMines(Product product) {
		if (product.getUnitPrice() <= 0) {
			System.out.println("Urun fiyati negatif olamaz");
			return false;
		} else {
			return true;
		}

	}

	@Override
	public int checkCategoryCount(Product product) {
		int count=0;
		for (Product item : productRepository.getAll()) {
			if(item.getCategoryId()==product.getCategoryId()) {
				count++;
			}
		}
		return count;
	}

}
