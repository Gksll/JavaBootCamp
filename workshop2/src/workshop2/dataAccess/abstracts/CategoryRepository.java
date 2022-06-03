package workshop2.dataAccess.abstracts;

import java.util.List;

import workshop2.Entities.concretes.Category;

public interface CategoryRepository {
	void add(Category category);

	void delete(Category category);

	void update(Category category);

	List<Category> getAll();

	Category getById(int id);
}
