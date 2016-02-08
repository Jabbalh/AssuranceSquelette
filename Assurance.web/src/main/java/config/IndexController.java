package config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nico on 21/01/2016.
 */
@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String restIndex(){
        return "Hello world";
    }

}
