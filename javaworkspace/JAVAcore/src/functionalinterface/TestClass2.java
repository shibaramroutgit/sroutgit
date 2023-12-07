package functionalinterface;

public class TestClass2 {

    public static void main(String[] args) {
        GenericAddition<String> addString = new GenericAddition<String>() {
            @Override
            public String add(String a, String b) {
                return a+" "+b;
            }
        };
        System.out.println( addString.add("Shibaram", "Rout"));

        GenericAddition<Integer> addInt = new GenericAddition<Integer>() {
            @Override
            public Integer add(Integer a, Integer b) {
                return a+b;
            }
        };
        System.out.println( addInt.add(10,50));
    }
}
