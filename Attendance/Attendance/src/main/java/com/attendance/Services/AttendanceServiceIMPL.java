package com.attendance.Services;

import com.attendance.Entity.StudentAtt;
import com.attendance.Repository.StudentAttRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceServiceIMPL implements AttendanceServices{

   @Autowired
    private StudentAttRepo attRepo;
    @Override
    public StudentAtt saveStudent(StudentAtt studentAtt) {


        return (StudentAtt) attRepo.save(studentAtt);
    }

    @Override
    public List<StudentAtt> getstubyname(String stuname) {
        return attRepo.findByStuname(stuname);
    }

    @Override
    public void deletebyid(Long rollno) {
        attRepo.deleteById(rollno);
    }

    @Override
    public Optional<StudentAtt> updateinfo(Long rollno, StudentAtt updtin) {
        Optional<StudentAtt> stu=attRepo.findById(rollno);
        if (stu.isPresent())
        {
          StudentAtt x =stu.get();
          x.setStuname(updtin.getStuname());

          attRepo.save(x);
        }
        return stu;
    }

//    @Override
//    public StudentAtt updateinfo(StudentAtt updtin) {
//        return attRepo.;
//    }

//    @Override
//    public StudentAtt deletebyid(Long rollno) {
//        return attRepo.deleteById(rollno);
//    }

}
