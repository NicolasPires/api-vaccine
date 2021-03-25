package com.nksolucoes.apivaccine.entities;

import java.io.Serializable;
import java.time.Instant;

public class VaccineApplication implements Serializable {
    private static final long serialVersionUID = 1L;
	private Long id;
	private String nameVaccine;
	private String emailRegistered;
	private Instant dtaApplication;
	
	public VaccineApplication() {
	}

	public VaccineApplication(Long id, String nameVaccine, String emailRegistered, Instant dtaApplication) {
		super();
		this.id = id;
		this.nameVaccine = nameVaccine;
		this.emailRegistered = emailRegistered;
		this.dtaApplication = dtaApplication;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameVaccine() {
		return nameVaccine;
	}

	public void setNameVaccine(String nameVaccine) {
		this.nameVaccine = nameVaccine;
	}

	public String getEmailRegistered() {
		return emailRegistered;
	}

	public void setEmailRegistered(String emailRegistered) {
		this.emailRegistered = emailRegistered;
	}

	public Instant getDtaApplication() {
		return dtaApplication;
	}

	public void setDtaApplication(Instant dtaApplication) {
		this.dtaApplication = dtaApplication;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VaccineApplication other = (VaccineApplication) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
