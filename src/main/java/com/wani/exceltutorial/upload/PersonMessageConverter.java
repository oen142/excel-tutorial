package com.wani.exceltutorial.upload;

import com.github.cla9.excel.reader.message.ExcelMessageRepository;

public class PersonMessageConverter implements ExcelMessageRepository {
    @Override
    public String getMessage(String code) {
        System.out.println("code = " + code);
        return code;
    }
}
