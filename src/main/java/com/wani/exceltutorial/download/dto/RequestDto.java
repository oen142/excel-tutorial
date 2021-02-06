package com.wani.exceltutorial.download.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class RequestDto {
    private String name;
    private int age;
    private LocalDate birthDay;


}
