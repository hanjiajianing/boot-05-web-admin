package com.example.boot05webadmin.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {

    private String userName;
    private String password;
    private String address;
    private String e_mail;
    private String phone_number;
}
