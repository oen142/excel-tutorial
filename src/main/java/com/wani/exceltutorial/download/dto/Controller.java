package com.wani.exceltutorial.download.dto;

import com.lannstark.excel.ExcelFile;
import com.lannstark.excel.multiplesheet.MultiSheetExcelFile;
import com.wani.exceltutorial.download.dto.ExcelDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    @GetMapping("/any-url")
    private void methodName(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        List<ExcelDto> excelDtoList = new ArrayList<>();

        for (int i = 0; i < 2000000; i++) {
            excelDtoList.add(new ExcelDto("excel" + i, i, LocalDate.now()));
        }
        ExcelFile excelFile = new MultiSheetExcelFile<>(excelDtoList, ExcelDto.class);
        excelFile.write(response.getOutputStream());
    }
}
