package cn.tzit.clown.learn.hello;

import org.springframework.stereotype.Service;

/**
 * Created by fly on 2017/11/28.
 */
@Service
public class GreetingService {

    public String greet() {
        return "Hello World";
    }

}
