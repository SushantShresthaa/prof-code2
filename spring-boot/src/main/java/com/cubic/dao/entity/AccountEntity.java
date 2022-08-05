package com.cubic.dao.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="accounts")
public class AccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String accName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String accType;
	private String accCode;
	private String Description;
	
	@Temporal(TemporalType.DATE)
    private Date date;
	
	private String createdBy;
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public AccountEntity(int id, String accName, String accType, String accCode, String description, Date date,
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
	public AccountEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
