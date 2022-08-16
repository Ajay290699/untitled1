package data;

public class Customer {
    public String name;
    public String address;
    public String email;
    public Long mobileNo;
    public boolean isPremium;

    public Customer() {
        name = "Ajay Chavan";
        address = "Navi Mumbai";
        String email = "ajayc9838@gmail.com";
        mobileNo = 7045308274l;
        isPremium = true;

    }


    public Customer(String name, String address, String email, Long mobileNo, boolean isPremium) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.mobileNo = mobileNo;
        this.isPremium = isPremium;
    }

    public void displayCustomer() {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("email = " + email);
        System.out.println("mobileNo = " + mobileNo);
        System.out.println("isPremium = " + isPremium);
    }
}
