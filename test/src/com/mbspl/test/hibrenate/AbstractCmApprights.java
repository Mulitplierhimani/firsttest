package com.mbspl.test.hibrenate;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;

/**
 * AbstractCmApprights entity provides the base persistence definition of the
 * CmApprights entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass

public abstract class AbstractCmApprights implements java.io.Serializable {

	// Fields

	private CmApprightsId id;
	private String isactive;
	private Integer createdby;
	private Timestamp createdon;
	private Integer modifiedby;
	private Timestamp modifiedon;

	// Constructors

	/** default constructor */
	public AbstractCmApprights() {
	}

	/** minimal constructor */
	public AbstractCmApprights(CmApprightsId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractCmApprights(CmApprightsId id, String isactive, Integer createdby, Timestamp createdon,
			Integer modifiedby, Timestamp modifiedon) {
		this.id = id;
		this.isactive = isactive;
		this.createdby = createdby;
		this.createdon = createdon;
		this.modifiedby = modifiedby;
		this.modifiedon = modifiedon;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "empid", column = @Column(name = "EMPID", nullable = false)),
			@AttributeOverride(name = "appid", column = @Column(name = "APPID", nullable = false)),
			@AttributeOverride(name = "branchid", column = @Column(name = "BRANCHID", nullable = false, length = 3)),
			@AttributeOverride(name = "rights", column = @Column(name = "RIGHTS", nullable = false, length = 2)) })

	public CmApprightsId getId() {
		return this.id;
	}

	public void setId(CmApprightsId id) {
		this.id = id;
	}

	@Column(name = "ISACTIVE", length = 1)

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Column(name = "CREATEDBY")

	public Integer getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Integer createdby) {
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

	public Integer getModifiedby() {
		return this.modifiedby;
	}

	public void setModifiedby(Integer modifiedby) {
		this.modifiedby = modifiedby;
	}

	@Column(name = "MODIFIEDON", length = 26)

	public Timestamp getModifiedon() {
		return this.modifiedon;
	}

	public void setModifiedon(Timestamp modifiedon) {
		this.modifiedon = modifiedon;
	}

}