package com.easybytes.easyStore.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/logging")
public class LoggingController {

    private static final Logger log = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping
    public ResponseEntity<String> testLogging(){
        log.trace("Trace : detailed");
        log.debug("debug : detailed");
        log.info("info : detailed");
        log.warn("warn : detailed");
        log.error("error : detailed");

        return ResponseEntity.ok().body("Logging tested Successfully");
    }
}
