package com.jatinder.creational.prototype;

public class IntelligentStudent extends Student {
    private String iqLevel;

    public IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iqLevel = intelligentStudent.iqLevel;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
