package org.example.p4;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class VeryFirstTestNGRun {
    JsonPath jv = GiveMakeResponse.makeJSON();
    int totalSize = jv.getInt("courses.size()");
    @Test
    public void TC1()
    {
        int grandTotal = jv.getInt("dashboard.purchaseAmount");
        int calTotal=0;
        Map<Integer,Integer> PriceX = new HashMap<Integer,Integer>();
        for (int i=0;i<totalSize;i++)
        {
            int cl = jv.getInt("courses["+i+"].copies");
            int ip = jv.getInt("courses["+i+"].price");
            PriceX.put(cl,ip);
        }
        for (Map.Entry<Integer,Integer> m:PriceX.entrySet()) {
            calTotal = calTotal+(m.getValue() * m.getKey());

            System.out.println(calTotal);

        }
        Assert.assertEquals(grandTotal,calTotal);
    }

}
