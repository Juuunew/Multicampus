package ch09;

public class Desktop extends Computer {

    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    // 재정의
    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
