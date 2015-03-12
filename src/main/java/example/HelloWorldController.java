package example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Adrian Seungjin Lee on 2015. 2. 10.
 * Contacts : sweetest.sj@navercorp.com
 */

/**
 * Dalrae Jin
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/")
    public void test(){
    	System.out.println("sjlee");
    	System.out.println("drjin");
    }
    @RequestMapping("/hello")
    public ModelAndView helloWorld(){
        System.out.println("hey");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("message","Hello World");
        return mv;
    }
}
