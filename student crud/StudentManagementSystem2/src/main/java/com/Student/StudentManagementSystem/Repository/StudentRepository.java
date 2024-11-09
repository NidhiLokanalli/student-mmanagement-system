package com.Student.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Student.StudentManagementSystem.Model.*;

public interface StudentRepository extends JpaRepository<Student,Long>{
}
