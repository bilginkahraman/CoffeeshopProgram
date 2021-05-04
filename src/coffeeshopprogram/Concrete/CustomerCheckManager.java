package coffeeshopprogram.Concrete;

import coffeeshopprogram.Abstract.CustomerCheckService;
import coffeeshopprogram.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
