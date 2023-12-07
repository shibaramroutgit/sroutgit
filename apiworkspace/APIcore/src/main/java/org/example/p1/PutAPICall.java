package org.example.p1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.example.p3.Payload;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PutAPICall {
    public static void main(String[] args)
    {

        RestAssured.baseURI="https://rahulshettyacademy.com";
        String placeIdd = "5ad4819582177f83cd7b243313c81fef";

        given().queryParam("key","qaclick123").body(Payload.updatePayloadAdress(placeIdd))
                .when().put("/maps/api/place/update/json")
                .then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));







    }
}
