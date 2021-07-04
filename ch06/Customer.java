package ch06;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    double bonusPoint;
    double bonusRatio;

/*    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer() call");
    }*/

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + " 이고, 적립 보너스 포인트는 " + bonusPoint + " 점 입니다.";
    }
}