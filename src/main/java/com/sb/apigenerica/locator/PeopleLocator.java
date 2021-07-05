package com.sb.apigenerica.locator;

import com.sb.apigenerica.service.PeopleFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PeopleLocator {

    @Autowired
    private List<PeopleFlowService> peopleFlowServices;

    private Map<String, PeopleFlowService> peopleFlowServiceMap = new HashMap<>();

    @PostConstruct
    private void init(){
        peopleFlowServices.forEach(service -> {
            service.getTypeFlow().forEach(type -> {
                peopleFlowServiceMap.put(type, service);
            });
        });
    }

    public PeopleFlowService getService(final String type){
        return peopleFlowServiceMap.get(type);
    }

}
