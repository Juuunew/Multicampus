package ch03;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(1592, "이순신");
       
        customerLee.bonusPoint = 100000;

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(595, "김유신");

        customerKim.bonusPoint = 2000000;
        
        System.out.println(customerKim.showCustomerInfo());
    }
}
