
public class User {
// User -> Id , firstName, LastName,City 

	public User(int id, String firstName, String lastName, String city) {
	super();
	this.Id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	City = city;
}
	public User() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	private int Id;
	private String firstName;
	private String lastName;
	private String City;
}
