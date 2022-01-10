package com.github.davidpolaniaac.web.models.domain;

public class BillItem {

	private Product product;
	private Integer count;

	public BillItem(Product product, Integer count) {
		this.product = product;
		this.count = count;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer total() {
		return this.product.getPrice() * this.count;
	}

}
