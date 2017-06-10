package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the leaverecord database table.
 * 
 */
@Entity
@NamedQuery(name="LeaveRecord.findAll", query="SELECT l FROM LeaveRecord l")
public class LeaveRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LeaveRecordPK id;

	@Column(name="approvercomment_lrd")
	private String approvercommentLrd;

	@Column(name="approverid_lrd")
	private int approveridLrd;

	@Column(name="contactdetails_lrd")
	private String contactdetailsLrd;

	@Column(name="desc_lrd")
	private String descLrd;

	@Column(name="leavecategory_lrd")
	private String leavecategoryLrd;

	@Column(name="leavestatus_lrd")
	private String leavestatusLrd;

	@Column(name="numdays_lrd")
	private double numdaysLrd;

	@Column(name="overseas_lrd")
	private String overseasLrd;

	@Column(name="timeofday_lrd")
	private String timeofdayLrd;

	@Column(name="workdsm_lrd")
	private String workdsmLrd;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="uid_lrd")
	private User user;

	public LeaveRecord() {
	}

	public LeaveRecordPK getId() {
		return this.id;
	}

	public void setId(LeaveRecordPK id) {
		this.id = id;
	}

	public String getApprovercommentLrd() {
		return this.approvercommentLrd;
	}

	public void setApprovercommentLrd(String approvercommentLrd) {
		this.approvercommentLrd = approvercommentLrd;
	}

	public int getApproveridLrd() {
		return this.approveridLrd;
	}

	public void setApproveridLrd(int approveridLrd) {
		this.approveridLrd = approveridLrd;
	}

	public String getContactdetailsLrd() {
		return this.contactdetailsLrd;
	}

	public void setContactdetailsLrd(String contactdetailsLrd) {
		this.contactdetailsLrd = contactdetailsLrd;
	}

	public String getDescLrd() {
		return this.descLrd;
	}

	public void setDescLrd(String descLrd) {
		this.descLrd = descLrd;
	}

	public String getLeavecategoryLrd() {
		return this.leavecategoryLrd;
	}

	public void setLeavecategoryLrd(String leavecategoryLrd) {
		this.leavecategoryLrd = leavecategoryLrd;
	}

	public String getLeavestatusLrd() {
		return this.leavestatusLrd;
	}

	public void setLeavestatusLrd(String leavestatusLrd) {
		this.leavestatusLrd = leavestatusLrd;
	}

	public double getNumdaysLrd() {
		return this.numdaysLrd;
	}

	public void setNumdaysLrd(double numdaysLrd) {
		this.numdaysLrd = numdaysLrd;
	}

	public String getOverseasLrd() {
		return this.overseasLrd;
	}

	public void setOverseasLrd(String overseasLrd) {
		this.overseasLrd = overseasLrd;
	}

	public String getTimeofdayLrd() {
		return this.timeofdayLrd;
	}

	public void setTimeofdayLrd(String timeofdayLrd) {
		this.timeofdayLrd = timeofdayLrd;
	}

	public String getWorkdsmLrd() {
		return this.workdsmLrd;
	}

	public void setWorkdsmLrd(String workdsmLrd) {
		this.workdsmLrd = workdsmLrd;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}