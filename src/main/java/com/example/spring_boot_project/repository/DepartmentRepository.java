package com.example.spring_boot_project.repository;

import com.example.spring_boot_project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<Department> findByCode(String code);
    Optional<Department> findByName(String name);
    boolean existsByCode(String code);
    boolean existsByName(String name);
}
