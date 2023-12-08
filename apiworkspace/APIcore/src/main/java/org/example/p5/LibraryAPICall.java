package org.example.p5;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class LibraryAPICall {
 // Case 1 Use Payload with default value
    /*@Test
    public void addBookA()
    {
        RestAssured.baseURI="http://216.10.245.166";
       String addBookResponse = given().header("Content-Type","application/json").body(BookPayload.addBookJSONA())
                .when().post("/Library/Addbook.php")
                .then().assertThat().statusCode(200).extract().response().asString();
        System.out.println(addBookResponse);
        JsonPath js = new JsonPath(addBookResponse);
        String bID1 = js.getString("ID");
        System.out.println(bID1);


    }*/


 // Case 2 User Parameterized to payload without DataProvider
    /*@Test
    public void addBookA()
    {
        RestAssured.baseURI="http://216.10.245.166";
       String addBookResponse = given().header("Content-Type","application/json").body(BookPayload.addBookJSONB("Learn API Automation with Python10","isbn10","110","DasarathiR"))
                .when().post("/Library/Addbook.php")
                .then().assertThat().statusCode(200).extract().response().asString();
        System.out.println(addBookResponse);
        JsonPath js = new JsonPath(addBookResponse);
        String bID1 = js.getString("ID");
        System.out.println(bID1);

    }*/

 // Case 2 User Parameterized to payload with DataProvider
    @Test(dataProvider ="CB", dataProviderClass = BookDataLoader.class)
    public void addBookB(String bname, String isbn, String aisle, String aname)
    {
        RestAssured.baseURI="http://216.10.245.166";
        String addBookResponse = given().header("Content-Type","application/json").body(BookPayload.addBookJSONB(bname,isbn,aisle, aname))
                .when().post("/Library/Addbook.php")
                .then().assertThat().statusCode(200).extract().response().asString();
        System.out.println(addBookResponse);
        JsonPath js = new JsonPath(addBookResponse);
        String bID1 = js.getString("ID");
        System.out.println(bID1);

    }


}
