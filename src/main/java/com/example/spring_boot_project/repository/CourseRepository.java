package com.example.spring_boot_project.repository;

import com.example.spring_boot_project.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional<Course> findByCode(String code);
    boolean existsByCode(String code);
    List<Course> findByDepartmentId(Long departmentId);
    List<Course> findByTeacherId(Long teacherId);
    
    @Query("SELECT c FROM Course c JOIN c.students s WHERE s.id = :studentId")
    List<Course> findByStudentId(@Param("studentId") Long studentId);
}
