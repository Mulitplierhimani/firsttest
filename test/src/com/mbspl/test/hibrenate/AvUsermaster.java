package com.mbspl.test.hibrenate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * AvUsermaster entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "av_usermaster", catalog = "imp")
public class AvUsermaster extends AbstractAvUsermaster implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AvUsermaster() {
	}

	/** minimal constructor */
	public AvUsermaster(Long userid) {
		super(userid);
	}

	/** full constructor */
	public AvUsermaster(Long userid, String username, String password, String usertype, String isactive, Long createdby,
			Timestamp createdon, Long modifiedby, Timestamp modifiedon, String storeid, Integer otp,
			Timestamp otptime) {
		super(userid, username, password, usertype, isactive, createdby, createdon, modifiedby, modifiedon, storeid,
				otp, otptime);
	}

}
