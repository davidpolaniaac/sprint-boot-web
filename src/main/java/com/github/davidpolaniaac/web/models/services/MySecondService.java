package com.github.davidpolaniaac.web.models.services;

import org.springframework.stereotype.Service;

@Service("MySecondService")
public class MySecondService implements IMyService {

	@Override
	public String operation() {
		return "My Second service";
	}
}
