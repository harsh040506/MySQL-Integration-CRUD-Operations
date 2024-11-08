package com.example.mysqldatabaseintegration.Service;

import com.example.mysqldatabaseintegration.Model.Employee;
import com.example.mysqldatabaseintegration.Repository.EmployeeRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepsitory employeeRepsitory;

    public Employee saveEmployee(Employee employee){
        return employeeRepsitory.save(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepsitory.findAll();
    }

    public Employee getEmployeeById(long id) {
        Optional<Employee> employee =  employeeRepsitory.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else {
            throw new RuntimeException();
        }
    }

    public Employee updateEmployee(Employee employee, long id) {
        Employee existingEmployee = employeeRepsitory.findById(id).orElseThrow(()-> new RuntimeException());
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        employeeRepsitory.save(existingEmployee);
        return existingEmployee;
    }

    public void deleteEmployee(long id) {
        employeeRepsitory.findById(id).orElseThrow(()-> new RuntimeException());
        employeeRepsitory.deleteById(id);
    }
}