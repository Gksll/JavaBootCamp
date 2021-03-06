package workshop2.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import workshop2.Entities.concretes.Category;
import workshop2.Entities.concretes.Product;
import workshop2.dataAccess.abstracts.CategoryRepository;

public class HibernateCategoryRepository implements CategoryRepository {

	List<Category> categories;

	public HibernateCategoryRepository() {
		categories = new ArrayList<Category>();
	}

	@Override
	public void add(Category category) {
		categories.add(category);

	}

	@Override
	public void delete(Category category) {
		categories.remove(category.getId());

	}

	@Override
	public void update(Category category) {
		Category categoryToUpdate = getById(category.getId());
		categoryToUpdate.setName(category.getName());
		categoryToUpdate.setDescription(category.getDescription());
	}

	@Override
	public List<Category> getAll() {
		
		return categories;
	}

	@Override
	public Category getById(int id) {
		Category tmpCategory = null;
		for (Category item : categories) {
			if (item.getId() == id) {
				tmpCategory = item;
			}
		}
		return tmpCategory;
	}

}
