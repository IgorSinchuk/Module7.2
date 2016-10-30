package com.java.goit.dao;

import com.java.goit.model.Employee;

import java.util.List;

public interface EmployeeDao {

    void save(Employee employee);

    Employee getEmployeeById(Long id);

    List<Employee> findAllEmployee();

    Employee findByName(String name);

    void remove(Employee employee);

    void removeAll();

}
