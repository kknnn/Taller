package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entidades.Motor;
import Negocio.MotorNegocio;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class EditarMotor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNroABuscar;
	private JTextField txtEmpresa;
	private JTextField txtPotencia;
	private JTextField txtRpm;
	private JTextField txtObs;
	private JTextField txtNroRemEntrada;
	private JTextField txtFechaRemEntrada;
	private JTextField txtNroPedPresu;
	private JTextField txtFechaPedPresu;
	private JTextField txtNroOc;
	private JTextField txtFechaOc;
	private JTextField txtNroPresu;
	private JTextField txtFechaPresu;
	private JTextField txtNroRemLcdm;
	private JTextField txtFechaRemLcdm;
	private JTextField txtFechaFactLcdm;
	private JTextField txtNroFactLcdm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarMotor frame = new EditarMotor();
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
	public EditarMotor() {
		setTitle("EDITAR MOTOR");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 560, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroDeMotor = new JLabel("Numero de motor:");
		lblNumeroDeMotor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumeroDeMotor.setBounds(10, 11, 132, 14);
		contentPane.add(lblNumeroDeMotor);
		
		txtNroABuscar = new JTextField();
		txtNroABuscar.setBounds(144, 9, 86, 20);
		contentPane.add(txtNroABuscar);
		txtNroABuscar.setColumns(10);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 36, 514, 373);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Empresa:");
		label.setBounds(29, 14, 66, 14);
		panel.add(label);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setText("");
		txtEmpresa.setColumns(10);
		txtEmpresa.setBounds(134, 11, 86, 20);
		panel.add(txtEmpresa);
		
		JLabel label_1 = new JLabel("Potencia:");
		label_1.setBounds(29, 56, 66, 14);
		panel.add(label_1);
		
		txtPotencia = new JTextField();
		txtPotencia.setText("");
		txtPotencia.setColumns(10);
		txtPotencia.setBounds(134, 53, 86, 20);
		panel.add(txtPotencia);
		
		JLabel label_2 = new JLabel("RPM:");
		label_2.setBounds(29, 97, 31, 14);
		panel.add(label_2);
		
		txtRpm = new JTextField();
		txtRpm.setText("");
		txtRpm.setColumns(10);
		txtRpm.setBounds(134, 94, 86, 20);
		panel.add(txtRpm);
		
		JLabel label_3 = new JLabel("Obervaciones:");
		label_3.setBounds(29, 135, 95, 14);
		panel.add(label_3);
		
		txtObs = new JTextField();
		txtObs.setColumns(10);
		txtObs.setBounds(134, 132, 86, 20);
		panel.add(txtObs);
		
		JLabel label_4 = new JLabel("Nro remito entrada:");
		label_4.setBounds(19, 174, 117, 14);
		panel.add(label_4);
		
		txtNroRemEntrada = new JTextField();
		txtNroRemEntrada.setColumns(10);
		txtNroRemEntrada.setBounds(134, 171, 86, 20);
		panel.add(txtNroRemEntrada);
		
		JLabel label_5 = new JLabel("Fecha Remito Entrada:");
		label_5.setBounds(0, 214, 136, 14);
		panel.add(label_5);
		
		txtFechaRemEntrada = new JTextField();
		txtFechaRemEntrada.setColumns(10);
		txtFechaRemEntrada.setBounds(134, 211, 86, 20);
		panel.add(txtFechaRemEntrada);
		
		JLabel label_6 = new JLabel("Nro pedido presu:");
		label_6.setBounds(0, 255, 121, 14);
		panel.add(label_6);
		
		txtNroPedPresu = new JTextField();
		txtNroPedPresu.setColumns(10);
		txtNroPedPresu.setBounds(134, 252, 86, 20);
		panel.add(txtNroPedPresu);
		
		JLabel label_7 = new JLabel("Fecha pedido presu:");
		label_7.setBounds(0, 296, 136, 14);
		panel.add(label_7);
		
		txtFechaPedPresu = new JTextField();
		txtFechaPedPresu.setColumns(10);
		txtFechaPedPresu.setBounds(134, 293, 86, 20);
		panel.add(txtFechaPedPresu);
		
		JLabel label_8 = new JLabel("Nro orden compra:");
		label_8.setBounds(272, 17, 117, 14);
		panel.add(label_8);
		
		txtNroOc = new JTextField();
		txtNroOc.setColumns(10);
		txtNroOc.setBounds(399, 14, 86, 20);
		panel.add(txtNroOc);
		
		JLabel label_9 = new JLabel("Fecha orden compra:");
		label_9.setBounds(272, 58, 127, 14);
		panel.add(label_9);
		
		txtFechaOc = new JTextField();
		txtFechaOc.setColumns(10);
		txtFechaOc.setBounds(399, 55, 86, 20);
		panel.add(txtFechaOc);
		
		txtNroPresu = new JTextField();
		txtNroPresu.setColumns(10);
		txtNroPresu.setBounds(399, 97, 86, 20);
		panel.add(txtNroPresu);
		
		JLabel label_10 = new JLabel("Nro presupuesto:");
		label_10.setBounds(272, 100, 106, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Fecha presupuesto:");
		label_11.setBounds(272, 144, 117, 14);
		panel.add(label_11);
		
		txtFechaPresu = new JTextField();
		txtFechaPresu.setColumns(10);
		txtFechaPresu.setBounds(399, 141, 86, 20);
		panel.add(txtFechaPresu);
		
		txtNroRemLcdm = new JTextField();
		txtNroRemLcdm.setColumns(10);
		txtNroRemLcdm.setBounds(399, 179, 86, 20);
		panel.add(txtNroRemLcdm);
		
		JLabel label_12 = new JLabel("Nro remito LCDM:");
		label_12.setBounds(272, 182, 106, 14);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("Fecha remito LCDM:");
		label_13.setBounds(272, 221, 117, 14);
		panel.add(label_13);
		
		txtFechaRemLcdm = new JTextField();
		txtFechaRemLcdm.setColumns(10);
		txtFechaRemLcdm.setBounds(399, 218, 86, 20);
		panel.add(txtFechaRemLcdm);
		
		txtFechaFactLcdm = new JTextField();
		txtFechaFactLcdm.setColumns(10);
		txtFechaFactLcdm.setBounds(399, 299, 86, 20);
		panel.add(txtFechaFactLcdm);
		
		txtNroFactLcdm = new JTextField();
		txtNroFactLcdm.setColumns(10);
		txtNroFactLcdm.setBounds(399, 258, 86, 20);
		panel.add(txtNroFactLcdm);
		
		JLabel label_14 = new JLabel("Nro factura LCDM:");
		label_14.setBounds(272, 261, 112, 14);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("Fecha factura LCDM:");
		label_15.setBounds(272, 302, 127, 14);
		panel.add(label_15);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MAPEO FECHAS
				int contadorFechasIncorrectas=0;
				Date fechaRemitoEntrada = null;
				String regex = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$";
				if(!(txtFechaRemEntrada.getText().equals(""))){
					if(Pattern.matches(regex, txtFechaRemEntrada.getText())){
						try {
							fechaRemitoEntrada = stringADate(txtFechaRemEntrada.getText());
						} catch (ParseException e1) {
							//contadorFechasIncorrectas++;
							e1.printStackTrace();
						}
					}else{
						contadorFechasIncorrectas++;
					}
				}
				
				
				Date fechaPedidoPresupuesto = null;
				if(!(txtFechaPedPresu.getText().equals(""))){
					if(Pattern.matches(regex, txtFechaPedPresu.getText())){
						try {
							fechaPedidoPresupuesto = stringADate(txtFechaPedPresu.getText());
						} catch (ParseException e1) {
							e1.printStackTrace();
						}
					}else{
						contadorFechasIncorrectas++;
					}
				}
				
				
				Date fechaOrdenCompra = null;
				if(!(txtFechaOc.getText().equals(""))){
					if(Pattern.matches(regex, txtFechaOc.getText())){
						try {
							fechaOrdenCompra = stringADate(txtFechaOc.getText());
						} catch (ParseException e1) {						
							e1.printStackTrace();
						}
					}else{
						contadorFechasIncorrectas++;
					}
				}
				
				
				Date fechaPresupuesto = null;
				if(!(txtFechaPresu.getText().equals(""))){
					if(Pattern.matches(regex, txtFechaPresu.getText())){
						try {
							fechaPresupuesto = stringADate(txtFechaPresu.getText());
						} catch (ParseException e1) {
							e1.printStackTrace();
						}
					}else{
						contadorFechasIncorrectas++;
					}
				}
				
				
				Date fechaRemitoLCDM = null;
				if(!(txtFechaRemLcdm.getText().equals(""))){
					if(Pattern.matches(regex, txtFechaRemLcdm.getText())){
						try {
							fechaRemitoLCDM = stringADate(txtFechaRemLcdm.getText());
						} catch (ParseException e1) {
							e1.printStackTrace();
						}
					}else{
						contadorFechasIncorrectas++;
					}
				}
				
				
				Date fechaFacturaLCDM = null;
				if(!(txtFechaFactLcdm.getText().equals(""))){
					if(Pattern.matches(regex, txtFechaFactLcdm.getText())){
						try {
							fechaFacturaLCDM = stringADate(txtFechaFactLcdm.getText());
						} catch (ParseException e1) {
					
							e1.printStackTrace();
						}
					}else{
						contadorFechasIncorrectas++;
					}
				}
				
				
				// FIN MAPEO FECHAS
				
				// MAPEO RESTO DE DATOS		
				String empresa;
				if(!(txtEmpresa.getText().equals(""))){
					empresa=txtEmpresa.getText();
				}else{
					empresa=null;
				}
				
				String potencia;
				if(!(txtPotencia.getText().equals(""))){
					potencia=txtPotencia.getText();
				}else{
					potencia=null;
				}
				
				int rpm;
				if(!(txtRpm.getText().equals(""))){
					rpm=Integer.parseInt(txtRpm.getText());
				}else{
					rpm=0;
				}
				
				String obs;
				if(!(txtObs.getText().equals(""))){
					obs=txtObs.getText();
				}else{
					obs=null;
				}
				
				int nroRemEnt;
				if(!(txtNroRemEntrada.getText().equals(""))){
					nroRemEnt=Integer.parseInt(txtNroRemEntrada.getText());
				}else{
					nroRemEnt=0;
				}
				
				int nroPedPresu;
				if(!(txtNroPedPresu.getText().equals(""))){
					nroPedPresu=Integer.parseInt(txtNroPedPresu.getText());
				}else{
					nroPedPresu=0;
				}
				
				int nroOc;
				if(!(txtNroOc.getText().equals(""))){
					nroOc=Integer.parseInt(txtNroOc.getText());
				}else{
					nroOc=0;
				}
				
				int nroPresu;
				if(!(txtNroPresu.getText().equals(""))){
					nroPresu=Integer.parseInt(txtNroPresu.getText());
				}else{
					nroPresu=0;
				}
				
				int nroRemLcdm;
				if(!(txtNroRemLcdm.getText().equals(""))){
					nroRemLcdm=Integer.parseInt(txtNroRemLcdm.getText());
				}else{
					nroRemLcdm=0;
				}
				
				int nroFactLcdm;
				if(!(txtNroFactLcdm.getText().equals(""))){
					nroFactLcdm=Integer.parseInt(txtNroFactLcdm.getText());
				}else{
					nroFactLcdm=0;
				}
				// FIN MAPEO RESTO DE DATOS
				
				
				if(contadorFechasIncorrectas>0){
					JOptionPane.showMessageDialog(null, "Error de formato de fecha");
				}else{
					Motor m=new Motor(txtNroABuscar.getText(), empresa, potencia, 
							rpm, obs, nroRemEnt, fechaRemitoEntrada, nroPedPresu, fechaPedidoPresupuesto,
							nroOc, fechaOrdenCompra, nroPresu, fechaPresupuesto, nroRemLcdm, fechaRemitoLCDM,
							nroFactLcdm, fechaFacturaLCDM);
					MotorNegocio mn=new MotorNegocio();
					mn.editar(m);
					JOptionPane.showMessageDialog(null, "Motor editado");
					dispose();
				}
				
				
			}
		});
		btnGuardar.setBounds(205, 339, 89, 23);
		panel.add(btnGuardar);
		
		panel.setVisible(false);
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MotorNegocio mn=new MotorNegocio();
				if(mn.existeMotor(txtNroABuscar.getText())){
					panel.setVisible(true);
					Motor m=mn.buscarPorNumero(txtNroABuscar.getText());
					
					//PARTE NUEVA PARA EVITAR ERROR AL MAPEAR DE DATOS FECHAS NULAS
					String frlcdm=null;
					if(m.getFechaRemitoLcdm()!=null){
						frlcdm=m.getFechaRemitoLcdm().toString();
					}
					
					String fre=null;
					if(m.getFechaRemitoEntrada()!=null){
						fre=m.getFechaRemitoEntrada().toString();
					}
					
					String fpp=null;
					if(m.getFechaPedidoPresupuesto()!=null){
						fpp=m.getFechaPedidoPresupuesto().toString();
					}
					
					String foc=null;
					if(m.getFechaOrdenCompra()!=null){
						foc=m.getFechaOrdenCompra().toString();
					}
					
					String fp=null;
					if(m.getFechaPresupuesto()!=null){
						fp=m.getFechaPresupuesto().toString();
					}
					
					String fflcdm=null;
					if(m.getFechaFacturaLcdm()!=null){
						fflcdm=m.getFechaFacturaLcdm().toString();
					}
					//MAPEO DE DATOS
					txtEmpresa.setText(m.getEmpresa());
					txtPotencia.setText(m.getPotencia());
					txtRpm.setText(Integer.toString(m.getRmp()));
					txtObs.setText(m.getObservaciones());
					txtNroRemEntrada.setText(Integer.toString(m.getNroRemitoEntrada()));
					//txtFechaRemEntrada.setText(m.getFechaRemitoEntrada().toString());
					txtFechaRemEntrada.setText(fre);
					txtNroPedPresu.setText(Integer.toString(m.getNroPedidoPresupuesto()));
					//txtFechaPedPresu.setText(m.getFechaPedidoPresupuesto().toString());
					txtFechaPedPresu.setText(fpp);
					txtNroOc.setText(Integer.toString(m.getNroOrdenCompra()));
					//txtFechaOc.setText(m.getFechaOrdenCompra().toString());
					txtFechaOc.setText(foc);
					txtNroPresu.setText(Integer.toString(m.getNroPresupuesto()));
					//txtFechaPresu.setText(m.getFechaPresupuesto().toString());
					txtFechaPresu.setText(fp);
					txtNroRemLcdm.setText(Integer.toString(m.getNroRemitoLcdm()));
					//txtFechaRemLcdm.setText(m.getFechaRemitoLcdm().toString());
					txtFechaRemLcdm.setText(frlcdm);
					txtNroFactLcdm.setText(Integer.toString(m.getNroFacturaLcdm()));
					//txtFechaFactLcdm.setText(m.getFechaFacturaLcdm().toString());
					txtFechaFactLcdm.setText(fflcdm);
					// FIN MAPEO
					
				}else{
					JOptionPane.showMessageDialog(null, "El motor no existe");
				}
			}
		});
		btnAceptar.setBounds(262, 8, 89, 23);
		contentPane.add(btnAceptar);
	}
	
	public Date stringADate(String fecha) throws ParseException{
		if(!(fecha.equals(""))){
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date dateEnJava = sdf1.parse(fecha);
			java.sql.Date dateEnSql = new java.sql.Date(dateEnJava.getTime());
			return dateEnSql;
		}
		else{
			return null;
		}
	}
}
