package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@AllArgsConstructor
@Builder
@Value
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private Student student;
}
