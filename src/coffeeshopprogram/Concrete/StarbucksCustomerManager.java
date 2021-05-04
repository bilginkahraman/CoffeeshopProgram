package coffeeshopprogram.Concrete;

import coffeeshopprogram.Abstract.BaseCustomerManager;
import coffeeshopprogram.Abstract.CustomerCheckService;
import coffeeshopprogram.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}



	@Override
	public void saveCustomer(Customer customer) throws Exception {

		if(customerCheckService.checkIfRealPerson(customer)) {
			super.saveCustomer(customer);
		}
		else {
			throw new Exception("Not  Valid Person");
		}
		
		

	}

}
