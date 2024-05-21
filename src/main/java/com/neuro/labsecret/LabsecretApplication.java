package com.neuro.labsecret;

import org.apache.poi.ss.usermodel.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LabsecretApplication {
	//		SpringApplication.run(LabsecretApplication.class, args);
    static ParserExel parserExel = new ParserExel();
    public static void main(String[] args) throws IOException {
        List<DevelopersData> developersData = parserExel.developersDataList("Данные по застройщикам.xlsx");
        List<MedCard> medCards = parserExel.initMedСards("Карточка мед.организации.xlsx");
        List<Standards> standardsList  = parserExel.standardsList("Нормативы.xlsx");
        List<Timetable> timetableList = parserExel.initializeTimetable("Карточка мед.организации.xlsx");
        for(Timetable data:timetableList){
            System.out.println(data);
        }
    }
}
