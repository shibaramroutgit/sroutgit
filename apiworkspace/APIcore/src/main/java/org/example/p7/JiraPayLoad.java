package org.example.p7;

public class JiraPayLoad {

    public static String getSessionIDPayLoad()
    {
        return "{\n" +
                "    \"session\": {\n" +
                "        \"name\": \"JSESSIONID\",\n" +
                "        \"value\": \"14C86EFDF002FD0F79CA5EBAB70497D9\"\n" +
                "    },\n" +
                "    \"loginInfo\": {\n" +
                "        \"loginCount\": 4,\n" +
                "        \"previousLoginTime\": \"2023-12-10T11:28:48.827+0530\"\n" +
                "    }\n" +
                "}";
    }

    public static String getCreteIssuePayLoad()
    {
        return "{\n" +
                "    \"fields\":{\n" +
                "        \"project\":{\n" +
                "            \"key\":\"RES\"\n" +
                "        },\n" +
                "        \"summary\": \"Credit Card Issue 4\",\n" +
                "        \"description\": \"Creating by API from POSTMAN Issue 4\",\n" +
                "        \"issuetype\":{\n" +
                "            \"name\":\"Bug\"\n" +
                "        }\n" +
                "  }\n" +
                "}";
    }
}
