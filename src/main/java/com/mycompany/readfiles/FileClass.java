/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.readfiles;


import com.mycompany.readfiles.dao.FileDao;
import com.mycompany.readfiles.model.FileM;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 *
 * @author pc
 */
public class FileClass {
   private char separator;
   private char quote;
   private String path;
   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.configuration.xml");
   FileDao fileDao = (FileDao) applicationContext.getBean("fileDao");

    public FileClass() {
        separator=';';
        quote='\"';
        path="/Users/pc/Downloads/Libro1.csv";
    }
    
    public FileClass(String path) {
         this.path=path;
    }
    
   
   public String ReadmeAndInsert () throws IOException {
       String response="Se ha realizado 0 inserciones";
      CSVReader reader = null;
      try {
         reader = new CSVReader(new FileReader(path), separator, quote);
         String[] nextLine=null;
         Integer i=0;
         while ((nextLine = reader.readNext()) != null) {
            //nextLine[i] = elemento a obtener
            System.out.println(Arrays.toString(nextLine));   
              fileDao.save(nextLine);
              i++;
              response="Se ha realizado "+ i +"inserciones";
         }
         
      } catch (Exception e) {
        System.out.println(e.getMessage());
        response= "Error, "+e.getMessage();
      } finally {
         if (null != reader) {
            reader.close();
         }
        
      }
      //////
      //comentar bloque si no quieres implementar metodo file y modelo del archivo
      List<FileM> file= fileDao.findAll(); 
		for(FileM adm : file) {
			System.out.println(adm);
		}
      
      return response;
     
   }
}
