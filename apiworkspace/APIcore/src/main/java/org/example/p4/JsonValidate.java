package org.example.p4;

import io.restassured.path.json.JsonPath;

import java.util.HashMap;
import java.util.Map;

public class JsonValidate {

    public static void main(String[] args) {

        JsonPath jv = GiveMakeResponse.makeJSON();
        //Print No of courses returned by API
        int count = jv.getInt("courses.size()");
        System.out.println(count);
        //Print Purchase Amount
        int price = jv.getInt("dashboard.purchaseAmount");
        System.out.println(price);
        //Print Title of the first course
        String course = jv.getString("courses[0].title");
        System.out.println(course);
        //Print All course titles and their respective Prices
        int totalSize = jv.getInt("courses.size()");
        Map<String,Integer> coursesList = new HashMap<String,Integer>();
        for (int i=0;i<totalSize;i++)
        {
            String cl = jv.getString("courses["+i+"].title");
            int ip = jv.getInt("courses["+i+"].price");
            coursesList.put(cl,ip);
        }
        for (Map.Entry<String,Integer> m:coursesList.entrySet()) {
            System.out.println("Course Name-"+m.getKey() +"-"+"Price Of Course"+ m.getValue());

        }
        //Print no of copies sold by RPA Course
        for (int j=0;j<totalSize;j++)
        {
            if(jv.getString("courses["+j+"].title").equalsIgnoreCase("RPA"))
            {
                int copiesNum = jv.getInt("courses["+j+"].copies");
                System.out.println(copiesNum);
            }
        }
        //Verify if Sum of all Course prices matches with Purchase Amount
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
        if(grandTotal==calTotal)
        {
            System.out.println("Both are Same"+grandTotal+"=="+calTotal);
        }

    }
}
