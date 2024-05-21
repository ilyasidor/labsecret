package pojos;

import lombok.Data;

@Data
public class Standards {
    private String normType;
    private String positionName;
    private String recommendedStaffNorms;
    private String conditionParameter;
    private Double condition;
    private String measurementUnit;
    private double recommendedStaffNormsQuantity;
}

