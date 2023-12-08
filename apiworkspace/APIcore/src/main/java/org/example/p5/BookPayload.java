package org.example.p5;

public class BookPayload {

    public static String addBookJSONA()
    {
        return "{\n" +
                "\"name\":\"Learn API Automation with Python6\"\",\n" +
                "\"isbn\":\"isbn6\",\n" +
                "\"aisle\":\"106\",\n" +
                "\"author\":\"DasarathiR\"\n" +
                "}";
    }

    public static String addBookJSONB(String bname, String isbn, String aisle, String aname)
    {
        return "{\n" +
                "\"name\":\""+bname+"\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\""+aname+"\"\n" +
                "}";
    }

}
