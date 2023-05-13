package com.manmohan.springbootcrudapi.springbootcrudapi.dao;
import java.util.*;

import com.manmohan.springbootcrudapi.springbootcrudapi.model.Employee;

public interface EmployeeDAO {
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);
	void delete(int id);
}
