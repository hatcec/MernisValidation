package Abstract;

import Entities.Customer;

public class CustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		CheckIfRealPerson(customer);
		System.out.println("saved to db: "+customer.getName());
	}
	private void CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	

}