package com.sb.apigenerica.controller;

import com.sb.apigenerica.config.RestAssureConf;
import com.sb.apigenerica.dto.CoordinatorDTO;
import com.sb.apigenerica.dto.PeopleFlow;
import com.sb.apigenerica.dto.ProgrammerDTO;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PeopleControllerTest extends RestAssureConf {

    @Test
    void shouldReturnSuccessCoordinator() {
       given()
        .spec(specification)
        .body(createCoordinatorDTO())
        .when()
        .post("/")
        .then()
        .statusCode(200);
    }

    @Test
    void shouldReturnBadRequest() {
        final CoordinatorDTO coordinatorDTO = createCoordinatorDTO();
        coordinatorDTO.setLevel(0);

        given()
                .spec(specification)
                .body(coordinatorDTO)
                .when()
                .post("/")
                .then()
                .statusCode(400);
    }

    @Test
    void shouldReturnSuccessProgrammer() {
        given()
                .spec(specification)
                .body(createProgrammerDTO())
                .when()
                .post("/")
                .then()
                .statusCode(200);
    }

    @Test
    void shouldReturnSuccessProgrammeNullLanguage() {
        final ProgrammerDTO programmerDTO = createProgrammerDTO();
        programmerDTO.setLanguage(null);

        given()
                .spec(specification)
                .body(programmerDTO)
                .when()
                .post("/")
                .then()
                .statusCode(200);
    }

    private CoordinatorDTO createCoordinatorDTO(){
        CoordinatorDTO coordinatorDTO = new CoordinatorDTO();
        coordinatorDTO.setCilo("TI");
        coordinatorDTO.setName("João");
        coordinatorDTO.setLevel(1);
        coordinatorDTO.setTypeFlow(PeopleFlow.FLOW_COORDNATOR);

        return coordinatorDTO;
    }

    private ProgrammerDTO createProgrammerDTO(){
        ProgrammerDTO programmerDTO = new ProgrammerDTO();
        programmerDTO.setLanguage("Java");
        programmerDTO.setName("Paulo");
        programmerDTO.setRegistration("A2234I");
        programmerDTO.setTypeFlow(PeopleFlow.FLOW_PROGRAMMER);

        return programmerDTO;
    }

}