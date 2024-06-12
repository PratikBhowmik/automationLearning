package qkarttests.Tests;
import org.apache.hc.core5.http.Method;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIValidation extends RestAssured {

    public void getr() {

        RequestSpecification request1 = RestAssured.given();
        request1.baseUri("baseURI");
        request1.basePath("basePath");
        Response resp = request1.get();
        System.out.println(resp.asPrettyString());

        

        // Response resp = http.request(Method.GET);

    }

    public void postr() {
        RestAssured.given().baseUri("baseURI").contentType(DEFAULT_BODY_ROOT_PATH).body(DEFAULT_AUTH);
    }

}
