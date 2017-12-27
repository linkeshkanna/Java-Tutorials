package com.example.user;

import java.io.Serializable;
import java.util.Date;

public class JJJ implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int companyId;
	private String code;
	private String description;
	private int active;
	private String createdBy;
	private Date createdDate;
	private String lastModifiedBy;
	private Date lastModifiedDate;
	
	
	public JJJ() {
		
	}
	
	/*public JJJ(int companyId, String code, String description,
			int active, String createdBy, Date createdDate, String lastModifiedBy, Date lastModifiedDate) {
		this.companyId = companyId;
		this.code = code;
		this.description = description;
		this.active = active;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
	}*/
	
	public int getcompanyId() {
		return this.companyId;
	}
	
	public void setcompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	public String getcode() {
		return this.code;
	}
	
	public void setcode(String code) {
		this.code = code;
	}
	
	public String getdescription() {
		return this.description;
	}
	
	public void setdescription(String description) {
		this.description = description;
	}
	
	public int getactive() {
		return this.active;
	}
	
	public void setactive(int active) {
		this.active = active;
	}
	
	public String getcreatedBy() {
		return this.createdBy;
	}
	
	public void setcreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public Date getcreatedDate() {
		return this.createdDate;
	}
	
	public void setcreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getlastModifiedBy() {
		return this.lastModifiedBy;
	}
	
	public void setlastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
	public Date getlastModifiedDate() {
		return this.lastModifiedDate;
	}
	
	public void setlastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
