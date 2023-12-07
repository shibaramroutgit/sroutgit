package org.example.p3;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.path.json.JsonPath;
import org.example.p3.Payload.*;

public class JsonPars {
    public static void main(String[] args)
    {

        RestAssured.baseURI="https://rahulshettyacademy.com";
        String addPlaceResponse = given().log().all().queryParam("key","qaclick123").body(Payload.addPlacePayLoad())
                .when().post("maps/api/place/add/json")
                .then().extract().response().asString();
        JsonPath js = new JsonPath(addPlaceResponse);
        String placeIdd= js.getString("place_id");
        System.out.println(js.getString("place_id"));

         given().queryParam("key","qaclick123").body(Payload.updatePayloadAdress(placeIdd))
                .when().put("/maps/api/place/update/json")
                .then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));

         given().queryParam("key","qaclick123").queryParam("place_id",placeIdd)
                 .when().get("/maps/api/place/get/json").then().assertThat().statusCode(200).body("address",equalTo("70 Summer walk, USA Odisha"));







    }
}
