package streamoperation;

import java.util.ArrayList;
import java.util.List;

public class ClassTest1 {

    public static void main(String[] args) {
        List<String> userlist = new ArrayList<String>();
        userlist.add("Shibaram");
        userlist.add("Sanjay");
        userlist.add("Arabinda");
        userlist.add("Deepak");
        userlist.add("Dasarathi");
        userlist.add("Tapan");
        //userlist.stream().forEach(System.out::println);
        //userlist.stream().sorted().forEach(System.out::println);
        //userlist.stream().filter(item->item.startsWith("S")).forEach(System.out::println);
        //userlist.stream().map(item->item.toUpperCase()).forEach(System.out::println);
        //userlist.stream().map(allName->allName+"Friend").forEach(System.out::println);
        /*List<String> newList = userlist.stream().map(item->item.toUpperCase()).collect(Collectors.toList());
        System.out.println(newList);*/
        /*long l = userlist.stream().count();
        System.out.println(l);*/


    }
}


