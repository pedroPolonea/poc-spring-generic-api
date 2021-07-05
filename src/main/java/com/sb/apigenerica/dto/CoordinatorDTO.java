package com.sb.apigenerica.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName(PeopleFlow.FLOW_COORDNATOR)
public class CoordinatorDTO extends PeopleGeneticDTO {
    private String cilo;

    @Min(value = 1, message = "Poh jovem não pode ser zero")
    private int level;

}
