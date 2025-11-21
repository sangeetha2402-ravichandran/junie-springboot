package com.junie.demo.controller;

import com.junie.demo.dto.JunieRequest;
import com.junie.demo.dto.JunieResponse;
import com.junie.demo.service.JunieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/junie")
@RequiredArgsConstructor
public class JunieController {

    private final JunieService junieService;

    @PostMapping("/ask")
    public JunieResponse askJunie(@RequestBody JunieRequest request) {
        String output = junieService.callJunie(request.getPrompt());
        JunieResponse response = new JunieResponse();
        response.setResult(output);
        return response;
    }
}
