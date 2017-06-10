package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the overtime database table.
 * 
 */
@Embeddable
public class OvertimePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ocid_ote")
	private int ocidOte;

	@Column(name="uid_ote", insertable=false, updatable=false)
	private int uidOte;

	@Temporal(TemporalType.DATE)
	@Column(name="date_ote")
	private java.util.Date dateOte;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fromtime_ote")
	private java.util.Date fromtimeOte;

	public OvertimePK() {
	}
	public int getOcidOte() {
		return this.ocidOte;
	}
	public void setOcidOte(int ocidOte) {
		this.ocidOte = ocidOte;
	}
	public int getUidOte() {
		return this.uidOte;
	}
	public void setUidOte(int uidOte) {
		this.uidOte = uidOte;
	}
	public java.util.Date getDateOte() {
		return this.dateOte;
	}
	public void setDateOte(java.util.Date dateOte) {
		this.dateOte = dateOte;
	}
	public java.util.Date getFromtimeOte() {
		return this.fromtimeOte;
	}
	public void setFromtimeOte(java.util.Date fromtimeOte) {
		this.fromtimeOte = fromtimeOte;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OvertimePK)) {
			return false;
		}
		OvertimePK castOther = (OvertimePK)other;
		return 
			(this.ocidOte == castOther.ocidOte)
			&& (this.uidOte == castOther.uidOte)
			&& this.dateOte.equals(castOther.dateOte)
			&& this.fromtimeOte.equals(castOther.fromtimeOte);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ocidOte;
		hash = hash * prime + this.uidOte;
		hash = hash * prime + this.dateOte.hashCode();
		hash = hash * prime + this.fromtimeOte.hashCode();
		
		return hash;
	}
}