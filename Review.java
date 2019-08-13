package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {
	@Id
	private Integer productId;
	
	@Column
	private String review;
	
	@Column
	private Integer userId;
	
	@Column
	private Integer star;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public Review(Integer productId, String review, Integer userId, Integer star) {
		super();
		this.productId = productId;
		this.review = review;
		this.userId = userId;
		this.star = star;
	}

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
