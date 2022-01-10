package Concrete;

import Abstract.CustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends CustomerManager{
	@Override
	public void save(Customer customer) {
		super.save(customer);
	}
}
