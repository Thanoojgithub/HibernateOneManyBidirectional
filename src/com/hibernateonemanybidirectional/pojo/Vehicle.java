package com.hibernateonemanybidirectional.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE", schema = "MYDB")
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1678793790517725816L;

	@Id
	@GeneratedValue
	@Column(name = "VID", unique = true, nullable = false)
	private Integer vId;

	@Column(name = "V_REGNO", unique = true, nullable = false)
	private Integer vRegNo;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "REG_OID", nullable = false)
	private RegOffice regOffice;

	public Vehicle() {
	}

	public Vehicle(Integer vRegNo) {
		super();
		this.vRegNo = vRegNo;
	}

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public Integer getvRegNo() {
		return vRegNo;
	}

	public void setvRegNo(Integer vRegNo) {
		this.vRegNo = vRegNo;
	}

	public RegOffice getRegOffice() {
		return regOffice;
	}

	public void setRegOffice(RegOffice regOffice) {
		this.regOffice = regOffice;
	}

	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vRegNo=" + vRegNo + ", regOffice="
				+ regOffice + "]";
	}
}
