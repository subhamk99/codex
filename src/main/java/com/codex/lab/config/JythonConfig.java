package com.codex.lab.config;

import org.python.util.PythonInterpreter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

import static com.codex.lab.util.constants.ApplicationConstants.JYTHON_LIB_PATH;

@Configuration
public class JythonConfig {

	@Bean
	public PythonInterpreter interpreter(){
		//      Setup  Config properties for python interpreter
		Properties props = new Properties();
		props.put("python.home", JYTHON_LIB_PATH);
		props.put("python.console.encoding", "UTF-8");
		props.put("python.import.site", "false");
		Properties properties = System.getProperties();
		PythonInterpreter.initialize(properties, props, new String[0]);

		return new PythonInterpreter();
	}
}
