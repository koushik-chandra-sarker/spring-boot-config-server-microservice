package com.example.clientservice1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * File: GreetingController
 * Author: Koushik Chandra Sarker
 * Date: 6/1/24 (DD/MM/YYYY)
 * Description: .
 * History:
 * - 6/1/24: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */

@RestController
@RequestMapping("service1")
public class GreetingController {

    @Value("${custom.greeting}")
    private String greeting;

    @Value("${custom.message}")
    private String message;
    @Value("${custom.message_local}")
    private String message_local;

    @Value("${m1}")
    private String m1;
    @Value("${m2}")
    private String m2;

    @Value("${m3}")
    private String m3;
    @Value("${m5}")
    private String m4;


    @GetMapping("")
    public String greeting() {
        return greeting + " <br> " + message + " <br> " +
                message_local + " <br> " + m1 + " <br> " +
                m2 + " <br> " + m3 + " <br> " + m4 + " <br>";
    }
}
