package com.sb.apigenerica.service.impl;

import com.sb.apigenerica.dto.CoordinatorDTO;
import com.sb.apigenerica.dto.PeopleFlow;
import com.sb.apigenerica.dto.PeopleGeneticDTO;
import com.sb.apigenerica.service.PeopleFlowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class CoordinatorServiceImpl implements PeopleFlowService {
    @Override
    public List<String> getTypeFlow() {
        return Arrays.asList(PeopleFlow.FLOW_COORDNATOR);
    }

    @Override
    public int createPeople(PeopleGeneticDTO peopleGeneticDTO) {
        final CoordinatorDTO coordinatorDTO = (CoordinatorDTO) peopleGeneticDTO;
        log.info("M=createPeople, coordinatorDTO={}", coordinatorDTO);
        return 1;
    }
}
