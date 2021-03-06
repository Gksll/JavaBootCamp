package nLayeredApp.business.abstracts;

import java.util.List;

import nLayeredApp.Entities.concrete.Brand;

public interface BrandService {
	void add(Brand brand);

	void delete(Brand brand);

	void update(Brand brand);

	List<Brand> getAll();

	Brand getById(int id);
}
