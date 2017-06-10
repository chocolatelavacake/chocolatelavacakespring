package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the approval database table.
 * 
 */
@Entity
@NamedQuery(name="Approval.findAll", query="SELECT a FROM Approval a")
public class Approval implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ApprovalPK id;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="approverid_apl")
	private User user;

	public Approval() {
	}

	public ApprovalPK getId() {
		return this.id;
	}

	public void setId(ApprovalPK id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}