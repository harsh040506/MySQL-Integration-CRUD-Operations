package com.example.mysqldatabaseintegration.Repository;

import com.example.mysqldatabaseintegration.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepsitory extends JpaRepository<Employee,Long> {

}
