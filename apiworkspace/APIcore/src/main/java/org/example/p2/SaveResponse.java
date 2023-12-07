package org.example.p2;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class SaveResponse {
    public static void main(String[] args)
    {

        RestAssured.baseURI="https://rahulshettyacademy.com";
        String addPlaceResponse = given().queryParam("key","qaclick123").body(PayLoad.addPlacePayLoad())
                .when().post("maps/api/place/add/json")
                .then().extract().response().asString();
        System.out.println(addPlaceResponse);
    }
}
