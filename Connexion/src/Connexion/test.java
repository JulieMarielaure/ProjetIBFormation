package Connexion;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class test extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField loginFile;
	private JTextField nameFile;
	private JTextField passwordFile;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 491);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.setBounds(373, 207, 97, 46);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			       String url = "jdbc:mysql://localhost:3306/test_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
			        String user = "root";
			        String password = "root";
			  
			        try {
			        	
			        	Connection con = DriverManager.getConnection(url, user, password);
			            Statement st = con.createStatement(); 

			            String sql = "update tb_login "
			                    + "set user_name='Marine'"
			                    + "where id_login='1'";
			            st.executeUpdate(sql);
			            System.out.println("Update complete.");
			            
			        } catch (SQLException exc) {
			        	exc.printStackTrace();
			        }
			         
			} 
			    
		});
		
		
		contentPane.setLayout(null);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setBounds(373, 275, 97, 46);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String url = "jdbc:mysql://localhost:3306/test_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
			        String user = "root";
			        String password = "root";
			  
			        try {
			        	
			        	Connection con = DriverManager.getConnection(url, user, password);
			            Statement st = con.createStatement(); 

			        	String sql = "delete from tb_login where id_login=3";
			        	st.executeUpdate(sql);
			            System.out.println("Delete complete.");
			            
			            
			        } catch (SQLException exc) {
			        	exc.printStackTrace();
			        }
			         
			} 
			
		});
		
		contentPane.add(btnDelete);
		
		JButton btnInsert = new JButton("insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        String url = "jdbc:mysql://localhost:3306/test_db?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		        String user = "root";
		        String password = "root";
		  
		        try {
		        	
		        	Connection con = DriverManager.getConnection(url, user, password);
		            Statement st = con.createStatement(); 

		            String sql = "INSERT INTO tb_login (user_name, password) VALUES ('"+ nameFile.getText()+"', '"+ passwordFile.getText()+"')"; 
		            st.executeUpdate(sql);
		            System.out.println("Insert complete!!");

		        } catch (SQLException exc) {
		        	exc.printStackTrace();
		        }
		         
		} 
	
		});
		btnInsert.setBounds(373, 61, 97, 46);
		contentPane.add(btnInsert);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(511, 61, 244, 230);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		JButton btnSelect = new JButton("select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(new myConnection().getData2(loginFile.getText()))
                {
                    JOptionPane.showMessageDialog(null, "Delete");
                }
				
				
			}
		});
		
		
		btnSelect.setBounds(373, 135, 97, 46);
		contentPane.add(btnSelect);
		
		table_1 = new JTable();
		table_1.setBackground(Color.PINK);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Login", "Name", "Password"
			}
		));
		table_1.setBounds(167, 157, 1, 1);
		contentPane.add(table_1);
		
		JButton btnLoad_1 = new JButton("load");
		btnLoad_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel dm = new JDBCConnexion().getData();
                table.setModel(dm);
				
			}
		});
		btnLoad_1.setBounds(511, 319, 244, 37);
		contentPane.add(btnLoad_1);
		
		loginFile = new JTextField();
		
		loginFile.setBounds(33, 145, 146, 26);
		loginFile.setBackground(Color.green);
		contentPane.add(loginFile);
		loginFile.setColumns(10);
		
		nameFile = new JTextField();
		nameFile.setColumns(10);
		nameFile.setBackground(Color.yellow);
		nameFile.setBounds(33, 227, 146, 26);
		contentPane.add(nameFile);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBounds(33, 109, 69, 20);
		contentPane.add(lblLogin);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(33, 187, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(33, 271, 69, 20);
		contentPane.add(lblPassword);
		
		passwordFile = new JTextField();
		passwordFile.setColumns(10);
		passwordFile.setBackground(Color.cyan);
		passwordFile.setBounds(33, 308, 146, 26);
		contentPane.add(passwordFile);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(test.class.getResource("/img/liveaboard-egypt-sinai-shoreline-xxl.jpg")));
		lblNewLabel.setBounds(0, -50, 936, 561);
		contentPane.add(lblNewLabel);
		
		
	}
	
	public TableModel getTableModel() {
		return table.getModel();
	}
	public void setTableModel(TableModel model) {
		table.setModel(model);
	}
}
