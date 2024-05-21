package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StaticStandards {
    private String type;
    private String profession;
    private String recommendedStandards;
    private String parameterCondition;
    private int condition;
    private String unit;
    private int recommendedStandardsCount;
}