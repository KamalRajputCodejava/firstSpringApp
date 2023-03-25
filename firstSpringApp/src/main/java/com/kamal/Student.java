/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kamal;

/**
 *
 * @author Lenovo
 */
public class Student {
    private int Id ;
    private String studentName;
    private String studentAddresselcome;

    public Student(int Id, String studentName, String studentAddresselcome) {
        this.Id = Id;
        this.studentName = studentName;
        this.studentAddresselcome = studentAddresselcome;
    }

    public Student() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddresselcome() {
        return studentAddresselcome;
    }

    public void setStudentAddresselcome(String studentAddresselcome) {
        this.studentAddresselcome = studentAddresselcome;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", studentName=" + studentName + ", studentAddresselcome=" + studentAddresselcome + '}';
    }
    
    
    
}
