package com.attendance.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentAtt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollno;
    private String stuname;
    private String stuclass;
    private String stuadd;

    public Long getRollno() {
        return rollno;
    }

    public void setRollno(Long rollno) {
        this.rollno = rollno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    public String getStuadd() {
        return stuadd;
    }

    public void setStuadd(String stuadd) {
        this.stuadd = stuadd;
    }

    public StudentAtt(Long rollno, String stuname, String stuclass, String stuadd) {
        this.rollno = rollno;
        this.stuname = stuname;
        this.stuclass = stuclass;
        this.stuadd = stuadd;
    }

    @Override
    public String toString() {
        return "StudentAtt{" +
                "rollno=" + rollno +
                ", stuname='" + stuname + '\'' +
                ", stuclass='" + stuclass + '\'' +
                ", stuadd='" + stuadd + '\'' +
                '}';
    }

    public StudentAtt() {
    }
}

