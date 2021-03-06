package workshop2.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import workshop2.Entities.concretes.Product;
import workshop2.dataAccess.abstracts.ProductRepository;

public class HibernateProductRepository implements ProductRepository {
	List<Product> products = new ArrayList<Product>();

	@Override
	public void add(Product product) {
		products.add(product);
//		System.out.println(product.getName());

	}

	@Override
	public void delete(Product product) {
		products.remove(getById(product.getId()));
		System.out.println("silindi");
		
	}

	@Override
	public void update(Product product) {
		Product productToUpdate = getById(product.getId());
		productToUpdate.setName(product.getName());
		productToUpdate.setDescription(product.getDescription());
		productToUpdate.setQuentityPerUnit(product.getQuentityPerUnit());
		productToUpdate.setUnitPrice(product.getUnitPrice());
		System.out.println(product.getName()+"guncellendi");

	}

	@Override
	public List<Product> getAll() {

		//System.out.println("urunler getirildi");
		return products;
	}

	@Override
	public Product getById(int id) {
		Product tmpProduct=new Product();
		for (Product item : products) {
			if (item.getId() == id) {
				tmpProduct = item;
			}
		}

		System.out.println(tmpProduct.getName());
		return tmpProduct;
	}

}
