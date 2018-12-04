package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Entidades.Motor;
import Negocio.MotorNegocio;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class BuscarPorNro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNro;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarPorNro frame = new BuscarPorNro();
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
	public BuscarPorNro() {
		setTitle("BUSQUEDA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1376, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroDeMotor = new JLabel("Numero de motor:");
		lblNumeroDeMotor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumeroDeMotor.setBounds(26, 11, 112, 14);
		contentPane.add(lblNumeroDeMotor);
		
		txtNro = new JTextField();
		txtNro.setBounds(161, 9, 102, 20);
		contentPane.add(txtNro);
		txtNro.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 38, 1340, 118);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero", "Empresa", "Potencia", "RPM", "Observaciones", "NroRemEntrada", "FecRem", "NroPedPresu", "FecPedPresu", "NroOC", "FecOC", "NroPresu", "FecPresu", "NroRemLcdm", "FecRemLcdm", "NroFactLcdm", "FecFactLcdm"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(47);
		table.getColumnModel().getColumn(4).setPreferredWidth(83);
		table.getColumnModel().getColumn(5).setPreferredWidth(92);
		scrollPane.setViewportView(table);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int filas=table.getRowCount();
		        for (int i = 0;filas>i; i++) {
		            model.removeRow(0);
		        }
				MotorNegocio mn=new MotorNegocio();
				Motor m=mn.buscarPorNumero(txtNro.getText());
				
				String fechaPedPresuString;
				if(m.getFechaPedidoPresupuesto()==null){
					fechaPedPresuString=null;
				}else{
					fechaPedPresuString=m.getFechaPedidoPresupuesto().toString();
				}
				
				String fechaRemitoEntrada;
				if(m.getFechaRemitoEntrada()==null){
					fechaRemitoEntrada=null;
				}else{
					fechaRemitoEntrada=m.getFechaRemitoEntrada().toString();
				}
				
				String fechaOrdenCompra;
				if(m.getFechaOrdenCompra()==null){
					fechaOrdenCompra=null;
				}else{
					fechaOrdenCompra=m.getFechaOrdenCompra().toString();
				}
				
				String fechaPresupuesto;
				if(m.getFechaPresupuesto()==null){
					fechaPresupuesto=null;
				}else{
					fechaPresupuesto=m.getFechaPresupuesto().toString();
				}
				
				String fechaRemitoLcdm;
				if(m.getFechaRemitoLcdm()==null){
					fechaRemitoLcdm=null;
				}else{
					fechaRemitoLcdm=m.getFechaRemitoLcdm().toString();
				}
				
				String fechaFacturaLcdm;
				if(m.getFechaFacturaLcdm()==null){
					fechaFacturaLcdm=null;
				}else{
					fechaFacturaLcdm=m.getFechaFacturaLcdm().toString();
				}
				
				String [] fila={m.getNroMotor(), m.getEmpresa(), m.getPotencia(), Integer.toString(m.getRmp()),
						m.getObservaciones(), Integer.toString(m.getNroRemitoEntrada()), fechaRemitoEntrada,
						Integer.toString(m.getNroPedidoPresupuesto()), fechaPedPresuString,
						Integer.toString(m.getNroOrdenCompra()), fechaOrdenCompra,
						Integer.toString(m.getNroPresupuesto()), fechaPresupuesto,
						Integer.toString(m.getNroRemitoLcdm()), fechaRemitoLcdm,
						Integer.toString(m.getNroFacturaLcdm()), fechaFacturaLcdm};
				model.addRow(fila);
			}
		});
		btnBuscar.setBounds(299, 8, 89, 23);
		contentPane.add(btnBuscar);
	}
}
