package com.wani.exceltutorial.upload;

import com.github.cla9.excel.reader.worker.ExcelTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class SampleController {
    private final ExcelTemplate excelTemplate;

    public SampleController(ExcelTemplate excelTemplate) {
        this.excelTemplate = excelTemplate;
    }

    @PostMapping(value = "/form", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Void> getExcelResult(@RequestParam("file") MultipartFile file) {
        excelTemplate.parse(Person.class, file, person -> {
            System.out.println("이름은 : " + person.getName());
            System.out.println("나이는 : " + person.getAge());
            System.out.println("성별는 : " + person.getGender());
            System.out.println("시도는 : " + person.getAddress().getZipCode());
            System.out.println("도로명는 : " + person.getAddress().getStreet());
            System.out.println("우편번호는 : " + person.getAddress().getCity());
            System.out.println("생성자는 : " + person.getCreator());
            System.out.println("생성일는 : " + person.getCreateAt());
            System.out.println("수정자는 : " + person.getUpdater());
            System.out.println("수정일는 : " + person.getUpdatedAt());
            System.out.println("=======================");
        }, error -> System.out.println("에러입니다."));
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
