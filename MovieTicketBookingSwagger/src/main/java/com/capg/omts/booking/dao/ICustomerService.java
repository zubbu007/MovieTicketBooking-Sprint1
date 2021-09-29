package com.capg.omts.booking.dao;

import java.util.List;

import com.capg.omts.booking.model.Customer;


public interface ICustomerService {
	public abstract Customer addCustomer(Customer customer);
	public abstract Customer updateCustomer(Customer customer);
	public abstract Customer deleteCustomer(Customer customer);
	public abstract Customer viewCustomer(int custid);
	public abstract List<Customer> viewAllCustomers(int movieid);
}