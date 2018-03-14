package com.mycompany.readfiles.dao;

import java.io.File;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.mycompany.readfiles.model.FileM;
import com.mycompany.readfiles.model.FileRowMapper;



@Component("fileDao")
public class FileDaoImpl implements FileDao{
	//evitar inyeccion sql
		private NamedParameterJdbcTemplate jdbcTemplate;
		@Autowired
		private void setDataSource(DataSource dataSource) {
			this.jdbcTemplate = new  NamedParameterJdbcTemplate(dataSource);
		}
		@Override
		public boolean save(String[] file) {
			MapSqlParameterSource paramMap = new MapSqlParameterSource();
			paramMap.addValue("name", file[0]);
			paramMap.addValue("workRole", file[1]);
			paramMap.addValue("creationDate", file[2]);
			return jdbcTemplate.
					update("insert into Administrator(name, workRole, creationDate) values(:name, :workRole, :creationDate)", paramMap)==1;

		}
		  //////
	      //comentar funcion si no quieres implementar  modelo y rowmapper
		@Override
		public List<FileM> findAll() {
			return jdbcTemplate.query("select * from administrator", new FileRowMapper());
			
		}


}
