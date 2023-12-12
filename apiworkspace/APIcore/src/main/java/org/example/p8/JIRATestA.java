package org.example.p8;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import org.example.p7.JiraPayLoad;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class JIRATestA {

    public static SessionFilter sobj = new SessionFilter();
    public static String baseURI = RestAssured.baseURI="http://localhost:8080";
    public static String issueID = null;


    public static void getSessionID()
    {
        String responceval = given().header("Content-Type","application/json").body(JiraPayLoad.getSessionIDPayLoad())
                .filter(sobj).when().post("/rest/auth/1/session")
                .then().assertThat().statusCode(200).extract().response().asString();
    }
    @Test(priority = 1)
    public void createIssue()
    {
        String responseVal = given().log().all().header("Content-Type","application/json")
                .body(JiraPayLoad.getCreteIssuePayLoad())
                .filter(sobj).when().post("/rest/api/2/issue")
                .then().log().all().assertThat().statusCode(201).extract().response().asString();
        JsonPath js = new JsonPath(responseVal);
        issueID = js.getString("id");
        System.out.println(issueID);

    }
}
