package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager{
	CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub

		if (checkService.checkIfRealPerson(customer)) {
			// System.out.println("saved to starbucks db: " + customer.getFirstName());
			save(customer);
		}else {
			System.out.println("Not a valid person");
		}

	}

}



