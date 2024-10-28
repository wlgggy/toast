package kr.hs.sdh.toast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ExampleController {

    private final ExampleService exampleService; // 필드

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
        String[] fruits = new String[]{"사과","바나나","멜론","수박"}; // 데이터 베이스에서 가져올거임
        
        modelAndView.addObject("fruits", fruits);

        return modelAndView;
    }

}
new