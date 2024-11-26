package com.attendance.Repository;

import com.attendance.Entity.StudentAtt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentAttRepo extends JpaRepository <StudentAtt,Long>{


    List<StudentAtt> findByStuname(String stuname);


}
