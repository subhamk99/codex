package com.codex.lab.service;

import com.codex.lab.dto.request.CodeExecutionRequest;
import com.codex.lab.dto.response.CodeExecutionResponse;
import lombok.extern.slf4j.Slf4j;
import org.python.util.PythonInterpreter;
import org.springframework.stereotype.Component;

import java.io.*;


@Slf4j
@Component
public class PythonExecutorImpl implements CodeExecutor {

	private final PythonInterpreter interpreter;

	public PythonExecutorImpl(PythonInterpreter interpreter) {
		this.interpreter = interpreter;
	}

	@Override
	public CodeExecutionResponse executeCode(CodeExecutionRequest executionRequest) {
		StringWriter stringWriter = new StringWriter();

		interpreter.setOut(stringWriter);
		interpreter.exec(executionRequest.getCodeContent());
		interpreter.close();

		return CodeExecutionResponse
				.builder()
				.codeContent(executionRequest.getCodeContent())
				.codeOutput(stringWriter.toString())
				.language(1).build();
	}
}
