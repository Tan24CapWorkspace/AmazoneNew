package com.cg.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer userId;
	
	@ElementCollection
	private List<Integer> productId;
	
	@Column
	private Integer quantity;
	
	@Column
	private Double amount;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<Integer> getProductId() {
		return productId;
	}
	public void setProductId(List<Integer> productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(List<Integer> productId, Integer quantity, Double amount) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.amount = amount;
	}
	
	
	

}
