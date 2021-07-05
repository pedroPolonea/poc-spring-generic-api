package com.sb.apigenerica.service;

import com.sb.apigenerica.dto.PeopleGeneticDTO;

import java.util.List;

public interface PeopleFlowService {

    public List<String> getTypeFlow();

    public int createPeople(PeopleGeneticDTO peopleGeneticDTO);
}
