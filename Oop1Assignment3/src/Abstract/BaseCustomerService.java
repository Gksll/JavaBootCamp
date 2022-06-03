package Abstract;

import Entities.Customer;

public abstract class BaseCustomerService implements CustomerService {
	public void Add(Customer customer) {
		System.out.println("Basariyla Kayit Olundu : " + customer.firstName);
	}

	public void Delete(Customer customer) {
		System.out.println("Kayit Silindi : " + customer.firstName);
	}

	public void Update(Customer customer) {
		System.out.println(" Kayit Guncellendi : " + customer.firstName);
	}
}
