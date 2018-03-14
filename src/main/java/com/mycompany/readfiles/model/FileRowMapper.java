package com.mycompany.readfiles.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FileRowMapper implements RowMapper<FileM> {
	@Override
	public FileM mapRow(ResultSet rs, int rowNum) throws SQLException {
		FileM file  = new FileM();
		file.setIdFile(rs.getInt("idAdministrator")); 
		file.setWorkRole(rs.getString("workRole"));
		file.setName(rs.getString("name"));
		file.setCreationDate(rs.getTimestamp("creationDate"));
		return file;
	}
}
