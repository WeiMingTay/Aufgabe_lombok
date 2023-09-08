package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@With
public class Student {
    private int id;
    private String name;
    private String address;
    private int grade;

}
