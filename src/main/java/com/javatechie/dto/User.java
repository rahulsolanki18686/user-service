package com.javatechie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    private int id;
    private String name;
    private String email;
}
