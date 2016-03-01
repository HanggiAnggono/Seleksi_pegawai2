/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi_pegawai;
import java.sql.*;

/**
 *
 * @author ALFIANSAH
 */
public class koneksi 
{
    public koneksi(){}
    public Connection bukakoneksi() throws SQLException
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

