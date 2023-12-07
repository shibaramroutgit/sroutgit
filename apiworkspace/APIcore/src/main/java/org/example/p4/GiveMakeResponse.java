package org.example.p4;


import io.restassured.path.json.JsonPath;

/**
 * Consider a response of an API is not developed  but its prototype (JSON format and element is ready)
 * 1. Print No of courses returned by API
 * 2. Print Purchase Amount
 * 3. Print Title of the first course
 * 4. Print All course titles and their respective Prices
 * 5. Print no of copies sold by RPA Course
 * 6. Verify if Sum of all Course prices matches with Purchase Amount
 */
public class GiveMakeResponse {


    public static JsonPath makeJSON()
    {
        String strJson = "{\n" +
                "\"dashboard\": {\n" +
                "\"purchaseAmount\": 910,\n" +
                "\"website\": \"rahulshettyacademy.com\"\n" +
                "},\n" +
                "\"courses\": [\n" +
                "{\n" +
                "\"title\": \"Selenium Python\",\n" +
                "\"price\": 50,\n" +
                "\"copies\": 6\n" +
                "},\n" +
                "{\n" +
                "\"title\": \"Cypress\",\n" +
                "\"price\": 40,\n" +
                "\"copies\": 4\n" +
                "},\n" +
                "{\n" +
                "\"title\": \"RPA\",\n" +
                "\"price\": 45,\n" +
                "\"copies\": 10\n" +
                "}\n" +
                "]\n" +
                "}";
        JsonPath jp = new JsonPath(strJson);
            return jp;

    }

}
