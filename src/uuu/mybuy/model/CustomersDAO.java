package uuu.mybuy.model;

import java.util.List;
import uuu.mybuy.domain.Customer;
import uuu.mybuy.domain.MyBuyException;

public class CustomersDAO implements DAOInsterface<String,Customer>{
	static final String Driver = "com.mysql.jdbc.Driver";
	static final String url = "jdbc:mysql://localhost:3306/totalbuy?zeroDateTimeBehavior=convertToNull&characterEncoding=utf-8";
	static final String userId = "root";
	static final String pwd = "root1234";
	
	static final String Insert = "INSERT INTO customers(id, name, password, gender, email) VALUES(?, ?,?, ?, ?);";
	@Override
	public void insert(Customer date) throws MyBuyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer date) throws MyBuyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer date) throws MyBuyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer get(String id) throws MyBuyException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() throws MyBuyException {
		// TODO Auto-generated method stub
		return null;
	}

}
