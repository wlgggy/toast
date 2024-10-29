package kr.hs.sdh.toast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class ExampleController {

    private final ExampleService exampleService;
    private final MenuService menuService;

    public ExampleController(ExampleService exampleService, MenuService menuService) {
        this.exampleService = exampleService;
        this.menuService = menuService;
    } // 생성자 class이름과 동일
    
    @GetMapping("/profile")
    public String myprofile(){
        return "profile";
    }

    @GetMapping("/list")
    public ModelAndView myList() {
        ModelAndView modelAndView = new ModelAndView("list");
        String[] fruits = exampleService.getFruits();

        modelAndView.addObject("fruits", fruits);

        return modelAndView;
    }

    @GetMapping("/menus")
    public ModelAndView menus() {
        ModelAndView modelAndView = new ModelAndView("menus");
        Menu rootMenu = exampleService.getMenu();

        modelAndView.addObject("parentMenu", rootMenu);

        return modelAndView;
    }

    @GetMapping("/multi-menus")
    public ModelAndView multiMenus() {
        ModelAndView modelAndView = new ModelAndView("multi-menus");
        List<Menu> rootMenu = menuService.getRootMenus();

        modelAndView.addObject("parentMenu", rootMenu);

        return modelAndView;
    }
}