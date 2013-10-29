package org.pku.cms.model.security;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.pku.cms.model.BaseModel;

/**
 * @author Rick
 *
 */

@Entity
@Table(name="T_USER")
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "user_id")) })
public class User extends BaseModel {

	private static final long serialVersionUID = 5017910406264184921L;
	@Column(name="CL_NAME")
	private String name;
	@Column(name="CL_USER_NAME")
	private String userName;
	@Column(name="CL_EMAIL")
	private String email;
	@Column (name="CL_PASSWORD")
	private String password;
	@Column(name="CL_LOGIN_STATUS")
	private String logInStatus;
	
	@Column(name="CL_lastSigned_IN_TIME")
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date lastSignedInTime;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogInStatus() {
		return logInStatus;
	}

	public void setLogInStatus(String logInStatus) {
		this.logInStatus = logInStatus;
	}

	public Date getLastSignedInTime() {
		return lastSignedInTime;
	}

	public void setLastSignedInTime(Date lastSignedInTime) {
		this.lastSignedInTime = lastSignedInTime;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
