/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Tables {

    public static void main(String[] args) {
        try {
            String UserTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobilenumber varchar(10), address varchar(200), password varchar(200), securityquestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            String adminDetails = "insert into user(name,email,mobilenumber,address,password,securityquestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What is your favourite fruit?','orange','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            String billTable = "create table bill(id int primary key,name varchar(200),mobilenumber varchar(200),email varchar(200),date varchar(50),total varchar(200),createdby varchar(200))";
            DBOperations.setDataorDelete(UserTable, "user table created Successfully");
            DBOperations.setDataorDelete(adminDetails, "Admin details added Successfully");
            DBOperations.setDataorDelete(categoryTable, "Category table created Successfully");
            DBOperations.setDataorDelete(productTable, "Product table created Successfully");
            DBOperations.setDataorDelete(billTable, "Bill table created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
