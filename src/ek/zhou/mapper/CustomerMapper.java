package ek.zhou.mapper;

import java.util.List;

import ek.zhou.pojo.Customer;

public interface CustomerMapper {

	public List<Customer> list(Customer customer) ;
	public int add(Customer customer);
	public void delete(int id);
	public int update(Customer customer);
	public Customer get(int id);
}
