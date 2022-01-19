package com.mbspl.test.hibrenate;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractAvUsermaster entity provides the base persistence definition of the
 * AvUsermaster entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass

public abstract class AbstractAvUsermaster implements java.io.Serializable {

	// Fields

	private Long userid;
	private String username;
	private String password;
	private String usertype;
	private String isactive;
	private Long createdby;
	private Timestamp createdon;
	private Long modifiedby;
	private Timestamp modifiedon;
	private String storeid;
	private Integer otp;
	private Timestamp otptime;

	// Constructors

	/** default constructor */
	public AbstractAvUsermaster() {
	}

	/** minimal constructor */
	public AbstractAvUsermaster(Long userid) {
		this.userid = userid;
	}

	/** full constructor */
	public AbstractAvUsermaster(Long userid, String username, String password, String usertype, String isactive,
			Long createdby, Timestamp createdon, Long modifiedby, Timestamp modifiedon, String storeid, Integer otp,
			Timestamp otptime) {
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
		this.isactive = isactive;
		this.createdby = createdby;
		this.createdon = createdon;
		this.modifiedby = modifiedby;
		this.modifiedon = modifiedon;
		this.storeid = storeid;
		this.otp = otp;
		this.otptime = otptime;
	}

	// Property accessors
	@Id

	@Column(name = "USERID", unique = true, nullable = false)

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	@Column(name = "USERNAME", length = 50)

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 20)

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "USERTYPE", length = 1)

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@Column(name = "ISACTIVE", length = 1)

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Column(name = "CREATEDBY")

	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	@Column(name = "CREATEDON", length = 26)

	public Timestamp getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Timestamp createdon) {
		this.createdon = createdon;
	}

	@Column(name = "MODIFIEDBY")

	public Long getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(Long modifiedby) {
		this.modifiedby = modifiedby;
	}

	@Column(name = "MODIFIEDON", length = 26)

	public Timestamp getModifiedon() {
		return this.modifiedon;
	}

	public void setModifiedon(Timestamp modifiedon) {
		this.modifiedon = modifiedon;
	}

	@Column(name = "STOREID", length = 15)

	public String getStoreid() {
		return this.storeid;
	}

	public void setStoreid(String storeid) {
		this.storeid = storeid;
	}

	@Column(name = "OTP")

	public Integer getOtp() {
		return this.otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	@Column(name = "OTPTIME", length = 26)

	public Timestamp getOtptime() {
		return this.otptime;
	}

	public void setOtptime(Timestamp otptime) {
		this.otptime = otptime;
	}

}