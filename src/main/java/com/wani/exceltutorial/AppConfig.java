package com.wani.exceltutorial;

import com.github.cla9.excel.reader.annotation.EnableExcelEntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableExcelEntityScan(basePackageClasses = ExcelTutorialApplication.class)
public class AppConfig {
}
