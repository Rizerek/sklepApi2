package com.sklep2.sklepapi2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {
    private int id;
    private String name;
    private String email;
    private int role;
    private String password;
}
