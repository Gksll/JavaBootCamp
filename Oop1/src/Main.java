import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Klavye");
		product1.setUnitPrice(250);
		product1.setDescription("Dell 2022 model klavye");
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Mouse");
		product2.setUnitPrice(150);
		product2.setDescription("Dell 2021 model mouse");
		
		Product product3 = new Product(3,"Telefon",100000,"IPhone 11");
		Product product4 = new Product(3,"PC",900000,"MSI");
		ProductManager manager = new ProductManager();
		manager.add(product1);
		manager.add(product2);
		manager.add(product3);
		manager.add(product3);
		manager.delete(product2);
//		manager.delete(product2);
//		manager.update(product4);
		
		
		for (Product product : manager.getAll()) {
			System.out.println("----"+product.getId()+ "/"+product.getUnitPrice());
		}
		
		
		
		
		
		
		
		
//		List<User> Users = new ArrayList<User>();
//		User user1 = new User();
//		user1.setId(1);
//		user1.setFirstName("Goksel");
//		user1.setLastName("Dogan");
//		user1.setCity("Eskisehir");
//		Users.add(user1);
//		User user2 = new User();
//		user2.setId(2);
//		user2.setFirstName("Mert");
//		user2.setLastName("Aktas");
//		user2.setCity("Ankara");
//		Users.add(user2);
//		User user3 = new User(3,"Osman","Onurlu","Ankara");
//		Users.add(user3);
//		for (User user : Users) {
//			if(user.getCity()=="Ankara") 
//			{
//				System.out.println("Id:"+user.getId());
//				System.out.println("First Name:"+user.getFirstName());
//				System.out.println("Last Name:"+user.getLastName());
//				System.out.println("City:"+user.getCity());
//			}
//			
//			
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
//		Product product1 = new Product();
//		product1.setId(1);
//		product1.setName("Klavye");
//		product1.setUnitPrice(250);
//		product1.setDescription("Dell 2022 model klavye");
//		
//		Product product2 = new Product();
//		product2.setId(2);
//		product2.setName("Mouse");
//		product2.setUnitPrice(150);
//		product2.setDescription("Dell 2021 model mouse");
//		
//		Product product3 = new Product(3,"Telefon",100000,"IPhone 11");
//
//		List<Product> products = new ArrayList<Product>();
//		products.add(product1);
//		products.add(product2);
//		products.add(product3);
//		
//		for (Product item : products) {
//			System.out.println("ID) "+item.getId());
//			System.out.println("Name) "+item.getName());
//			System.out.println("Price) "+item.getUnitPrice());
//			System.out.println("Description) "+item.getDescription());
//		}
	}
//Instructer,course,category
}
