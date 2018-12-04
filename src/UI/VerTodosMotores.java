package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Entidades.Motor;
import Negocio.MotorNegocio;

public class VerTodosMotores extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerTodosMotores frame = new VerTodosMotores();
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
	public VerTodosMotores() {
		setTitle("LISTADO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 1376, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1340, 602);
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
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		int filas=table.getRowCount();
        for (int i = 0;filas>i; i++) {
            model.removeRow(0);
        }
        MotorNegocio mn=new MotorNegocio();
        ArrayList<Motor> motores=mn.getAll();
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
}
