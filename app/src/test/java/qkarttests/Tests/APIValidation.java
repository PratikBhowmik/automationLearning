package qkarttests.Tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIValidation extends RestAssured {

    public void getr() {
        Response resp = get("");
        resp.then().statusCode(200);
    }

    public void postr() {
        RestAssured.given().baseUri("baseURI").contentType(DEFAULT_BODY_ROOT_PATH).body(DEFAULT_AUTH);
    }
    
}
