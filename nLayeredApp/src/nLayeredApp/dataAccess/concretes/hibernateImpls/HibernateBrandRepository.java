package nLayeredApp.dataAccess.concretes.hibernateImpls;

import java.util.List;

import nLayeredApp.Entities.concrete.Brand;
import nLayeredApp.dataAccess.abstracts.BrandRepository;

public class HibernateBrandRepository implements BrandRepository{

	@Override
	public void add(Brand brand) {
		System.out.println("Hibernate ile eklendi");
		
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
