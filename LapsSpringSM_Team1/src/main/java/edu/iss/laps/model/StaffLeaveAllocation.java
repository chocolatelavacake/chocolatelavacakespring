package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the staffleaveallocation database table.
 * 
 */
@Entity
@NamedQuery(name="StaffLeaveAllocation.findAll", query="SELECT s FROM StaffLeaveAllocation s")
public class StaffLeaveAllocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StaffLeaveAllocationPK id;

	@Column(name="numdays_sla")
	private double numdaysSla;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="uid_sla")
	private User user;

	public StaffLeaveAllocation() {
	}

	public StaffLeaveAllocationPK getId() {
		return this.id;
	}

	public void setId(StaffLeaveAllocationPK id) {
		this.id = id;
	}

	public double getNumdaysSla() {
		return this.numdaysSla;
	}

	public void setNumdaysSla(double numdaysSla) {
		this.numdaysSla = numdaysSla;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}