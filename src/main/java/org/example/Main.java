package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(
                123,
                "Erykah",
                "Dallas",
                1);
        Student student2 = new Student(
                124,
                "Yasiin",
                "New York",
                2
        );
        System.out.println(student1 + "\n" + student2);
        Set<Student> allStudents = new HashSet<>();
        allStudents.add(student1);
        allStudents.add(student2);
        Student student3 = student1.withGrade(2).withAddress("Brooklyn");
        System.out.println(student3);

        Teacher teacher1 = new Teacher(987, "KRS-One", "Brooklyn");
        Teacher teacher2 = Teacher.builder()
                .id(986)
                .name("Rakim")
                .subject("Lyricism")
                .build();
        System.out.println(teacher1 + "\n" + teacher2);

        Course course1 = new Course(
                567,
                "Lyricism",
                teacher2, student2);
        Course course2 = Course.builder()
                .id(568)
                .name("New York")
                .teacher(teacher1)
                .student(student1)
                .build();

        System.out.println(course1+"\n"+course2);







        /*  Product product = new Product(
                "123",
                "Tariq",
                23);
        Product product1 = Product.builder()
                .id("234")
                .name("Ahmir")
                .build();

        // greift auf den 1 hinzu und erstellt eine neue mit with
        Product product2 = new Product(product1.getId(), product1.getName(), 13);
        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
        Product product3 = product1.withCount(42);
        System.out.println(product3);
    */
    }

}