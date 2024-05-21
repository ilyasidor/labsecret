package com.neuro.labsecret;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import pojos.DevelopersData;
import pojos.MedCard;
import pojos.Standards;
import pojos.Timetable;
import services.ParserExcel;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class LabsecretApplication {
	//		SpringApplication.run(LabsecretApplication.class, args);
    static ParserExcel parserExcel = new ParserExcel();
    public static void main(String[] args) throws IOException {
        List<DevelopersData> developersData = parserExcel.developersDataList("Данные по застройщикам.xlsx");
        List<MedCard> medCards = parserExcel.initMedСards("Карточка мед.организации.xlsx");
        List<Standards> standardsList  = parserExcel.standardsList("Нормативы.xlsx");
        List<Timetable> timetableList = parserExcel.initializeTimetable("Карточка мед.организации.xlsx");
    }
}
