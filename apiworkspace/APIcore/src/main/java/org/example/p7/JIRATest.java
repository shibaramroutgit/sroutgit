package org.example.p7;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class JIRATest {

    public static String sessionID = null;
    public static String baseURI = RestAssured.baseURI="http://localhost:8080";
    public static String issueID = null;


    public static void getSessionID()
    {
        String responceval = given().header("Content-Type","application/json").body(JiraPayLoad.getSessionIDPayLoad())
                .when().post("/rest/auth/1/session")
                .then().assertThat().statusCode(200).extract().response().asString();
        JsonPath js = new JsonPath(responceval);
        sessionID = js.getString("value");
        System.out.println(sessionID);
    }
    @Test(priority = 1)
    public void createIssue()
    {
        String responseVal = given().log().all().header("Content-Type","application/json").header("Cookie","JSESSIONID=14C86EFDF002FD0F79CA5EBAB70497D9; atlassian.xsrf.token=BB9T-121J-9B5B-ZSZL_00b529b4b5c25f6dfaf74a1db8d94dc6741b783b_lin")
                .body(JiraPayLoad.getCreteIssuePayLoad())
                .when().post("/rest/api/2/issue")
                .then().log().all().assertThat().statusCode(201).extract().response().asString();
        JsonPath js = new JsonPath(responseVal);
        issueID = js.getString("id");
        System.out.println(issueID);

    }
}
