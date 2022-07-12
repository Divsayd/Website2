package com.example.demo.model;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class extra {
    private String created_by;
    private String updated_by;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
