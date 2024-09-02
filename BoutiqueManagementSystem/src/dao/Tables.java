/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author prems
 */

public class Tables {
    public static void main(String[] args){
    try{
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();
        st.executeUpdate("create table product(Product_id varchar(10) primary key, Product_name varchar(30), Description varchar(30), Quantity int, Price int, Customer_id varchar(10), Employee_id varchar(10));");           
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}
}
