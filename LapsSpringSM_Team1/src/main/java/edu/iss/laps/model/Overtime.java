package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the overtime database table.
 * 
 */
@Entity
@NamedQuery(name="Overtime.findAll", query="SELECT o FROM Overtime o")
public class Overtime implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OvertimePK id;

	@Column(name="approvercomment_ote")
	private String approvercommentOte;

	@Column(name="approverid_ote")
	private int approveridOte;

	@Column(name="desc_ote")
	private String descOte;

	@Column(name="numhours_ote")
	private double numhoursOte;

	@Column(name="overtimestatus_ote")
	private String overtimestatusOte;

	@Column(name="projectname_ote")
	private String projectnameOte;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="uid_ote")
	private User user;

	public Overtime() {
	}

	public OvertimePK getId() {
		return this.id;
	}

	public void setId(OvertimePK id) {
		this.id = id;
	}

	public String getApprovercommentOte() {
		return this.approvercommentOte;
	}

	public void setApprovercommentOte(String approvercommentOte) {
		this.approvercommentOte = approvercommentOte;
	}

	public int getApproveridOte() {
		return this.approveridOte;
	}

	public void setApproveridOte(int approveridOte) {
		this.approveridOte = approveridOte;
	}

	public String getDescOte() {
		return this.descOte;
	}

	public void setDescOte(String descOte) {
		this.descOte = descOte;
	}

	public double getNumhoursOte() {
		return this.numhoursOte;
	}

	public void setNumhoursOte(double numhoursOte) {
		this.numhoursOte = numhoursOte;
	}

	public String getOvertimestatusOte() {
		return this.overtimestatusOte;
	}

	public void setOvertimestatusOte(String overtimestatusOte) {
		this.overtimestatusOte = overtimestatusOte;
	}

	public String getProjectnameOte() {
		return this.projectnameOte;
	}

	public void setProjectnameOte(String projectnameOte) {
		this.projectnameOte = projectnameOte;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}