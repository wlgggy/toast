package kr.hs.sdh.toast;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExampleService {

    public String[] getFruits() {
        return new String[]{"사과","바나나","멜론","수박"};
    }

    public void driveCar(Car car){
        car.go();
    }

    public void test(){
        KiaCar kiaCar = new KiaCar();
        HyundaiCar hyundaiCar = new HyundaiCar();

        driveCar(kiaCar);
        driveCar(hyundaiCar);
    }

    public Menu getMenu() {
        Menu subMenu1 = new Menu("서브메뉴1");
        Menu subMenu2 = new Menu("서브메뉴2");
        Menu subMenu3 = new Menu("서브메뉴3");
        Menu subMenu4 = new Menu("서브메뉴4");
        List<Menu> subMenus = new ArrayList<>();

        Menu rootMenu = new Menu("대메뉴");
        return rootMenu;
    }
}
