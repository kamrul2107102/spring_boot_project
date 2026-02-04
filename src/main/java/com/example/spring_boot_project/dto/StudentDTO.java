package com.example.spring_boot_project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    
    private Long id;
    private String studentId;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private Integer enrollmentYear;
    private Long departmentId;
    private String departmentName;
    private List<CourseDTO> courses;
}
