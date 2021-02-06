package com.wani.exceltutorial.upload;


import com.github.cla9.excel.reader.annotation.ExcelBody;
import lombok.Getter;

@ExcelBody(dataRowPos = 2)
@Getter
public class Person extends BaseAuditEntity {
    private String name;
    private String gender;
    private Integer age;
    private Address address;
}
