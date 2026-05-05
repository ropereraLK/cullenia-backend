package com.cullenia_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("api/health")
    public ResponseEntity<String> getHealth() {
        return ResponseEntity.ok("Service up and running");
    }

    @GetMapping("api/error")
    public ResponseEntity<String> getError() throws Exception {
        throw new Exception("Error Simulation");
    }

    @GetMapping("api/runtimeerror")
    public ResponseEntity<String> getRunTimeError() throws Exception {
        throw new RuntimeException("Run time Error Simulation");
    }
}
