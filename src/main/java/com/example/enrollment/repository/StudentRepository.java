package com.example.enrollment.repository;

import com.example.enrollment.model.Student;
import org.springframework.data.jpa.repository.*;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s.name, c.title FROM Student s JOIN s.courses c")
    List<Object[]> getStudentCourseDetails();
}
