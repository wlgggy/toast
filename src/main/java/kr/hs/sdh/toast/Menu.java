package kr.hs.sdh.toast;

import java.util.List;

public class Menu {

    private String name;

    private List<Menu> menuList;

    public Menu(String name) {
        this.name = name;

    }
    /** 이름, 서브메뉴를 받는 생성자 추가하기*/

    public Menu(String name, List<Menu> menuList) {
        this.name = name;
        this.menuList = menuList;
    }

}
