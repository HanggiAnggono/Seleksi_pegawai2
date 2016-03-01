/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi_pegawai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALFIANSAH
 */
public class BaseClass extends javax.swing.JFrame {
    protected String HakAkses;

    public Connection koneksi() throws SQLException
    {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_spk_wp","root","");
            return con;
        }
        catch (SQLException se)
        {
            System.out.println("No Connection Open");
            return null;
        }
        catch (Exception ex)
        {
            System.out.println("Couldn't open connection"+ex);
            return null;
        }
    }

}

