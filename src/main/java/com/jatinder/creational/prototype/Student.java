package com.jatinder.creational.prototype;

public class Student implements StudentProtoType{
    private String id;
    private String name;
    private String className;
    private String marks;

    public Student(){

    }

    public Student(Student student){
        this.id = student.id;
        this.name = student.name;
        this.className = student.className;
        this.marks = student.marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
