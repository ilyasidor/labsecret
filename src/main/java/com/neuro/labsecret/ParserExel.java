package com.neuro.labsecret;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserExel {

    public List<DevelopersData> developersDataList(String addresToExel) throws IOException {
        List<DevelopersData> developersDataList = new ArrayList<>();
        Workbook workbook = WorkbookFactory.create(new File(addresToExel));
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            if(row.getRowNum()!=0){
                DevelopersData data = new DevelopersData();
                data.setResidentialComplex(row.getCell(0).toString());
                data.setAddress(row.getCell(1).toString());
                data.setLongitude(row.getCell(2).toString());
                data.setLatitude(row.getCell(3).toString());
                data.setYear(Double.parseDouble(row.getCell(4).toString()));
                data.setPercent(Double.parseDouble(row.getCell(5).toString()));
                data.setSquare(Double.parseDouble(row.getCell(6).toString()));
                data.setCountApartment(Double.parseDouble(row.getCell(7).toString()));
                developersDataList.add(data);
            }
        }
        workbook.close();
        return developersDataList;
    }
    public List<MedCard> initMedСards(String addressToExel) throws IOException {
        List<MedCard> medCards = new ArrayList<>();
        Workbook workbook = WorkbookFactory.create(new File(addressToExel));
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            if(row.getRowNum()!=0){
                MedCard data = new MedCard();
                data.setNameOfMedicalOrganization(row.getCell(1).toString());
                data.setNameOfFilial(row.getCell(2).toString());
                data.setAddressOfFilial(row.getCell(3).toString());
                data.setLatitude(row.getCell(4).toString().isEmpty()?0:Double.parseDouble(row.getCell(4).toString()));
                data.setLatitude(row.getCell(5).toString().isEmpty()?0:Double.parseDouble(row.getCell(5).toString()));
                data.setType(row.getCell(6).toString());
                data.setDistribution((row.getCell(7).toString()).equals("да"));
                data.setDayHospital((row.getCell(8).toString()).equals("да"));
                data.setMedicalOutpatientClinic((row.getCell(9).toString()).equals("да"));
                data.setGeneralPractice((row.getCell(10).toString()).equals("да"));
                data.setChildCenter((row.getCell(11).toString()).equals("да"));
                data.setAllergologyRoomCount(Double.parseDouble(row.getCell(12).toString()));
                data.setVisionCabinetCount(Double.parseDouble(row.getCell(13).toString()));
                data.setTraumatologyOrthopedicRoomCount(Double.parseDouble(row.getCell(13).toString()));
                data.setMedicalSocialCaresRoomCount(Double.parseDouble(row.getCell(14).toString()));
                data.setEmergencyRoomCount(Double.parseDouble(row.getCell(15).toString()));
                data.setChildrenRoomCount(Double.parseDouble(row.getCell(16).toString()));
                data.setBadChildrenRoomCount(Double.parseDouble(row.getCell(17).toString()));
                data.setPediatriciansRoomCount(Double.parseDouble(row.getCell(18).toString()));
                data.setGoodChildrenRoomCount(Double.parseDouble(row.getCell(19).toString()));
                data.setFreeRoomsCount(Double.parseDouble(row.getCell(20).toString()));
                data.setTotalPopulationsCount(Double.parseDouble(row.getCell(21).toString()));
                data.setWorkersCount(Double.parseDouble(row.getCell(22).toString()));
                data.setWorkersCount(Double.parseDouble(row.getCell(23).toString()));
                data.setOldsCount(Double.parseDouble(row.getCell(24).toString()));
                data.setWomenCount(Double.parseDouble(row.getCell(25).toString()));
                data.setStudentsCount(Double.parseDouble(row.getCell(26).toString()));
                data.setCancersCount(Double.parseDouble(row.getCell(27).toString()));
                data.setDayHospitalBedsCount(Double.parseDouble(row.getCell(28).toString()));
                data.setPediatricianBedsCount(Double.parseDouble(row.getCell(29).toString()));
                data.setUltrasoundMachineShiftsCount(Double.parseDouble(row.getCell(30).toString()));
                data.setTotalVisitsCount(Double.parseDouble(row.getCell(31).toString()));
                medCards.add(data);
            }
        }
        workbook.close();
        return medCards;
    }
    public List<Standards> standardsList(String addresToExel) throws IOException {
        List<Standards> standardsList = new ArrayList<>();
        Workbook workbook = WorkbookFactory.create(new File(addresToExel));
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            if(row.getRowNum()!=0){
                Standards data = new Standards();
                data.setNormType(row.getCell(0).toString());
                data.setPositionName(row.getCell(1).toString());
                data.setRecommendedStaffNorms(row.getCell(2).toString());
                data.setConditionParameter(row.getCell(3).toString());
                data.setCondition(Double.valueOf((row.getCell(4).toString())));
                data.setMeasurementUnit((row.getCell(5).toString()));
                data.setRecommendedStaffNormsQuantity(Double.parseDouble(row.getCell(6).toString()));
                standardsList.add(data);
            }
        }
        workbook.close();
        return standardsList;
    }
    public List<Timetable> initializeTimetable(String pathToExcelFile) throws IOException {
        List<Timetable> timetables = new ArrayList<>();
        Workbook workbook = WorkbookFactory.create(new File(pathToExcelFile));
        Sheet sheet = workbook.getSheetAt(1);
        for (Row row : sheet) {
            if(row.getRowNum()!=0) {
                Timetable timetable = new Timetable();
                timetable.setOrganizationName(row.getCell(0).toString());
                timetable.setBranchName(row.getCell(1).toString());
                timetable.setBranchAddress(row.getCell(2).toString());
                timetable.setPositionName(row.getCell(3).toString());
                timetable.setStaffUnitsCount(row.getCell(4).toString().isEmpty()?0:Double.parseDouble(row.getCell(4).toString()));
                timetable.setOccupiedUnitsCount(row.getCell(5).toString().isEmpty()?0:Double.parseDouble(row.getCell(5).toString()));
                timetable.setIndividualCount(row.getCell(6).toString().isEmpty()?0:Double.parseDouble(row.getCell(6).toString()));
                timetable.setExternalPartTimeCount(row.getCell(7).toString().isEmpty()?0:Double.parseDouble(row.getCell(7).toString()));
                timetables.add(timetable);
            }
        }
        workbook.close();
        return timetables;
    }

}
