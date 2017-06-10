package edu.iss.laps.model;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the roles database table.
 * 
 */
@Embeddable
public class RolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="uid_ros", insertable=false, updatable=false)
	private int uidRos;

	@Column(name="role_ros")
	private String roleRos;

	public RolePK() {
	}
	public int getUidRos() {
		return this.uidRos;
	}
	public void setUidRos(int uidRos) {
		this.uidRos = uidRos;
	}
	public String getRoleRos() {
		return this.roleRos;
	}
	public void setRoleRos(String roleRos) {
		this.roleRos = roleRos;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RolePK)) {
			return false;
		}
		RolePK castOther = (RolePK)other;
		return 
			(this.uidRos == castOther.uidRos)
			&& this.roleRos.equals(castOther.roleRos);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.uidRos;
		hash = hash * prime + this.roleRos.hashCode();
		
		return hash;
	}
}