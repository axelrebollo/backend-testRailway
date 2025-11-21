package com.testrailway.backendtestrailway.controller;

import com.testrailway.backendtestrailway.dto.CreateTextRequest;
import com.testrailway.backendtestrailway.domain.TextEntity;
import com.testrailway.backendtestrailway.service.TextService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/textos")
public class TextController {

    private final TextService service;

    public TextController(TextService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> createText(@Valid @RequestBody CreateTextRequest req) {
        TextEntity saved = service.saveText(req.getText());
        return ResponseEntity.status(201).body(saved);
    }

    @GetMapping
    public ResponseEntity<?> listAll() {
        return ResponseEntity.ok(service.listAll());
    }
}
