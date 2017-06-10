package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the leaverecord database table.
 * 
 */
@Embeddable
public class LeaveRecordPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="leaveid_lrd")
	private int leaveidLrd;

	@Column(name="uid_lrd", insertable=false, updatable=false)
	private int uidLrd;

	@Temporal(TemporalType.DATE)
	@Column(name="fromdate_lrd")
	private java.util.Date fromdateLrd;

	public LeaveRecordPK() {
	}
	public int getLeaveidLrd() {
		return this.leaveidLrd;
	}
	public void setLeaveidLrd(int leaveidLrd) {
		this.leaveidLrd = leaveidLrd;
	}
	public int getUidLrd() {
		return this.uidLrd;
	}
	public void setUidLrd(int uidLrd) {
		this.uidLrd = uidLrd;
	}
	public java.util.Date getFromdateLrd() {
		return this.fromdateLrd;
	}
	public void setFromdateLrd(java.util.Date fromdateLrd) {
		this.fromdateLrd = fromdateLrd;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LeaveRecordPK)) {
			return false;
		}
		LeaveRecordPK castOther = (LeaveRecordPK)other;
		return 
			(this.leaveidLrd == castOther.leaveidLrd)
			&& (this.uidLrd == castOther.uidLrd)
			&& this.fromdateLrd.equals(castOther.fromdateLrd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.leaveidLrd;
		hash = hash * prime + this.uidLrd;
		hash = hash * prime + this.fromdateLrd.hashCode();
		
		return hash;
	}
}