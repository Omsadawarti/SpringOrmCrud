/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringOrmCrud.Dao;

import com.SpringOrm.Entities.Employee;
import java.util.List;

/**
 *
 * @author OM
 */
public interface EmployeeDao {
    
    public void insert(Employee employee);
    
    public void update(Employee employee);
    
    public Employee getEmployee(int employeeId);
    
    public List<Employee> getAllEmployee();
    
    public void delete(int employeeId);
}
