package org.example.p6;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonFileProcess {

    @Test
    public void TC1() throws IOException {
        RestAssured.baseURI="http://216.10.245.166";
        String strResponse = given().header("Content-Type","application/json").body(Files.readAllBytes(Paths.get("src\\main\\java\\org\\example\\p6\\bookadd.json")))
                .when().put("/Library/Addbook.php")
                .then().assertThat().statusCode(200).extract().response().asString();
        JsonPath js = new JsonPath(strResponse);
        System.out.println(js.getString("ID"));

    }
}
