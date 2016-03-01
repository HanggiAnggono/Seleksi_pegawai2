/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi_pegawai;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import javax.swing.JOptionPane;
/**
 *
 * @author ALFIANSAH
 */
public class Database {
    public Properties mypanel, myLanguage;
    private String strNamePanel;

    public static Connection getConnection()throws Exception
    {
        Properties prop = new Properties();
        FileInputStream in = new FileInputStream("Database.properties");
        
        String driver = prop.getProperty("DBDriver");
        String url = prop.getProperty("DBDatabase");
        String username = prop.getProperty("DBUsername");
        String password = prop.getProperty("DBPassword");
        
        return DriverManager.getConnection(url, username, password);
    }
    
    public String SettingPanel(String nmPanel)
    {
        try 
        {
            mypanel = new Properties();
            mypanel.load(new FileInputStream("Database.properties"));
            strNamePanel = mypanel.getProperty(nmPanel);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Tidak ada koneksi","Error",
            JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return strNamePanel;
}
}
