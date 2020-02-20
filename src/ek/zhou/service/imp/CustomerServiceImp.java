package ek.zhou.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ek.zhou.mapper.CustomerMapper;
import ek.zhou.pojo.Customer;
import ek.zhou.service.CustomerService;
@Service
public class CustomerServiceImp implements CustomerService{
	@Autowired
	CustomerMapper customerMapper;
	@Override
	public List<Customer> list(Customer customer) {
		System.out.println(customer);
		return customerMapper.list(customer);
	}
	@Override
	public void add(Customer customer) {
		customerMapper.add(customer);
	}
	@Override
	public Customer get(int cust_id) {
		return customerMapper.get(cust_id);
	}
	@Override
	public void update(Customer customer) {
		customerMapper.update(customer);
	}
	@Override
	public void delete(int cust_id) {
		customerMapper.delete(cust_id);
	}

}
