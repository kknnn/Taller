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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class AgregarMotor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNro;
	private JTextField txtEmpresa;
	private JTextField txtPotencia;
	private JTextField txtRpm;
	private JTextField txtObs;
	private JTextField txtNroRemEntrada;
	private JTextField txtFecRemEntrada;
	private JTextField txtNroPedPresu;
	private JTextField txtFecPedPresu;
	private JTextField txtOc;
	private JTextField txtFecOc;
	private JTextField txtNroPresu;
	private JTextField txtFecPresu;
	private JTextField txtNroRemLCDM;
	private JTextField txtFechaRemLCDM;
	private JTextField txtNroFactLCDM;
	private JTextField txtFecFactLCDM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarMotor frame = new AgregarMotor();
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
	public AgregarMotor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 560, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(39, 30, 66, 14);
		contentPane.add(lblNumero);
		
		JLabel lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setBounds(39, 71, 66, 14);
		contentPane.add(lblEmpresa);
		
		JLabel lblPotencia = new JLabel("Potencia:");
		lblPotencia.setBounds(39, 113, 66, 14);
		contentPane.add(lblPotencia);
		
		JLabel lblRpm = new JLabel("RPM:");
		lblRpm.setBounds(39, 157, 31, 14);
		contentPane.add(lblRpm);
		
		JLabel lblObervaciones = new JLabel("Obervaciones:");
		lblObervaciones.setBounds(39, 195, 95, 14);
		contentPane.add(lblObervaciones);
		
		txtNro = new JTextField();
		txtNro.setBounds(144, 27, 86, 20);
		contentPane.add(txtNro);
		txtNro.setColumns(10);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setText("");
		txtEmpresa.setBounds(144, 68, 86, 20);
		contentPane.add(txtEmpresa);
		txtEmpresa.setColumns(10);
		
		txtPotencia = new JTextField();
		txtPotencia.setText("");
		txtPotencia.setBounds(144, 110, 86, 20);
		contentPane.add(txtPotencia);
		txtPotencia.setColumns(10);
		
		txtRpm = new JTextField();
		txtRpm.setText("");
		txtRpm.setBounds(144, 154, 86, 20);
		contentPane.add(txtRpm);
		txtRpm.setColumns(10);
		
		txtObs = new JTextField();
		txtObs.setBounds(144, 192, 86, 20);
		contentPane.add(txtObs);
		txtObs.setColumns(10);
		
		JLabel lblNroRemito = new JLabel("Nro remito entrada:");
		lblNroRemito.setBounds(29, 234, 117, 14);
		contentPane.add(lblNroRemito);
		
		txtNroRemEntrada = new JTextField();
		txtNroRemEntrada.setBounds(144, 231, 86, 20);
		contentPane.add(txtNroRemEntrada);
		txtNroRemEntrada.setColumns(10);
		
		JLabel lblFechaRemitoEntrada = new JLabel("Fecha Remito Entrada:");
		lblFechaRemitoEntrada.setBounds(10, 274, 136, 14);
		contentPane.add(lblFechaRemitoEntrada);
		
		txtFecRemEntrada = new JTextField();
		txtFecRemEntrada.setBounds(144, 271, 86, 20);
		contentPane.add(txtFecRemEntrada);
		txtFecRemEntrada.setColumns(10);
		
		JLabel lblNroPedidoPresu = new JLabel("Nro pedido presu:");
		lblNroPedidoPresu.setBounds(10, 315, 121, 14);
		contentPane.add(lblNroPedidoPresu);
		
		txtNroPedPresu = new JTextField();
		txtNroPedPresu.setBounds(144, 312, 86, 20);
		contentPane.add(txtNroPedPresu);
		txtNroPedPresu.setColumns(10);
		
		JLabel lblFechaPedidoPresu = new JLabel("Fecha pedido presu:");
		lblFechaPedidoPresu.setBounds(10, 356, 136, 14);
		contentPane.add(lblFechaPedidoPresu);
		
		txtFecPedPresu = new JTextField();
		txtFecPedPresu.setBounds(144, 353, 86, 20);
		contentPane.add(txtFecPedPresu);
		txtFecPedPresu.setColumns(10);
		
		JLabel lblNroOrdenCompra = new JLabel("Nro orden compra:");
		lblNroOrdenCompra.setBounds(299, 30, 117, 14);
		contentPane.add(lblNroOrdenCompra);
		
		JLabel lblFechaOrdenCompra = new JLabel("Fecha orden compra:");
		lblFechaOrdenCompra.setBounds(299, 71, 127, 14);
		contentPane.add(lblFechaOrdenCompra);
		
		JLabel lblNroPresupuesto = new JLabel("Nro presupuesto:");
		lblNroPresupuesto.setBounds(299, 113, 106, 14);
		contentPane.add(lblNroPresupuesto);
		
		JLabel lblFechaPresupuesto = new JLabel("Fecha presupuesto:");
		lblFechaPresupuesto.setBounds(299, 157, 117, 14);
		contentPane.add(lblFechaPresupuesto);
		
		JLabel lblNroRemitoLcdm = new JLabel("Nro remito LCDM:");
		lblNroRemitoLcdm.setBounds(299, 195, 106, 14);
		contentPane.add(lblNroRemitoLcdm);
		
		JLabel lblFechaRemitoLcdm = new JLabel("Fecha remito LCDM:");
		lblFechaRemitoLcdm.setBounds(299, 234, 117, 14);
		contentPane.add(lblFechaRemitoLcdm);
		
		JLabel lblNroFacturaLcdm = new JLabel("Nro factura LCDM:");
		lblNroFacturaLcdm.setBounds(299, 274, 112, 14);
		contentPane.add(lblNroFacturaLcdm);
		
		JLabel lblFechaFacturaLcdm = new JLabel("Fecha factura LCDM:");
		lblFechaFacturaLcdm.setBounds(299, 315, 127, 14);
		contentPane.add(lblFechaFacturaLcdm);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(txtNro.getText().equals(""))){
					if(new MotorNegocio().existeMotor(txtNro.getText())==false){
						//MAPEO FECHAS
						int contadorFechasIncorrectas=0;
						Date fechaRemitoEntrada = null;
						String regex = "^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$";
						if(!(txtFecRemEntrada.getText().equals(""))){
							if(Pattern.matches(regex, txtFecRemEntrada.getText())){
								try {
									fechaRemitoEntrada = stringADate(txtFecRemEntrada.getText());
								} catch (ParseException e1) {
									//contadorFechasIncorrectas++;
									e1.printStackTrace();
								}
							}else{
								contadorFechasIncorrectas++;
							}
						}
						
						
						Date fechaPedidoPresupuesto = null;
						if(!(txtFecPedPresu.getText().equals(""))){
							if(Pattern.matches(regex, txtFecPedPresu.getText())){
								try {
									fechaPedidoPresupuesto = stringADate(txtFecPedPresu.getText());
								} catch (ParseException e1) {
									e1.printStackTrace();
								}
							}else{
								contadorFechasIncorrectas++;
							}
						}
						
						
						Date fechaOrdenCompra = null;
						if(!(txtFecOc.getText().equals(""))){
							if(Pattern.matches(regex, txtFecOc.getText())){
								try {
									fechaOrdenCompra = stringADate(txtFecOc.getText());
								} catch (ParseException e1) {						
									e1.printStackTrace();
								}
							}else{
								contadorFechasIncorrectas++;
							}
						}
						
						
						Date fechaPresupuesto = null;
						if(!(txtFecPresu.getText().equals(""))){
							if(Pattern.matches(regex, txtFecPresu.getText())){
								try {
									fechaPresupuesto = stringADate(txtFecPresu.getText());
								} catch (ParseException e1) {
									e1.printStackTrace();
								}
							}else{
								contadorFechasIncorrectas++;
							}
						}
						
						
						Date fechaRemitoLCDM = null;
						if(!(txtFechaRemLCDM.getText().equals(""))){
							if(Pattern.matches(regex, txtFechaRemLCDM.getText())){
								try {
									fechaRemitoLCDM = stringADate(txtFechaRemLCDM.getText());
								} catch (ParseException e1) {
									e1.printStackTrace();
								}
							}else{
								contadorFechasIncorrectas++;
							}
						}
						
						
						Date fechaFacturaLCDM = null;
						if(!(txtFecFactLCDM.getText().equals(""))){
							if(Pattern.matches(regex, txtFecFactLCDM.getText())){
								try {
									fechaFacturaLCDM = stringADate(txtFecFactLCDM.getText());
								} catch (ParseException e1) {
							
									e1.printStackTrace();
								}
							}else{
								contadorFechasIncorrectas++;
							}
						}
						// FIN MAPEO FECHAS
						
						// MAPEO RESTO DE DATOS
						String nroMotor;
						if(!(txtNro.getText().equals(""))){
							nroMotor=txtNro.getText();
						}else{
							nroMotor=null;
						}
						
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
						if(!(txtOc.getText().equals(""))){
							nroOc=Integer.parseInt(txtOc.getText());
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
						if(!(txtNroRemLCDM.getText().equals(""))){
							nroRemLcdm=Integer.parseInt(txtNroRemLCDM.getText());
						}else{
							nroRemLcdm=0;
						}
						
						int nroFactLcdm;
						if(!(txtNroFactLCDM.getText().equals(""))){
							nroFactLcdm=Integer.parseInt(txtNroFactLCDM.getText());
						}else{
							nroFactLcdm=0;
						}
						// FIN MAPEO RESTO DE DATOS
						if(contadorFechasIncorrectas>0){
							JOptionPane.showMessageDialog(null, "Error de formato de fecha");
						}else{
							Motor m=new Motor(nroMotor, empresa, potencia, 
									rpm, obs, nroRemEnt, fechaRemitoEntrada, nroPedPresu, fechaPedidoPresupuesto,
									nroOc, fechaOrdenCompra, nroPresu, fechaPresupuesto, nroRemLcdm, fechaRemitoLCDM,
									nroFactLcdm, fechaFacturaLCDM);

							MotorNegocio mn=new MotorNegocio();
							mn.agregar(m);
							JOptionPane.showMessageDialog(null, "Motor agregado");
							dispose();
						}
						
					}else{
						JOptionPane.showMessageDialog(null, "El motor ya existe");
					}	
				}else{
					JOptionPane.showMessageDialog(null, "Debe agregar un numero de motor");
				}
				
				
			}
		});
		btnAceptar.setBounds(244, 386, 89, 23);
		contentPane.add(btnAceptar);
		
		txtOc = new JTextField();
		txtOc.setBounds(426, 27, 86, 20);
		contentPane.add(txtOc);
		txtOc.setColumns(10);
		
		txtFecOc = new JTextField();
		txtFecOc.setBounds(426, 68, 86, 20);
		contentPane.add(txtFecOc);
		txtFecOc.setColumns(10);
		
		txtNroPresu = new JTextField();
		txtNroPresu.setBounds(426, 110, 86, 20);
		contentPane.add(txtNroPresu);
		txtNroPresu.setColumns(10);
		
		txtFecPresu = new JTextField();
		txtFecPresu.setBounds(426, 154, 86, 20);
		contentPane.add(txtFecPresu);
		txtFecPresu.setColumns(10);
		
		txtNroRemLCDM = new JTextField();
		txtNroRemLCDM.setBounds(426, 192, 86, 20);
		contentPane.add(txtNroRemLCDM);
		txtNroRemLCDM.setColumns(10);
		
		txtFechaRemLCDM = new JTextField();
		txtFechaRemLCDM.setBounds(426, 231, 86, 20);
		contentPane.add(txtFechaRemLCDM);
		txtFechaRemLCDM.setColumns(10);
		
		txtNroFactLCDM = new JTextField();
		txtNroFactLCDM.setBounds(426, 271, 86, 20);
		contentPane.add(txtNroFactLCDM);
		txtNroFactLCDM.setColumns(10);
		
		txtFecFactLCDM = new JTextField();
		txtFecFactLCDM.setBounds(426, 312, 86, 20);
		contentPane.add(txtFecFactLCDM);
		txtFecFactLCDM.setColumns(10);
		
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
