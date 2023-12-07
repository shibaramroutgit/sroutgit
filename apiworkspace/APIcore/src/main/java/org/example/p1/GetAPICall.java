package org.example.p1;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class GetAPICall {
    public static void main(String [] args)
    {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        String placeIdd = "5ad4819582177f83cd7b243313c81fef";
        given().queryParam("key","qaclick123").queryParam("place_id",placeIdd)
                .when().get("/maps/api/place/get/json")
                .then().assertThat().statusCode(200);


    }
}
