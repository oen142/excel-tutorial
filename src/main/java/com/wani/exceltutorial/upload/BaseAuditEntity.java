package com.wani.exceltutorial.upload;

import com.github.cla9.excel.reader.annotation.ExcelColumn;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
public class BaseAuditEntity {

    private String creator;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDate createAt;

    private String updater;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDate updatedAt;

}