/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.readfiles;

import java.io.IOException;

/**
 *
 * @author pc
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Leyendo archivos");
         FileClass fc= new FileClass();
         fc.ReadmeAndInsert();
                
        System.out.println("Hello, world");
    }
}
