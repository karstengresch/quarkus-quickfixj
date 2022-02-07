package com.redhat.demo.qfj;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class SessionResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/sessions")
          .then()
             .statusCode(200)
             .body(is("[{\"sessionID\":{\"beginString\":\"FIX.4.4\",\"senderCompID\":\"TESTSEND\",\"senderSubID\":\"\",\"senderLocationID\":\"\",\"targetCompID\":\"TESTTARGET\",\"targetSubID\":\"\",\"targetLocationID\":\"\",\"sessionQualifier\":\"\",\"fixt\":false},\"loggedIn\":false},{\"sessionID\":{\"beginString\":\"FIX.4.4\",\"senderCompID\":\"TESTTARGET\",\"senderSubID\":\"\",\"senderLocationID\":\"\",\"targetCompID\":\"TESTSEND\",\"targetSubID\":\"\",\"targetLocationID\":\"\",\"sessionQualifier\":\"\",\"fixt\":false},\"loggedIn\":false}]"));
    }

}