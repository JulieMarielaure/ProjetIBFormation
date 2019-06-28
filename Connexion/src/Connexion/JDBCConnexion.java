package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class JDBCConnexion {
    String url = "jdbc:mysql://localhost:3306/test_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
    String user = "root";
    String password = "root";

	public static void main(String[] args) {


  
        try {
        	
        	
            //UPDATE
            //String sql = "update tb_login "
            //        + "set user_name='Marine'"
            //        + "where id_login='1'";
            //st.executeUpdate(sql);
            //System.out.println("Update complete.");
            
            //DELETE
        	//String sql = "delete from tb_login where id_login=3";
            //System.out.println("Delete complete.");
            
            //SELECT
            //ResultSet rslt = st.executeQuery("SELECT user_name FROM tb_login");
            //while (rslt.next()){
            //	System.out.println(rslt.getString("user_name"));
            //}
            
            //INSERT
            //String sql = "INSERT INTO tb_login (user_name, password) " +
            //        "VALUES ('Juliette', 789)";
            //st.executeUpdate(sql);
            //System.out.println("Insert complete.");
            
            
            //ADD COLUM 
            

        } catch (Exception exc) {
        	exc.printStackTrace();
        }
         
	}
    
	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	public DefaultTableModel getData() {
		
		DefaultTableModel dm=new DefaultTableModel();
        dm.addColumn("id_login");
        dm.addColumn("user_name");
        dm.addColumn("password");
     
        String sql="select * from tb_login";
        String url = "jdbc:mysql://localhost:3306/test_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String user = "root";
        String passwordAll = "root";
        
        try {
        	
            
            Connection con = DriverManager.getConnection(url, user, passwordAll);
            Statement myStmt = con.prepareStatement(sql);            
            
            ResultSet rst=myStmt.executeQuery(sql);
            
             while(rst.next()){
                 String id_login = rst.getString(1);
                 String user_name = rst.getString(2);
                 String password = rst.getString(3);

                Object[] rowData= {id_login,user_name,password};
                dm.addRow(rowData);
            }
            
           return dm;
            
            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
            return null;
	
            
            
            
	}
public DefaultTableModel getData2(String id_login) {
		
		DefaultTableModel dm=new DefaultTableModel();
        dm.addColumn("id_login");
        dm.addColumn("user_name");
        dm.addColumn("password");
     
        String sql="select * from tb_login where id_login";
        String url = "jdbc:mysql://localhost:3306/test_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String user = "root";
        String passwordAll = "root";
        
        try {
        	
            
            Connection con = DriverManager.getConnection(url, user, passwordAll);
            Statement myStmt = con.prepareStatement(sql);            
            
            ResultSet rst=myStmt.executeQuery(sql);
            
             while(rst.next()){
                 String id_login = rst.getString(1);
                 String user_name = rst.getString(2);
                 String password = rst.getString(3);

                Object[] rowData= {id_login,user_name,password};
                dm.addRow(rowData);
            }
            
           return dm;
            
            } catch (Exception ex)
            {
                ex.printStackTrace();
            }
            return null;
	
            
            
            
	}

public boolean insert(String loginFile) {
	
	String sql = "Select * from id_login where id='"+loginFile+"'";
    
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


