package tables;

import services.ParserExcel;

import java.io.IOException;
import java.util.List;


public class Tables {
    public static List<DevelopersData> developers;
    public static List<MedCard> cards;
    public static List<Standards> standards;
    public static List<Timetable> timetables;
    public static void initializeAllExcelTables() throws IOException {
        developers = ParserExcel.initializeDevelopers("Данные по застройщикам.xlsx");
        cards = ParserExcel.initializeCards("Карточка мед.организации.xlsx");
        standards = ParserExcel.initializeStandard("Нормативы.xlsx");
        timetables = ParserExcel.initializeTimetable("Карточка мед.организации.xlsx");
    }
}
