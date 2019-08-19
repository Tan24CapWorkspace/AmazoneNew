package com.cg.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="promocode")
public class Promocode {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer promocodeId;
	
	@Column(length=20)
	private String promocode;
	
	private Date startdate;
	
	private Date enddate;
	
	private Double amount;
	
	
	
	public Promocode() {
		// TODO Auto-generated constructor stub
	}

	

	public Promocode(String promocode, Date startdate, Date enddate, Double amount) {
		super();
		this.promocode = promocode;
		this.startdate = startdate;
		this.enddate = enddate;
		this.amount = amount;
	}



	public Date getStartdate() {
		return startdate;
	}



	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}



	public Date getEnddate() {
		return enddate;
	}



	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}



	public Double getAmount() {
		return amount;
	}



	public void setAmount(Double amount) {
		this.amount = amount;
	}



	public Integer getPromocodeId() {
		return promocodeId;
	}

	public void setPromocodeId(Integer promocodeId) {
		this.promocodeId = promocodeId;
	}

	public String getPromocode() {
		return promocode;
	}

	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	
	
}
