package com.codex.lab.controller;

import com.codex.lab.dto.request.CodeExecutionRequest;
import com.codex.lab.dto.response.CodeExecutionResponse;
import com.codex.lab.service.CodeExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/codex")
public class CodexController {

    @Autowired
    private CodeExecutor codeExecutor;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Test", HttpStatus.OK);
    }

    @PostMapping("/execute")
    public ResponseEntity<CodeExecutionResponse> executeCode(@RequestBody CodeExecutionRequest codeExecutionRequest) {

        CodeExecutionResponse codeExecutionResponse;
        try {
            codeExecutionResponse = codeExecutor.executeCode(codeExecutionRequest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ResponseEntity<>(codeExecutionResponse, HttpStatus.OK);
    }
}
