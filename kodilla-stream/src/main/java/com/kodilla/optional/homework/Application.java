package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add((new Student("uczen1-null", null)));
        students.add(new Student("uczen2", new Teacher("Nauczyciel1")));
        students.add(new Student("uczen3", new Teacher("Nauczyciel2")));
        students.add(new Student("uczen4-null", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            Teacher teacher = optionalTeacher.orElse(new Teacher("<undefined>"));

            System.out.println("uczeń: " + student.getName() + ", nauczyciel: " + teacher.name);
        }
    }
}
