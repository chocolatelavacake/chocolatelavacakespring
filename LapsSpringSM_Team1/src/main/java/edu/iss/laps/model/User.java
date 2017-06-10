package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="uid_usr")
	private int uidUsr;

	@Column(name="designation_usr")
	private String designationUsr;

	@Column(name="firstname_usr")
	private String firstnameUsr;

	@Column(name="lastname_usr")
	private String lastnameUsr;

	@Column(name="password_usr")
	private String passwordUsr;

	@Column(name="username_usr")
	private String usernameUsr;
	
	@Column(name="email_usr")
	private String emailUsr;

	//bi-directional many-to-one association to Approval
	@OneToMany(mappedBy="user")
	private List<Approval> approvals;

	//bi-directional many-to-one association to Leaverecord
	@OneToMany(mappedBy="user")
	private List<LeaveRecord> leaverecords;

	//bi-directional many-to-one association to Overtime
	@OneToMany(mappedBy="user")
	private List<Overtime> overtimes;

	//bi-directional many-to-one association to Role
	@OneToMany(mappedBy="user")
	private List<Role> roles;

	//bi-directional many-to-one association to Staffleaveallocation
	@OneToMany(mappedBy="user")
	private List<StaffLeaveAllocation> staffleaveallocations;

	public User() {
	}

	public int getUidUsr() {
		return this.uidUsr;
	}

	public void setUidUsr(int uidUsr) {
		this.uidUsr = uidUsr;
	}

	public String getDesignationUsr() {
		return this.designationUsr;
	}

	public void setDesignationUsr(String designationUsr) {
		this.designationUsr = designationUsr;
	}

	public String getFirstnameUsr() {
		return this.firstnameUsr;
	}

	public void setFirstnameUsr(String firstnameUsr) {
		this.firstnameUsr = firstnameUsr;
	}

	public String getLastnameUsr() {
		return this.lastnameUsr;
	}

	public void setLastnameUsr(String lastnameUsr) {
		this.lastnameUsr = lastnameUsr;
	}

	public String getPasswordUsr() {
		return this.passwordUsr;
	}

	public void setPasswordUsr(String passwordUsr) {
		this.passwordUsr = passwordUsr;
	}

	public String getUsernameUsr() {
		return this.usernameUsr;
	}

	public void setUsernameUsr(String usernameUsr) {
		this.usernameUsr = usernameUsr;
	}

	public String getEmailUsr() {
		return emailUsr;
	}

	public void setEmailUsr(String emailUsr) {
		this.emailUsr = emailUsr;
	}

	public List<Approval> getApprovals() {
		return this.approvals;
	}

	public void setApprovals(List<Approval> approvals) {
		this.approvals = approvals;
	}

	public Approval addApproval(Approval approval) {
		getApprovals().add(approval);
		approval.setUser(this);

		return approval;
	}

	public Approval removeApproval(Approval approval) {
		getApprovals().remove(approval);
		approval.setUser(null);

		return approval;
	}

	public List<LeaveRecord> getLeaverecords() {
		return this.leaverecords;
	}

	public void setLeaverecords(List<LeaveRecord> leaverecords) {
		this.leaverecords = leaverecords;
	}

	public LeaveRecord addLeaverecord(LeaveRecord leaverecord) {
		getLeaverecords().add(leaverecord);
		leaverecord.setUser(this);

		return leaverecord;
	}

	public LeaveRecord removeLeaveRecord(LeaveRecord leaveRecord) {
		getLeaverecords().remove(leaveRecord);
		leaveRecord.setUser(null);

		return leaveRecord;
	}

	public List<Overtime> getOvertimes() {
		return this.overtimes;
	}

	public void setOvertimes(List<Overtime> overtimes) {
		this.overtimes = overtimes;
	}

	public Overtime addOvertime(Overtime overtime) {
		getOvertimes().add(overtime);
		overtime.setUser(this);

		return overtime;
	}

	public Overtime removeOvertime(Overtime overtime) {
		getOvertimes().remove(overtime);
		overtime.setUser(null);

		return overtime;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Role addRole(Role role) {
		getRoles().add(role);
		role.setUser(this);

		return role;
	}

	public Role removeRole(Role role) {
		getRoles().remove(role);
		role.setUser(null);

		return role;
	}

	public List<StaffLeaveAllocation> getStaffleaveallocations() {
		return this.staffleaveallocations;
	}

	public void setStaffleaveallocations(List<StaffLeaveAllocation> staffleaveallocations) {
		this.staffleaveallocations = staffleaveallocations;
	}

	public StaffLeaveAllocation addStaffleaveallocation(StaffLeaveAllocation staffleaveallocation) {
		getStaffleaveallocations().add(staffleaveallocation);
		staffleaveallocation.setUser(this);

		return staffleaveallocation;
	}

	public StaffLeaveAllocation removeStaffleaveallocation(StaffLeaveAllocation staffleaveallocation) {
		getStaffleaveallocations().remove(staffleaveallocation);
		staffleaveallocation.setUser(null);

		return staffleaveallocation;
	}

}