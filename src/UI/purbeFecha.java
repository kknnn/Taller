package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entidades.Motor;
import Negocio.MotorNegocio;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class purbeFecha extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtfecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					purbeFecha frame = new purbeFecha();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public purbeFecha() {
		getContentPane().setLayout(null);
		
		txtfecha = new JTextField();
		txtfecha.setBounds(97, 38, 86, 20);
		getContentPane().add(txtfecha);
		txtfecha.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String regex = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$";
				if(Pattern.matches(regex, txtfecha.getText())){
					JOptionPane.showMessageDialog(null, "COINCIDE");
				}else{
					JOptionPane.showMessageDialog(null, "ERROR");
				}
				
			}
		});
		btnNewButton.setBounds(104, 101, 89, 23);
		getContentPane().add(btnNewButton);

		
	}
}
