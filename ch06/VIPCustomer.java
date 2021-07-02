package ch06;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    /*public VIPCustomer() {
        // 생성자 호출기능, 생략가능!
        // super();

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer() call");
    }*/

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    // 재정의
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) price * salesRatio;

        return price;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
