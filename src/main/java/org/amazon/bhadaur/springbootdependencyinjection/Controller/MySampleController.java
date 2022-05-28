package org.amazon.bhadaur.springbootdependencyinjection.Controller;
import org.springframework.stereotype.Controller;

@Controller
public class MySampleController {

    public String sayHello(){
        System.out.println("Hello");
        return "I said hello";
    }
}
