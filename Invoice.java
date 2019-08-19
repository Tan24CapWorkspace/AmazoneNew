package com.cg.bean;

import java.sql.Date;

import java.util.List;



import javax.persistence.Column;

import javax.persistence.ElementCollection;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Table(name="invoice")

public class Invoice {

 @Id

 @Column(name="invoiceid")

 @GeneratedValue(strategy=GenerationType.SEQUENCE)

 private Integer invoiceId;



 private Integer userid;



 private String firstname;



 private String lastname;



 private Long mobileno;



 private String emailid;



 @ElementCollection

 private List<Integer[]> product;



 private Double total;



 private Date dateofpurchanse;



 public Integer getInvoiceId() {

 return invoiceId;

 }



 public void setInvoiceId(Integer invoiceId) {

 this.invoiceId = invoiceId;

 }



 public Integer getUserid() {

 return userid;

 }



 public void setUserid(Integer userid) {

 this.userid = userid;

 }



 public String getFirstname() {

 return firstname;

 }



 public void setFirstname(String firstname) {

 this.firstname = firstname;

 }



 public String getLastname() {

 return lastname;

 }



 public void setLastname(String lastname) {

 this.lastname = lastname;

 }



 public Long getMobileno() {

 return mobileno;

 }



 public void setMobileno(Long mobileno) {

 this.mobileno = mobileno;

 }



 public String getEmailid() {

 return emailid;

 }



 public void setEmailid(String emailid) {

 this.emailid = emailid;

 }



 public List<Integer[]> getProduct() {

 return product;

 }



 public void setProduct(List<Integer[]> product) {

 this.product = product;

 }



 public Double getTotal() {

 return total;

 }



 public void setTotal(Double total) {

 this.total = total;

 }



 public Date getDateofpurchanse() {

 return dateofpurchanse;

 }



 public void setDateofpurchanse(Date dateofpurchanse) {

 this.dateofpurchanse = dateofpurchanse;

 }



 public Invoice( Integer userid, String firstname, String lastname, Long mobileno, String emailid,

  List<Integer[]> product, Double total, Date dateofpurchanse) {

 super();

 this.userid = userid;

 this.firstname = firstname;

 this.lastname = lastname;

 this.mobileno = mobileno;

 this.emailid = emailid;

 this.product = product;

 this.total = total;

 this.dateofpurchanse = dateofpurchanse;

 }



 public Invoice() {

 super();

 // TODO Auto-generated constructor stub

 }



 @Override

 public String toString() {

 return "Invoice [invoiceId=" + invoiceId + ", userid=" + userid + ", firstname=" + firstname + ", lastname="

  + lastname + ", mobileno=" + mobileno + ", emailid=" + emailid + ", product=" + product + ", total="

  + total + ", dateofpurchanse=" + dateofpurchanse + "]";

 }





 }



