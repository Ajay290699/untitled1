package main;

import data.Customer;

public class CustomerImpl {
    public static void main(String[] args) {
        Customer object1 = new Customer();
        object1.name = "Ajay Chavan";
        object1.address = "Navi Mumbai";
        object1.email = "ajyc0939@gmail.com";
        object1.mobileNo = 8104919439L;
        object1.isPremium = true;

        Customer object2 = new Customer("Bipin Tayde", "Mumbai", "bipintayde@gmail.com",
                9773390780L, true);

        Customer object3 = new Customer();
        object3 = object1;
        object1 = object2;
        object2 = object3;

        object1.displayCustomer();
        object2.displayCustomer();


    }
}
