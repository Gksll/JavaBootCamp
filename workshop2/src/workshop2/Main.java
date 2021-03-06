package workshop2;
import workshop2.Entities.concretes.Product;
import workshop2.business.abstracts.ProductService;
import workshop2.business.concretes.ProductManager;
import workshop2.dataAccess.concretes.HibernateProductRepository;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductRepository());
		//ProductService productService2= new ProductManager(new jdbcBrandRepository());
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Gozluk1");
		p1.setDescription("On numara gözlük");
		p1.setQuentityPerUnit("Adet");
		p1.setUnitPrice(10);
		p1.setCategoryId(1);
		
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Gozluk2");
		p2.setDescription("On numara gözlük");
		p2.setQuentityPerUnit("Adet");
		p2.setUnitPrice(10);
		p2.setCategoryId(1);
	
		
		Product p3 = new Product();
		p3.setId(3);
		p3.setName("Gozluk3");
		p3.setDescription("On numara gözlük");
		p3.setQuentityPerUnit("Adet");
		p3.setUnitPrice(10);
		p3.setCategoryId(1);
		
		Product p4 = new Product();
		p4.setId(4);
		p4.setName("Gozluk4");
		p4.setDescription("On numara gözlük");
		p4.setQuentityPerUnit("Adet");
		p4.setUnitPrice(10);
		p4.setCategoryId(1);
		
		
		Product p5 = new Product();
		p5.setId(5);
		p5.setName("Gozluk5");
		p5.setDescription("On numara gözlük");
		p5.setQuentityPerUnit("Adet");
		p5.setUnitPrice(10);
		p5.setCategoryId(1);
		
		productService.add(p1);
		productService.add(p2);
		productService.add(p3);
		productService.add(p4);
		productService.add(p5);
		
//		System.out.println(productService.getById(2));
		
		for (Product item : productService.getAll()) {
			System.out.println(item.getName());
		}

	}

}
