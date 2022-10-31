package org.eblood.marketdata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DummyController {
    @RequestMapping("/")
    public String hello()
    {
        return "Hello javaTpoint  ";
    }

}
