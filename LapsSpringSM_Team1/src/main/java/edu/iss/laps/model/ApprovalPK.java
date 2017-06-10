package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the approval database table.
 * 
 */
@Embeddable
public class ApprovalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="approverid_apl", insertable=false, updatable=false)
	private int approveridApl;

	@Column(name="uid_apl")
	private int uidApl;

	public ApprovalPK() {
	}
	public int getApproveridApl() {
		return this.approveridApl;
	}
	public void setApproveridApl(int approveridApl) {
		this.approveridApl = approveridApl;
	}
	public int getUidApl() {
		return this.uidApl;
	}
	public void setUidApl(int uidApl) {
		this.uidApl = uidApl;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApprovalPK)) {
			return false;
		}
		ApprovalPK castOther = (ApprovalPK)other;
		return 
			(this.approveridApl == castOther.approveridApl)
			&& (this.uidApl == castOther.uidApl);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.approveridApl;
		hash = hash * prime + this.uidApl;
		
		return hash;
	}
}