package com.mbspl.test.hibrenate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CmApprightsId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class CmApprightsId implements java.io.Serializable {

	// Fields

	private Integer empid;
	private Short appid;
	private String branchid;
	private String rights;

	// Constructors

	/** default constructor */
	public CmApprightsId() {
	}

	/** full constructor */
	public CmApprightsId(Integer empid, Short appid, String branchid, String rights) {
		this.empid = empid;
		this.appid = appid;
		this.branchid = branchid;
		this.rights = rights;
	}

	// Property accessors

	@Column(name = "EMPID", nullable = false)

	public Integer getEmpid() {
		return this.empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	@Column(name = "APPID", nullable = false)

	public Short getAppid() {
		return this.appid;
	}

	public void setAppid(Short appid) {
		this.appid = appid;
	}

	@Column(name = "BRANCHID", nullable = false, length = 3)

	public String getBranchid() {
		return this.branchid;
	}

	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}

	@Column(name = "RIGHTS", nullable = false, length = 2)

	public String getRights() {
		return this.rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CmApprightsId))
			return false;
		CmApprightsId castOther = (CmApprightsId) other;

		return ((this.getEmpid() == castOther.getEmpid()) || (this.getEmpid() != null && castOther.getEmpid() != null
				&& this.getEmpid().equals(castOther.getEmpid())))
				&& ((this.getAppid() == castOther.getAppid()) || (this.getAppid() != null
						&& castOther.getAppid() != null && this.getAppid().equals(castOther.getAppid())))
				&& ((this.getBranchid() == castOther.getBranchid()) || (this.getBranchid() != null
						&& castOther.getBranchid() != null && this.getBranchid().equals(castOther.getBranchid())))
				&& ((this.getRights() == castOther.getRights()) || (this.getRights() != null
						&& castOther.getRights() != null && this.getRights().equals(castOther.getRights())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEmpid() == null ? 0 : this.getEmpid().hashCode());
		result = 37 * result + (getAppid() == null ? 0 : this.getAppid().hashCode());
		result = 37 * result + (getBranchid() == null ? 0 : this.getBranchid().hashCode());
		result = 37 * result + (getRights() == null ? 0 : this.getRights().hashCode());
		return result;
	}

}