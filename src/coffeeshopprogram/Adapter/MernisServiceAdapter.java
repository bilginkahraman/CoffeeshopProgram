package coffeeshopprogram.Adapter;

import coffeeshopprogram.Abstract.CustomerCheckService;
import coffeeshopprogram.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
