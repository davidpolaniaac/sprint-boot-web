package com.github.davidpolaniaac.web.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MyService implements IMyService {

	@Override
	public String operation() {
		return "My service";
	}
}
