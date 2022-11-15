/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import model.category;

/**
 *
 * @author DELL
 */
public class categoryDao {

    public static void save(category Category) {
        String query = "insert into category(name) values('" + Category.getName() + "')";
        DBOperations.setDataorDelete(query, "Category Added Successfully !");
    }

    public static ArrayList<category> getAllRecords() {
        ArrayList<category> arraylist = new ArrayList<>();

        try {
            ResultSet rs = DBOperations.getData("select * from category");
            while (rs.next()) {
                category Category = new category();
                Category.setId(rs.getInt("id"));
                Category.setName(rs.getString("name"));
                arraylist.add(Category);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }

    public static void delete(String id) {
        String query = "delete from category where id = '"+id+"'";
        DBOperations.setDataorDelete(query, "Category Deleted Successfully !");

    }
}
