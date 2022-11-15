/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.*;
import javax.swing.JOptionPane;
import model.Bill;

/**
 *
 * @author DELL
 */
public class BillDao {
    
    public static String getId()
    {
        int id = 1;
        try
        {
            ResultSet rs = DBOperations.getData("select max(id) from bill");
            if(rs.next())
            {
                id = rs.getInt(1);
                id = id + 1;
            }
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    
    public static void save(Bill bill)
    {
        String query = "insert into bill values('"+bill.getId()+"','"+bill.getName()+"','"+bill.getMobilenumber()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatedby()+"')";
        DBOperations.setDataOrDelete(query, "Bill Detalis Added Successfully!");
    }
}
