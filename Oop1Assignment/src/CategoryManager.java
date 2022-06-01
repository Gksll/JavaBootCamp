import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
	List<Category> categories;
	public CategoryManager() {
		categories=new ArrayList<Category>();
	}
	
	 
public List<Category> GetAll()
{
	return categories;
}
public void add(Category category) 
{if(!CheckIfCategoryExists(category.getName())) {categories.add(category);}
else {System.out.println("Kategori Mevcut");}
	
}



public boolean CheckIfCategoryExists(String categoryName) 
{
	boolean exists=false;
	for (Category item : categories) {
		if(item.getName()==categoryName) { exists=true;}
		else {exists=false;}
	}
	return exists;
}
private Category getById(int id)
{
	Category categoryToFind=null;
	for (Category item : categories) {
		if (item.getId()==id) {
			categoryToFind=item;
		}
	}
	return categoryToFind;
}
public void delete(Category category) 
{
	categories.remove(getById(category.getId()));
}
public void update (Category category) 
{
	
	Category toUpdate=getById(category.getId());
	toUpdate.setName(category.getName());
	toUpdate.setDescription(category.getDescription());
	
}
}
