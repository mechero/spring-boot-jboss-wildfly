package com.thepracticaldeveloper.jbosswildflydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moises.macero
 */
@RestController
@RequestMapping("/hola")
public final class HolaController {

    @GetMapping
    public String dimeHola(){
        return "Hola Amigo!";
    }
}
