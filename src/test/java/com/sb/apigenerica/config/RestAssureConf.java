package com.sb.apigenerica.config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestAssureConf {

    public static RequestSpecification specification;

    @LocalServerPort
    private int port;

    @BeforeAll
    void upClass() {
        RequestSpecBuilder specBuilder = new RequestSpecBuilder();
        specBuilder.setBaseUri("http://localhost/");
        specBuilder.setContentType(ContentType.JSON);
        specBuilder.setPort(port);

        specification = specBuilder.build();
    }
}
