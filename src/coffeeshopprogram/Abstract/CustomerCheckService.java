package coffeeshopprogram.Abstract;

import coffeeshopprogram.Entities.Customer;

public  interface CustomerCheckService {
	public  boolean  checkIfRealPerson(Customer customer);
}
