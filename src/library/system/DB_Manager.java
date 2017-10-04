
package library.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DB_Manager {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String URL;

    public DB_Manager(String url) {
        URL =url;
    }
    
    public void createConnection() throws Exception
    {
        conn = DriverManager.getConnection(URL); //connect to DB
    }
    
    
    public void releaseResources()throws Exception
    {
        if(stmt != null) stmt.close();
        if(conn != null ) conn.close();
        if(rs!= null) rs.close();
    }
    
    public ResultSet select (String Q)throws Exception
    {
        try
        {
            createConnection();
            stmt = conn.createStatement();
            rs=stmt.executeQuery(Q);
            return rs;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
        
    }
    
    
    public void update(String Q)throws Exception
    {
        try{
            createConnection();
            stmt = conn.createStatement();
            stmt.execute(Q);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        finally
        {
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
        }
        
    }
    
    public void insert (String Q)throws Exception
    {
        try{
            createConnection();
            stmt = conn.createStatement();
            stmt.execute(Q);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        finally
        {
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
        }
    }
    
    public void delete (String Q)throws Exception
    {
        try{
            createConnection();
            stmt = conn.createStatement();
            stmt.execute(Q);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        finally
        {
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
        }
    }
    
    
    
    
}
