package ch02;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer();

        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(1592);
        customerLee.bonusPoint = 100000;

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();

        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(595);
        customerKim.bonusPoint = 2000000;

        System.out.println(customerKim.showCustomerInfo());
    }
}
