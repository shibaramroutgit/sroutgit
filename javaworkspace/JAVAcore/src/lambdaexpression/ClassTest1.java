package lambdaexpression;

public class ClassTest1 {
    public static void main(String[] args) {
        GenerateFullName gn1 = new GenerateFullName() {
            @Override
            public String fullName(String fname, String lname) {
                return "Mr/Mrs"+"-"+fname +"-"+lname;
            }
        };
        System.out.println( gn1.fullName("Shibaram","Rout"));
    }
}
