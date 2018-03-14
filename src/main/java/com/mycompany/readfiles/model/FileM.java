package com.mycompany.readfiles.model;
import java.sql.Timestamp;

public class FileM {
	private int idFile;
	private String name;
	private String workRole;
	private Timestamp creationDate;

	@Override
	public String toString() {
		return "File [idAdministrator=" + idFile + ", name=" + name + ", workRole=" + workRole
				+ ", creationDate=" + creationDate + "]";
	}


	public int getIdFile() {
		return idFile;
	}


	public void setIdFile(int idFile) {
		this.idFile = idFile;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkRole() {
		return workRole;
	}

	public void setWorkRole(String workRole) {
		this.workRole = workRole;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	


	

}
