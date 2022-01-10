package com.github.davidpolaniaac.web.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Bill implements Serializable {

	private static final long serialVersionUID = -4213314574325037338L;

	@Value("${bill.description}")
	private String description;
	@Autowired
	private Client client;
	@Autowired
	@Qualifier("billItems")
	private List<BillItem> items;

	@PostConstruct
	public void init() {
		this.client.setName("Jhon post construct -- ");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy bill");
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<BillItem> getItems() {
		return items;
	}

	public void setItems(List<BillItem> items) {
		this.items = items;
	}

}
