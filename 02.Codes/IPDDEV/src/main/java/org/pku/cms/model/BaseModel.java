package org.pku.cms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String ID = "id";
	public static final String CREATED_TIME = "createdOn";
	public static final String LAST_MODIFIED_TIME = "lastModifidOn";
	public static final String TEMP_DELETED="tempDeleted";

	public BaseModel() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CL_ID")
	protected Long id;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name="CL_CREATED_ON")
	private Date createdOn;
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name="CL_LAST_MODIFIED_ON")
	private Date lastModifidOn;
	@Column(name="CL_TEMP_DELETED")
	private boolean tempDeleted = false;//false时有效；true时无效
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isTempDeleted() {
		return tempDeleted;
	}
	public boolean getTempDeleted() {
		return tempDeleted;
	}
	public void setTempDeleted(boolean tempDeleted) {
		this.tempDeleted = tempDeleted;
	}
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		if (id != null) {
			return id.equals(((BaseModel) that).id);
		}
		return super.equals(that);
	}

	@Override
	public int hashCode() {
		if (id != null) {
			return id.hashCode();
		}
		return super.hashCode();
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getLastModifidOn() {
		return lastModifidOn;
	}

	public void setLastModifidOn(Date lastModifidOn) {
		this.lastModifidOn = lastModifidOn;
	}


	

}