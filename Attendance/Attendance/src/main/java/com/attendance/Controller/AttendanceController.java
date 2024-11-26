package com.attendance.Controller;

import com.attendance.Entity.StudentAtt;
import com.attendance.Services.AttendanceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AttendanceController {

    @Autowired
    private AttendanceServices services ;

    @PostMapping("/stddata")
    public StudentAtt saveStudent(@RequestBody StudentAtt studentAtt){

        return services.saveStudent(studentAtt);
    }

    @GetMapping("/getname/{stuname}")
    public List<StudentAtt> getstubyname (@PathVariable String stuname){

        return services.getstubyname(stuname);
    }

    @DeleteMapping("/del/{rollno}")
    public void deletebyid(@PathVariable Long rollno){

         services.deletebyid(rollno);
    }

    @PutMapping("/update/{rollno}")
    public Optional<StudentAtt> updateinfo(@PathVariable Long rollno, @RequestBody StudentAtt updtin ){
        return  services.updateinfo(rollno,updtin);

    }




}
