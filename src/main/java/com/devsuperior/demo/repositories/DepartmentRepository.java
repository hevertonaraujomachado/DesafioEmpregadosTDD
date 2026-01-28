package com.devsuperior.demo.repositories;


import com.devsuperior.demo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Employee, Long> {

}
