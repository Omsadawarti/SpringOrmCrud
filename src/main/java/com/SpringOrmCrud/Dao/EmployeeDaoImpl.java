/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringOrmCrud.Dao;

import com.SpringOrm.Entities.Employee;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author OM
 */
@Component
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    @Qualifier("hibernateTemplate")
    HibernateTemplate template;
    
    @Transactional
    @Override
    public void insert(Employee employee) {
       this.template.save(employee) ;
    }

    @Transactional
    @Override
    public void update(Employee employee) {
       this.template.update(employee);
    }

    @Override
    public Employee getEmployee(int employeeId) {
        Employee emp = this.template.get(Employee.class, employeeId);
        
        return emp;
    }

    @Override
    public List<Employee> getAllEmployee() {
       List<Employee> employeeList = this.template.loadAll(Employee.class);
       return employeeList;
    }
    
    @Transactional
    @Override
    public void delete(int employeeId) {
       Employee emp = getEmployee(employeeId);
       this.template.delete(emp);
    }
    
}
