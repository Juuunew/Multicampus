package ch04;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(1592, "이순신");
        int price = customerLee.calcPrice(1000);
        customerLee.bonusPoint = 100000;

        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(595, "김유신");
        price = customerKim.calcPrice(1000);
        customerKim.bonusPoint = 2000000;

        System.out.println(customerKim.showCustomerInfo() + price);
    }
}
