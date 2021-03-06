package nLayeredApp.dataAccess.abstracts;

import java.util.List;

import nLayeredApp.Entities.concrete.Brand;

public interface BrandRepository {
	void add(Brand brand);

	void delete(Brand brand);

	void update(Brand brand);

	List<Brand> getAll();

	Brand getById(int id);
	
	// Hibernate 'e geçirmek isteseydik ne yapardık? 
}
