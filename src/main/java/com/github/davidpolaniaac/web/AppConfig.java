package com.github.davidpolaniaac.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.davidpolaniaac.web.services.IMyService;
import com.github.davidpolaniaac.web.services.MySimpleService;

@Configuration
public class AppConfig {

	@Bean("MySimpleService")
	public IMyService registrySimpleRegistry() {
		return new MySimpleService();
	}
}
