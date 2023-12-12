package org.example;

public class info {
    /**
     * import io.restassured.RestAssured;
     * import static io.restassured.RestAssured.*;
     * import io.restassured.path.json.JsonPath;
     * import io.restassured.Filter.session.SessionFilter;
     */

    /**
     * Static Methods
     * Given() is used to set tup the request
     * When() is used to call teh request type (POST,GET,PUT) with passing end point
     * Then() is used to validate teh response
     *
     */

    /**
     * Query Parameter
     * anything starts after ? is considered as query parameter. it is a key value pairs . it's passing on URL on request
     * Header keeps Test Type, Browser Type, Session or auth id , cookies
     */

    /**
     * Path Parameter is used to pass value to pass information or data to request
     * Path parameter are passes using {name} on URI, so that it check any path parameter created on request with key then it replace wit the value
     * Given().pathParam("Key", "1010").body(body String).when().post("/rest/api/2/issue/{Key}/comment).Then().AssertThat().StatucCode(200).
     */

    /**
     * SessionFilter CLass
     * SessionFilter sessionObj = new SessionFilter()
     * this class is used to keep the session id, and we can use the session id using filter(sessionObj)
     * filter method used before When() and at end of Given() method
     *
     */

    /**
     * Attachment on REST Assured
     * multiPart("Key", "Value") and it is part of Given()
     * multiPart("fileName",new File("File Path")
     * at header we need to pass header("content-Type","multipart/format-data")
     * Given().header("content-Type","multipart/format-data").multiPart("fileName",new File("src/file/test.txt")")
     */

    /**
     * We can pass JSON File as a body
     * given().body(Files.readAllBytes(Paths.get("src\\main\\java\\org\\example\\p6\\bookadd.json"))
     *
     */

    /**
     * relaxHTTPSValidation()
     * It is part of given method and add immediate after given()
     * It is used to bypass if any HTTPS certification expire or fail
     */

    /**
     * OAuth 2.0
     * Grand Type - Authorized Code & Client Credential
     * Scope - What info client wants from server (Book My Show Can log in by Gmail)
     * auth_url- The server on which client identify verify (Client is Book MY Show at Server of Google)
     * client_id - Unique id given by server when a client register into it (Book My Show Register)
     * response_type - user / who want to use book my show, after successfully login into gmail a code send to Book MY Show
     * state - random character to add extra validation
     * client_secret - it is a code give by server to identify the  Boomy SHow
     * Step1 Generate Client Code Step 2 Using Client Code generate Access Token
     *
     */

    /**
     * urlEncodeingEnable(false)
     * it is part of given() method and if we do so than at processioning special char not changed
     */

    /**
     * POJO dependency
     * Jackson-databind
     * Jackson-annotation
     * Jackson-core
     * Note: all jackson dependency should in save version
     * Gson
     * JSON to POJO OBJECT - Deserialize
     * POJO Object to JSON - Serialize
     */

    /**
     * RequestSpecBuilder
     * ResponseSpecBuilder
     * RequestSpecification obj =
     * ResponseSpecification
     */

}
