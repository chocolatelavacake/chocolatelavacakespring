package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the staffleaveallocation database table.
 * 
 */
@Embeddable
public class StaffLeaveAllocationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="uid_sla", insertable=false, updatable=false)
	private int uidSla;

	@Column(name="leavecategory_sla")
	private String leavecategorySla;

	@Temporal(TemporalType.DATE)
	@Column(name="year_sla")
	private java.util.Date yearSla;

	public StaffLeaveAllocationPK() {
	}
	public int getUidSla() {
		return this.uidSla;
	}
	public void setUidSla(int uidSla) {
		this.uidSla = uidSla;
	}
	public String getLeavecategorySla() {
		return this.leavecategorySla;
	}
	public void setLeavecategorySla(String leavecategorySla) {
		this.leavecategorySla = leavecategorySla;
	}
	public java.util.Date getYearSla() {
		return this.yearSla;
	}
	public void setYearSla(java.util.Date yearSla) {
		this.yearSla = yearSla;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StaffLeaveAllocationPK)) {
			return false;
		}
		StaffLeaveAllocationPK castOther = (StaffLeaveAllocationPK)other;
		return 
			(this.uidSla == castOther.uidSla)
			&& this.leavecategorySla.equals(castOther.leavecategorySla)
			&& this.yearSla.equals(castOther.yearSla);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.uidSla;
		hash = hash * prime + this.leavecategorySla.hashCode();
		hash = hash * prime + this.yearSla.hashCode();
		
		return hash;
	}
}