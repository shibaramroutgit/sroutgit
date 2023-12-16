package enumoperation;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Execution of AddressTypeA-------------");
        System.out.println(AddressTypeA.PERMANENTADDRESS);
        System.out.println(AddressTypeA.OFFICEADDRESS);
        System.out.println(AddressTypeA.PRESENTADDRESS);

        System.out.println("Execution of AddressTypeB--------------------");
        for (AddressTypeB b:AddressTypeB.values()) {
            System.out.println(b);

        }
        System.out.println("-------------------------------------");
        for (AddressTypeB b:AddressTypeB.values()) {
            System.out.println(b.getAdress());
        }
        System.out.println("-------------------------------------");
        AddressTypeB b1 = AddressTypeB.PRESENTADDRESS;
        System.out.println(b1.getAdress());


    }
}
