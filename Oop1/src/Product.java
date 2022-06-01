
public class Product {
	//local fields
	// Access Modifier
	public Product() {
		super();
	}
	
 public Product(int id, String name, double unitPrice, String description) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.description = description;
	}

private int id;
 
private String name;
 private double unitPrice;
 private String description;
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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
 
 
 
}
