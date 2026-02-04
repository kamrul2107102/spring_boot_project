package com.example.spring_boot_project.repository;

import com.example.spring_boot_project.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Optional<Teacher> findByTeacherId(String teacherId);
    Optional<Teacher> findByUserId(Long userId);
    Optional<Teacher> findByUserEmail(String email);
    boolean existsByTeacherId(String teacherId);
    List<Teacher> findByDepartmentId(Long departmentId);
}
