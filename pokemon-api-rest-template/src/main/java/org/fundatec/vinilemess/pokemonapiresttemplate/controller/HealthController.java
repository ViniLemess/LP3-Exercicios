package org.fundatec.vinilemess.pokemonapiresttemplate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public ResponseEntity<String> healthChecker() {
        return ResponseEntity.ok("Hello, i am Pokemon API Rest Template");
    }
}
