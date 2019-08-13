package com.cg.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer couponid;
	
	@Column(nullable=false)
	private Date startDate;
	
	@Column(nullable=false)
	private Date endDate;
	
	@Column(length=50,nullable=false)
	private String couponName;
	
	@Column(nullable=true)
	private Integer userid;
	
	@Column(nullable=false)
	private Double discount;

	public Coupon(Date startDate, Date endDate, String couponName, Integer userid, Double discount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.couponName = couponName;
		this.userid = userid;
		this.discount = discount;
	}

	public Integer getCouponid() {
		return couponid;
	}

	public void setCouponid(Integer couponid) {
		this.couponid = couponid;
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

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Coupon [couponid=" + couponid + ", startDate=" + startDate + ", endDate=" + endDate + ", couponName="
				+ couponName + ", userid=" + userid + ", discount=" + discount + "]";
	}
	
	
}
