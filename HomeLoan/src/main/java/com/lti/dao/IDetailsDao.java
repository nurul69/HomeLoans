package com.lti.dao;

import java.util.List;

import javax.validation.Valid;

import com.lti.entities.Customer;
import com.lti.entities.Loan;
import com.lti.entities.User;

public interface IDetailsDao {

    User findUserById(int id);

    User createUser(User user);

    User createUser(String username);

    List<User> allUsers();

	void deleteUser(Integer id);

	User updateUser(Integer id,String name);

	void addCust(Customer customer);

	void addCust(@Valid Loan loan);


}
