package com.codex.lab.service;

import com.codex.lab.dto.request.CodeExecutionRequest;
import com.codex.lab.dto.response.CodeExecutionResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface CodeExecutor {

    CodeExecutionResponse executeCode(CodeExecutionRequest codeExecutionRequest) throws IOException;
}
