package com.example.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Iteam {
    private String name;
    private String pay;
    private double amout;

    /*
     ("Dom", "Mona", 120.0),
             ("Jhon", "Charlie", 150.0),
             ("Bob", "Reha", 210.0),
             ("Jhon", "Mona", 150.0)

     */


}
