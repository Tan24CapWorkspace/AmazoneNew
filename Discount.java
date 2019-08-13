package com.cg.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="discount")
public class Discount {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer discountId;
	
	@Column
	private Integer productId;
	
	@Column
	private Integer discount;
	
	@Column
	private Date startDate;
	
	@Column
	private Date endDate;

	public Integer getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Discount(Integer productId, Integer discount, Date startDate, Date endDate) {
		super();
		this.productId = productId;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
