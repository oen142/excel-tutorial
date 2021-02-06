package com.wani.exceltutorial.download.dto;

import com.lannstark.ExcelColumn;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class ExcelDto {

    @ExcelColumn(headerName = "User name")
    private String name;

    @ExcelColumn(headerName = "User Age")
    private int age;

    @ExcelColumn(headerName = "Happy BirthDay")
    private LocalDate birthDay;
}
