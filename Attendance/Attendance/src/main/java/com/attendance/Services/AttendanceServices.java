package com.attendance.Services;

import com.attendance.Entity.StudentAtt;

import java.util.List;
import java.util.Optional;

public interface AttendanceServices {

    StudentAtt saveStudent(StudentAtt studentAtt);

    List<StudentAtt> getstubyname(String stuname);


    void deletebyid(Long rollno);


    Optional<StudentAtt> updateinfo(Long rollno, StudentAtt updtin);
}
