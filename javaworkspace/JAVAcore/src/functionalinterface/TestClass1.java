package functionalinterface;

public class TestClass1 {

    public static void main(String[] args)
    {
        IntAddition nb1 = new IntAddition() {
            @Override
            public int addInt(int a, int b) {
                return a+b;
            }
        };

        System.out.println(nb1.addInt(10,30));
    }
}
