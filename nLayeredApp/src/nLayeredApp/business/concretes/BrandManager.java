package nLayeredApp.business.concretes;

import java.util.List;

import nLayeredApp.Entities.concrete.Brand;
import nLayeredApp.business.abstracts.BrandService;
import nLayeredApp.dataAccess.abstracts.BrandRepository;
import nLayeredApp.dataAccess.concretes.jdbcImpls.jdbcBrandRepository;

public class BrandManager implements BrandService {
	private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public void add(Brand brand) {

	}

	@Override
	public void delete(Brand brand) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Brand brand) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Brand getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
