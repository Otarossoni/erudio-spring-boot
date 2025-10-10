package com.otaviorossoni.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestLogController {

    private Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/test")
    public String TestLog() {
        logger.debug("This is a debug log");
        logger.info("This is a info log");
        logger.warn("This is a warn log");
        logger.error("This is a error log");

        return "Logs generated successfully";
    }
}
