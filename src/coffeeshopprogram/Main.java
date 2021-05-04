package coffeeshopprogram;

import java.util.Date;

import coffeeshopprogram.Abstract.BaseCustomerManager;
import coffeeshopprogram.Concrete.NeroCustomerManager;
import coffeeshopprogram.Concrete.StarbucksCustomerManager;
import coffeeshopprogram.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.saveCustomer(new Customer(0, "Bilgin", "Kahraman", "12345678910", new Date(1991)));
		BaseCustomerManager customerManager2=new StarbucksCustomerManager();
	}

}
