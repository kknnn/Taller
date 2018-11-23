package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Entidades.Motor;
import Negocio.MotorNegocio;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class BuscarPorEmpresa extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmpresa;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarPorEmpresa frame = new BuscarPorEmpresa();
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
	public BuscarPorEmpresa() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1376, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmpresa.setBounds(22, 11, 80, 14);
		contentPane.add(lblEmpresa);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setBounds(86, 9, 126, 20);
		contentPane.add(txtEmpresa);
		txtEmpresa.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int filas=table.getRowCount();
		        for (int i = 0;filas>i; i++) {
		            model.removeRow(0);
		        }
				MotorNegocio mn=new MotorNegocio();
				ArrayList<Motor> motores=mn.buscarPorEmpresa(txtEmpresa.getText());
				for(int i=0;i<motores.size();i++){
					Motor motor=motores.get(i);
					
					String fechaPedPresuString;
					if(motor.getFechaPedidoPresupuesto()==null){
						fechaPedPresuString=null;
					}else{
						fechaPedPresuString=motor.getFechaPedidoPresupuesto().toString();
					}
					
					String fechaRemitoEntrada;
					if(motor.getFechaRemitoEntrada()==null){
						fechaRemitoEntrada=null;
					}else{
						fechaRemitoEntrada=motor.getFechaRemitoEntrada().toString();
					}
					
					String fechaOrdenCompra;
					if(motor.getFechaOrdenCompra()==null){
						fechaOrdenCompra=null;
					}else{
						fechaOrdenCompra=motor.getFechaOrdenCompra().toString();
					}
					
					String fechaPresupuesto;
					if(motor.getFechaPresupuesto()==null){
						fechaPresupuesto=null;
					}else{
						fechaPresupuesto=motor.getFechaPresupuesto().toString();
					}
					
					String fechaRemitoLcdm;
					if(motor.getFechaRemitoLcdm()==null){
						fechaRemitoLcdm=null;
					}else{
						fechaRemitoLcdm=motor.getFechaRemitoLcdm().toString();
					}
					
					String fechaFacturaLcdm;
					if(motor.getFechaFacturaLcdm()==null){
						fechaFacturaLcdm=null;
					}else{
						fechaFacturaLcdm=motor.getFechaFacturaLcdm().toString();
					}
					
					String [] fila={motor.getNroMotor(), motor.getEmpresa(), motor.getPotencia(),
							Integer.toString(motor.getRmp()), motor.getObservaciones(),
							Integer.toString(motor.getNroRemitoEntrada()), fechaRemitoEntrada,
							Integer.toString(motor.getNroPedidoPresupuesto()), fechaPedPresuString,
							Integer.toString(motor.getNroOrdenCompra()), fechaOrdenCompra,
							Integer.toString(motor.getNroPresupuesto()), fechaPresupuesto,
							Integer.toString(motor.getNroRemitoLcdm()), fechaRemitoLcdm,
							Integer.toString(motor.getNroFacturaLcdm()), fechaFacturaLcdm};
					model.addRow(fila);
				}
			}
		});
		btnBuscar.setBounds(251, 8, 89, 23);
		contentPane.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 1340, 544);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero", "Empresa", "Potencia", "RPM", "Observaciones", "NroRemEntrada", "FecRem", "NroPedPresu", "FecPedPresu", "NroOC", "FecOC", "NroPresu", "FecPresu", "NroRemLcdm", "FecRemLcdm", "NroFactLcdm", "FecfFactLcdm"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(58);
		table.getColumnModel().getColumn(4).setPreferredWidth(85);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		table.getColumnModel().getColumn(9).setPreferredWidth(55);
		table.getColumnModel().getColumn(11).setPreferredWidth(55);
		table.getColumnModel().getColumn(12).setPreferredWidth(74);
		table.getColumnModel().getColumn(16).setPreferredWidth(79);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(37, 595, 89, 23);
		contentPane.add(btnNewButton);
	}
}
