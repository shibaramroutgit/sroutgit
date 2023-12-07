package org.example.p1;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class DeleteAPICall {
    public static void main(String [] args)
    {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        String placeIdd = "d926f8c92fa33c4df59f9b5ec5a3b33c";
        given().queryParam("key","qaclick123").body("{\n" +
                        "\n" +
                        "    \"place_id\":\""+placeIdd+"\"\n" +
                        "}")
                .when().delete("/maps/api/place/delete/json")
                .then().assertThat().statusCode(200);


    }
}
