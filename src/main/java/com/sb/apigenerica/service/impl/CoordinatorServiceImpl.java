package com.sb.apigenerica.service.impl;

import com.sb.apigenerica.dto.PeopleFlow;
import com.sb.apigenerica.dto.PeopleGeneticDTO;
import com.sb.apigenerica.service.PeopleFlowService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CoordinatorServiceImpl implements PeopleFlowService {
    @Override
    public List<String> getTypeFlow() {
        return Arrays.asList(PeopleFlow.FLOW_COORDNATOR);
    }

    @Override
    public int createPeople(PeopleGeneticDTO peopleGeneticDTO) {
        return 0;
    }
}
