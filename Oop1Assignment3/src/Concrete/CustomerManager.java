package Concrete;

import Abstract.BaseCustomerService;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerManager extends BaseCustomerService {

	CustomerCheckService customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Add(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Add(customer);
		} else {
			System.out.println("Hata");
		}
	}

}
