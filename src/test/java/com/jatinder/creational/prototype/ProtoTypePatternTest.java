package com.jatinder.creational.prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProtoTypePatternTest {

    private final String studentRegistryKey = "student-1";
    private final Student student = new Student();
    private final String intelligentStudentRegistryKey = "student-2";
    private final Student intelligentStudent = new IntelligentStudent();

    @BeforeEach
    void setUp() {
        //register student details in student registry
        student.setId("1");
        student.setName("John");
        StudentRegistry.register(studentRegistryKey, student);

        //register student details in student registry
        intelligentStudent.setId("2");
        intelligentStudent.setName("Adam");
        StudentRegistry.register(intelligentStudentRegistryKey, intelligentStudent);
    }

    @Test
    void studentSimpleProtoTypeTest() {
        Student studentClone = StudentRegistry.get(studentRegistryKey);
        assertNotEquals(this.student.hashCode(), studentClone.hashCode());

        studentClone.setClassName("1st");
        studentClone.setMarks("80.0");

        Student studentClone2 = StudentRegistry.get(studentRegistryKey);
        assertNotEquals(studentClone.hashCode(), studentClone2.hashCode());

        studentClone2.setClassName("2nd");
        studentClone2.setMarks("88.0");

        //id of student should match with original object
        assertEquals(this.student.getId(), studentClone.getId());
        assertEquals(this.student.getId(), studentClone2.getId());

        assertEquals(studentClone.getId(), studentClone2.getId());
        assertEquals(studentClone.getName(), studentClone2.getName());

        assertNotEquals(studentClone.getClassName(), studentClone2.getClassName());
        assertNotEquals(studentClone.getMarks(), studentClone2.getMarks());

    }

    @Test
    void studentInheritanceProtoTypeTest() {
        Student intelligentStudentClone = StudentRegistry.get(intelligentStudentRegistryKey);
        assertNotEquals(this.intelligentStudent.hashCode(), intelligentStudentClone.hashCode());

        intelligentStudentClone.setClassName("1st");
        intelligentStudentClone.setMarks("80.0");

        Student intelligentStudentClone2 = StudentRegistry.get(intelligentStudentRegistryKey);
        assertNotEquals(intelligentStudentClone.hashCode(), intelligentStudentClone2.hashCode());

        intelligentStudentClone2.setClassName("2nd");
        intelligentStudentClone2.setMarks("88.0");

        //id of student should match with original object
        assertEquals(this.intelligentStudent.getId(), intelligentStudentClone.getId());
        assertEquals(this.intelligentStudent.getId(), intelligentStudentClone2.getId());

        //id, name of student should match of both clone objects in case not changed
        assertEquals(intelligentStudentClone.getId(), intelligentStudentClone2.getId());
        assertEquals(intelligentStudentClone.getName(), intelligentStudentClone2.getName());

        //class and marks should differ for both clone object in case changed
        assertNotEquals(intelligentStudentClone.getClassName(), intelligentStudentClone2.getClassName());
        assertNotEquals(intelligentStudentClone.getMarks(), intelligentStudentClone2.getMarks());
    }
}
