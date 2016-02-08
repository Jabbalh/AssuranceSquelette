package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import services.IHelloService;

/**
 * Created by Nico on 21/01/2016.
 */
@Controller
public class WelcomeController {

    @Autowired
    private IHelloService helloService;

    @RequestMapping("/welcome")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("/index");
        model.addObject("message",this.helloService.sayHello());
        return model;
    }

}
