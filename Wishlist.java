package com.cg.bean;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="wishlist")
public class Wishlist {
	@Id
	private Integer productId;
	
	@Column
	private Integer userId;
	
	@Column
	private String name;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wishlist(Integer productId, Integer userId, String name) {
		super();
		this.productId = productId;
		this.userId = userId;
		this.name = name;
	}

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
