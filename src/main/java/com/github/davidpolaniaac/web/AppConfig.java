package com.github.davidpolaniaac.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.github.davidpolaniaac.web.models.domain.BillItem;
import com.github.davidpolaniaac.web.models.domain.Product;
import com.github.davidpolaniaac.web.models.services.IMyService;
import com.github.davidpolaniaac.web.models.services.MySimpleService;

@Configuration
public class AppConfig {

	@Bean("MySimpleService")
	public IMyService registrySimpleRegistry() {
		return new MySimpleService();
	}

	@Bean("billItems")
	public List<BillItem> itemsRegistry() {

		Product product1 = new Product("item test 1", 100);
		Product product2 = new Product("item test 2", 200);

		BillItem item1 = new BillItem(product1, 3);
		BillItem item2 = new BillItem(product2, 4);

		return Arrays.asList(item1, item2);

	}

	@Bean("billItemsOffice")
	@Primary
	public List<BillItem> itemsOfficeRegistry() {

		Product product3 = new Product("item test 3", 500);
		Product product4 = new Product("item test 4", 200);

		BillItem item3 = new BillItem(product3, 3);
		BillItem item4 = new BillItem(product4, 4);

		return Arrays.asList(item3, item4);

	}
}
