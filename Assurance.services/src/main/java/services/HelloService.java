package services;

import org.springframework.stereotype.Service;

/**
 * Created by Nico on 21/01/2016.
 */
@Service
public class HelloService {

    public String sayHello(){
        return "Ok -> Hello you";
    }
}
