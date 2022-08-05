package com.cubic.controller;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class AccountDTO {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String accName;
	private String accType;
	private String accCode;
	private String Description;
	
	@Temporal(TemporalType.DATE)
    private Date date;
	
	private String createdBy;
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getAccCode() {
		return accCode;
	}
	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}


	public AccountDTO(int id, String accName, String accType, String accCode, String description, Date date,
			String createdBy) {
		super();
		this.id = id;
		this.accName = accName;
		this.accType = accType;
		this.accCode = accCode;
		Description = description;
		this.date = date;
		this.createdBy = createdBy;
	}
	public AccountDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
