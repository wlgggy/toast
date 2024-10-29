package kr.hs.sdh.toast;

import java.util.List;

public class Menu {

    private String name;

    private List<Menu> menus;

    private boolean isActive;

    public Menu(String name) {
        this.name = name;
    }

    public Menu(String name, Boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public Menu(String name, List<Menu> menus) {
        this.name = name;
        this.menus = menus;
    }

    public String getName() {
        return this.name;
    }

    public List<Menu> getMenus() {
        return this.menus;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

}
