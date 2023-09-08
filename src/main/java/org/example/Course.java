package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private Student student;
}
