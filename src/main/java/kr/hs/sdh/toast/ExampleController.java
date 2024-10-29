package kr.hs.sdh.toast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
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

        modelAndView.addObject("menus", exampleService.getMenu());

        return modelAndView;
    }
}