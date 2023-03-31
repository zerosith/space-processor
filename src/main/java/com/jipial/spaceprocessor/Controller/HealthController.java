package com.jipial.spaceprocessor.Controller;

import com.jipial.spaceprocessor.common.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/health")
public class HealthController {


    private static final Logger LOGGER = LoggerFactory.getLogger(HealthController.class);

    @GetMapping
    public ResponseEntity<Object> getHealth() {
        LOGGER.info("HealthController#getHealth - Health endpoint");
        return new ResponseEntity<>(Constants.OK, HttpStatus.OK);
    }
}