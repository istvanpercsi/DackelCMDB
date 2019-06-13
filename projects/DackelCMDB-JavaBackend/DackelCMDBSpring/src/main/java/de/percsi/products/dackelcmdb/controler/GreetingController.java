package de.percsi.products.dackelcmdb.controler;

import de.percsi.products.dackelcmdb.model.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController{

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return  new Greeting(counter.incrementAndGet(), String.format(template,name));
    }

    @RequestMapping("/greeting2/{name}")
    public Greeting greeting2(@PathVariable(name = "name") String name) {
        return  new Greeting(counter.incrementAndGet(), String.format(template,name));
    }

}
