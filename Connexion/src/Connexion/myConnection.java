package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class myConnection {
	
	String url = "jdbc:mysql://localhost:3306/test_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
    String user = "root";
    String password = "root";
    
public boolean getData2(String id_login) {
		
		DefaultTableModel dm=new DefaultTableModel();
        dm.addColumn("id_login");
        dm.addColumn("user_name");
        dm.addColumn("password");
     
        String sql = "Select * from id_login where id='"+id_login+"'";
        String url = "jdbc:mysql://localhost:3306/test_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String user = "root";
        String passwordAll = "root";
        
        try {
        	
            
            Connection con = DriverManager.getConnection(url, user, passwordAll);
            Statement myStmt = con.prepareStatement(sql);            
            
            ResultSet rst=myStmt.executeQuery(sql);
            
             while(rst.next()){
                 String id_login1 = rst.getString(1);
                 String user_name = rst.getString(2);
                 String password = rst.getString(3);

                Object[] rowData= {id_login1,user_name,password};
                dm.addRow(rowData);
            }
            
           return dm;
            
            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
            return null;
	
            
            
            
	}

	
	boolean insert(String id_login) {
		
		String sql = "Select * from id_login where id='"+id_login+"'";
	    
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection(url, user, password);
	        Statement st = con.createStatement();            
	        st.executeUpdate(sql);
	        return true;
	        } catch (Exception ex)
	        {
	            ex.printStackTrace();
	        }
	        return false;
	}

}
