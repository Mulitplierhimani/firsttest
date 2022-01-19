package com.mbspl.test.hibrenate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CmApprights entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "cm_apprights", catalog = "imp")
public class CmApprights extends AbstractCmApprights implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmApprights() {
	}

	/** minimal constructor */
	public CmApprights(CmApprightsId id) {
		super(id);
	}

	/** full constructor */
	public CmApprights(CmApprightsId id, String isactive, Integer createdby, Timestamp createdon, Integer modifiedby,
			Timestamp modifiedon) {
		super(id, isactive, createdby, createdon, modifiedby, modifiedon);
	}

}
