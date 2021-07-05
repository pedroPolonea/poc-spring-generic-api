package com.sb.apigenerica.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName(PeopleFlow.FLOW_PROGRAMMER)
public class ProgrammerDTO extends PeopleGeneticDTO {
    private String registration;
    private String language;
}