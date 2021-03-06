package workshop2.business.concretes;

import java.util.List;

import workshop2.Entities.concretes.Category;
import workshop2.business.abstracts.CategoryService;
import workshop2.dataAccess.abstracts.CategoryRepository;

public class CategoryManager implements CategoryService {
	private CategoryRepository categoryrepository;

	public CategoryManager(CategoryRepository categoryrepository) {
		this.categoryrepository = categoryrepository;
	}

	@Override
	public void add(Category category) {
		categoryrepository.add(category);

	}

	@Override
	public void delete(Category category) {
		categoryrepository.delete(category);

	}

	@Override
	public void update(Category category) {
		categoryrepository.update(category);
	}

	@Override
	public List<Category> getAll() {
		return categoryrepository.getAll();
	}

	@Override
	public Category getById(int id) {
	return	categoryrepository.getById(id);
	}

}
