package com.suryatejasunkoju.EmployeeManagementSystem.repository;
import com.suryatejasunkoju.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
