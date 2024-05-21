package data;

import lombok.Data;

import java.util.List;
@Data
public class Hospital {
    private String name;
    private String address;
    private String branches;
    private List <String> professions;
    private List<Doctor> doctors;
    private List<Cabinets> cabinets;
}
