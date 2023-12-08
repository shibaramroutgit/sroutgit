package org.example.p5;

import org.testng.annotations.DataProvider;

public class BookDataLoader {

    @DataProvider(name="CB")
    public Object[][] createBook()
    {
        Object[][] CBooks = new Object[3][4];
        CBooks[0][0] = "Learn API Automation with Python11";
        CBooks[0][1] = "isbn11";
        CBooks[0][2] = "111";
        CBooks[0][3] = "Sibani J";

        CBooks[1][0] = "Learn API Automation with Python12";
        CBooks[1][1] = "isbn12";
        CBooks[1][2] = "112";
        CBooks[1][3] = "Sibani J";

        CBooks[2][0] = "Learn API Automation with Python13";
        CBooks[2][1] = "isbn13";
        CBooks[2][2] = "113";
        CBooks[2][3] = "Sibani J";


        return CBooks;

        /*return new Object[][] {
                {"Learn API Automation with Python11","isbn11","111","Sibani J"},
                {"Learn API Automation with Python12","isbn12","112","Sibani J"},
                {"Learn API Automation with Python13","isbn13","113","Sibani J"}
        };*/
    }
}
