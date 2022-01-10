package Console;

import java.time.LocalDate;

import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setName("HATÝCE");
		customer.setLastName("****");
		customer.setId(0);
		customer.setNationalityId("***********");
		customer.setDateOfBirth(LocalDate.of(1996, 3, 12));
		CustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer);
		CustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(customer);
	}

}
