/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.io.File;

/**
 *
 * @author b15-06m
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        File f = new File(".\\ejemploprueba.txt");
        if(!f.isFile()){
            System.out.println("Error");    
        }
        else{
            System.out.println(f.length());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getName());
        }       
    }
}
