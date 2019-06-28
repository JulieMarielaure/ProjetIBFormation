import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class Calculette extends JFrame {

	private JPanel contentPane;
	private JTextField number2;
	private JTextField number1;
	private JTextField rslt;
	private JButton btnDiviser;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculette frame = new Calculette();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Calculette() {
		
		//create object of class
		Calcul c = new Calcul();
		System.out.println(c);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//create textfield
		number2 = new JTextField();
		number2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		number2.setBounds(200, 71, 118, 105);
		contentPane.add(number2);
		number2.setColumns(10);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String test1=number1.getText();
				double number1 = Double.parseDouble(test1) ;
				String test2=number2.getText();
				double number2 = Double.parseDouble(test2) ;
				double rsltTotal = number1 + number2;
				
				rslt.setText(rsltTotal+"");
			}
		});
		
		btnPlus.setBounds(333, 40, 115, 29);
		contentPane.add(btnPlus);
		
		JButton btnMoins = new JButton("-");
		btnMoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String test1=number1.getText();
				double number1 = Double.parseDouble(test1) ;
				String test2=number2.getText();
				double number2 = Double.parseDouble(test2) ;
				double rsltTotal = number1 - number2;
				
				rslt.setText(rsltTotal+"");
				
			}
		});
		btnMoins.setBounds(333, 85, 115, 29);
		contentPane.add(btnMoins);
		
		JButton btnFois = new JButton("*");
		btnFois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String test1=number1.getText();
				double number1 = Double.parseDouble(test1) ;
				String test2=number2.getText();
				double number2 = Double.parseDouble(test2) ;
				double rsltTotal = number1 * number2;
				rslt.setText(rsltTotal+"");
			}
		});
		btnFois.setBounds(333, 130, 115, 29);
		contentPane.add(btnFois);
		
		number1 = new JTextField();
		number1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		number1.setBounds(63, 71, 108, 105);
		contentPane.add(number1);
		number1.setColumns(10);
		
		rslt = new JTextField();
		rslt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		rslt.setBounds(463, 71, 108, 105);
		contentPane.add(rslt);
		rslt.setColumns(10);
		
		btnDiviser = new JButton("/");
		btnDiviser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String test1=number1.getText();
				double number1 = Double.parseDouble(test1) ;
				String test2=number2.getText();
				double number2 = Double.parseDouble(test2) ;
				double rsltTotal = number1 / number2;
				rslt.setText(rsltTotal+"");
			}
		});
		btnDiviser.setBounds(333, 175, 115, 29);
		contentPane.add(btnDiviser);
		
		
	
	}
}
