package com.jatinder.creational.builder;

public class Student {
    private Integer id;
    private String name;
    private Integer age;

    private Student(StudentBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    static class StudentBuilder {
        private Integer id;
        private String name;
        private Integer age;

        private StudentBuilder(){

        }

        public StudentBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Student build(){
            if(age < 18) throw new IllegalStateException("Minimum age should be 18 or above");
            return new Student(this);
        }
    }
}
