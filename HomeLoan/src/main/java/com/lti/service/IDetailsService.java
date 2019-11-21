package com.lti.service;


import java.util.List;

import javax.validation.Valid;

import com.lti.entities.Customer;
import com.lti.entities.Loan;
import com.lti.entities.User;

public interface IDetailsService {

    User findUserById(int id);

    User createUser(User user);

    User createUser(String name);

    List<User> allUsers();

	void deleteUser(Integer id);

	User updateUser(Integer id, String name);

	void addCust(Customer customer);

	void addLoan(@Valid Loan loan);

	
}
