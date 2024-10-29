package kr.hs.sdh.toast;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public ExampleService(){

    }

    public String[] getFruits() {
        return new String[]{"사과","바나나","멜론","수박"};
    }
}
