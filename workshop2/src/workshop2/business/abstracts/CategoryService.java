package workshop2.business.abstracts;

import java.util.List;

import workshop2.Entities.concretes.Category;

public interface CategoryService {
	void add(Category category);

	void delete(Category category);

	void update(Category category);

	List<Category> getAll();

	Category getById(int id);
}
