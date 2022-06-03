package nLayeredApp;

import nLayeredApp.Entities.concrete.Brand;
import nLayeredApp.business.abstracts.BrandService;
import nLayeredApp.business.concretes.BrandManager;
import nLayeredApp.dataAccess.concretes.hibernateImpls.HibernateBrandRepository;
import nLayeredApp.dataAccess.concretes.jdbcImpls.jdbcBrandRepository;

public class Main {
//Yeni bir proje oluşturuyoruz eticaret- Ayrnı işlemi ürün için yapıyoruz.
	public static void main(String[] args) {
//		BrandService brandService = new BrandManager(new HibernateBrandRepository());
		BrandService brandService = new BrandManager(new jdbcBrandRepository());
		brandService.add(new Brand());

	}

}
