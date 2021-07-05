package com.sb.apigenerica.controller;

import com.sb.apigenerica.dto.PeopleGeneticDTO;
import com.sb.apigenerica.locator.PeopleLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/")
public class PeopleController {

    @Autowired
    private PeopleLocator peopleLocator;


    @PostMapping
    public int createPeople(@Valid @RequestBody final PeopleGeneticDTO peopleGeneticDTO) {

        final int people = peopleLocator.getService(peopleGeneticDTO.getTypeFlow())
                .createPeople(peopleGeneticDTO);
        return people;
    }
}
