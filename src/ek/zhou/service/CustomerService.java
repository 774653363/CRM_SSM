package ek.zhou.service;

import java.util.List;

import ek.zhou.pojo.Customer;

public interface CustomerService {

	List<Customer> list(Customer customer);

	void add(Customer customer);

	Customer get(int cust_id);

	void update(Customer customer);

	void delete(int cust_id);

}
