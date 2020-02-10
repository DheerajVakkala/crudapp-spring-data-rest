package com.dheeraj.springboot.crudapp.dao;

import com.dheeraj.springboot.crudapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
