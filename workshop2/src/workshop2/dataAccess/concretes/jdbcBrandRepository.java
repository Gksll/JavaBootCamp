package workshop2.dataAccess.concretes;

import java.util.List;

import workshop2.Entities.concretes.Product;
import workshop2.dataAccess.abstracts.ProductRepository;

public class jdbcBrandRepository implements ProductRepository{

	@Override
	public void add(Product product) {
		System.out.println("eklendi");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("silindi");
		
	}

	@Override
	public void update(Product product) {
		System.out.println("guncellendi");
		
	}

	@Override
	public List<Product> getAll() {
		System.out.println("Urunler getirildi");
		return null;
	}

	@Override
	public Product getById(int id) {
		System.out.println("id'li getirildi");
		return null;
	}

}
