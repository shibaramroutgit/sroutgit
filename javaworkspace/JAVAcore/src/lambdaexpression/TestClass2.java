package lambdaexpression;

public class TestClass2 {
    public static void main(String[] args) {
        GenerateFullName name = (String f, String l)->{
            return  f+"-"+f;
        };
        System.out.println(name.fullName("Deepak","Das"));

    }
}
