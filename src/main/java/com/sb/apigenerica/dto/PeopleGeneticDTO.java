package com.sb.apigenerica.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "typeFlow",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CoordinatorDTO.class, name = PeopleFlow.FLOW_COORDNATOR),
        @JsonSubTypes.Type(value = ProgrammerDTO.class, name = PeopleFlow.FLOW_PROGRAMMER)
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class PeopleGeneticDTO implements Serializable {
    private String name;
    private String typeFlow;
}
