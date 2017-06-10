package edu.iss.laps.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="calendar")
public class Calendar {
     @Id
     @Temporal(TemporalType.DATE)
     @Column(name="date_clr")
     @DateTimeFormat(pattern="dd/MM/yyyy")
     private Date date_Clr;
     
     @Basic
     @Column(name="name_clr")
     private String name_Clr;
     @Column(name="desc_clr")
     private String desc_Clr;
	public Calendar(Date date_Clr, String name_Clr, String desc_Clr) {
		super();
		this.date_Clr = date_Clr;
		this.name_Clr = name_Clr;
		this.desc_Clr = desc_Clr;
	}
	public Date getDate_Clr() {
		return date_Clr;
	}
	public void setDate_Clr(Date date_Clr) {
		this.date_Clr = date_Clr;
	}
	public String getName_Clr() {
		return name_Clr;
	}
	public void setName_Clr(String name_Clr) {
		this.name_Clr = name_Clr;
	}
	public String getDesc_Clr() {
		return desc_Clr;
	}
	public void setDesc_Clr(String desc_Clr) {
		this.desc_Clr = desc_Clr;
	}
	@Override
	public String toString() {
		return "Calendar [date_Clr=" + date_Clr + ", name_Clr=" + name_Clr + ", desc_Clr=" + desc_Clr + "]";
	}
     
     
}
