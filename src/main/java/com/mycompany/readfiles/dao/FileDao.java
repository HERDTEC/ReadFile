package com.mycompany.readfiles.dao;

import java.util.List;

import com.mycompany.readfiles.model.FileM;



public interface FileDao {
	public boolean save(String[] file);
	public List<FileM> findAll();
}



