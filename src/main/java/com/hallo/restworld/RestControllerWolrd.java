package com.hallo.restworld;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RequestMapping("/api")
@RestController
public class RestControllerWolrd {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String index() {
        ArrayList<RestControllerWolrd> list = new ArrayList<>();
        try {
            while (true) {
                list.add(new RestControllerWolrd());
            }
        } catch (OutOfMemoryError e) {
            System.err.println("Heap out of memory error occurred.");
        }
        return "OK";
    }

    @RequestMapping(value = "ok", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String go() {
    
        return "OK";
    }

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String cumi2() {
    System.out.println("a");
    System.out.println("a");
    return "OKcumi1";
    }

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String index1() {
        return "OK";
    }
}

