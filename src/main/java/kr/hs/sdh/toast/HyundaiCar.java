package kr.hs.sdh.toast;

public class HyundaiCar implements Car {

    @Override
    public void go() {
        System.out.println("간다 Hyundai");
    }

    @Override
    public void back() {
        System.out.println("안간다 Hyundai");
    }
}
