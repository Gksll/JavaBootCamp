package workshop2.Entities.concretes;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	private String quentityPerUnit;
	private String description;
	private int categoryId;

	public Product() {
	}

	public Product(int id, String name, double unitPrice, String quentityPerUnit, String description,int categoryId) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quentityPerUnit = quentityPerUnit;
		this.description = description;
		this.categoryId=categoryId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getQuentityPerUnit() {
		return quentityPerUnit;
	}

	public void setQuentityPerUnit(String quentityPerUnit) {
		this.quentityPerUnit = quentityPerUnit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
