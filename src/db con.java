/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class dbcon { 
    
    public static Connection con(){         //use to connect database
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarasi_book_shop","root","");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
    
}
