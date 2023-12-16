package enumoperation;

public enum AddressTypeB {
    PRESENTADDRESS("Banagalore Karnataka"),
    PERMANENTADDRESS("Berhampur Odish"),
    OFFICEADDRESS("WhiteFiled Karnataka");

    private String Adress;
    AddressTypeB(String adress)
    {
        this.Adress=adress;
    }

    public String getAdress() {
        return Adress;
    }
}
