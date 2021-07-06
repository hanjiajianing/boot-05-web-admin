package com.example.boot05webadmin.admin.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;

}
