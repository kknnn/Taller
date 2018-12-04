package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("LA CASA DEL MOTOR");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BUSCAR MOTORES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(134, 11, 170, 22);
		contentPane.add(lblNewLabel);
		
		JButton btnPorEmpresa = new JButton("Por Empresa");
		btnPorEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarPorEmpresa bpe=new BuscarPorEmpresa();
				bpe.setVisible(true);
			}
		});
		btnPorEmpresa.setBounds(105, 44, 113, 23);
		contentPane.add(btnPorEmpresa);
		
		JButton btnPorNumero = new JButton("Por Numero");
		btnPorNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarPorNro v=new BuscarPorNro();
				v.setVisible(true);
			}
		});
		btnPorNumero.setBounds(228, 44, 110, 23);
		contentPane.add(btnPorNumero);
		
		JLabel lblNuevoMotor = new JLabel("NUEVO MOTOR");
		lblNuevoMotor.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNuevoMotor.setBounds(157, 121, 130, 22);
		contentPane.add(lblNuevoMotor);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarMotor am=new AgregarMotor();
				am.setVisible(true);
			}
		});
		btnAgregar.setBounds(179, 154, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnVerTodos = new JButton("Ver Todos");
		btnVerTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VerTodosMotores vt=new VerTodosMotores();
				vt.setVisible(true);
			}
		});
		btnVerTodos.setBounds(178, 74, 109, 23);
		contentPane.add(btnVerTodos);
		
		JLabel lblEditarMotor = new JLabel("EDITAR MOTOR");
		lblEditarMotor.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEditarMotor.setBounds(157, 188, 130, 22);
		contentPane.add(lblEditarMotor);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditarMotor em=new EditarMotor();
				em.setVisible(true);
			}
		});
		btnEditar.setBounds(179, 221, 89, 23);
		contentPane.add(btnEditar);
	}
}
