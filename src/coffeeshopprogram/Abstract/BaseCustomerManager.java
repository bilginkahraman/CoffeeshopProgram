package coffeeshopprogram.Abstract;

import coffeeshopprogram.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void saveCustomer(Customer customer) throws Exception {
		System.out.println("Save to db :" + customer.getFirstName());

	}

}
