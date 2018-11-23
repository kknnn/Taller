package Datos;

import java.sql.SQLException;
import java.util.ArrayList;

import Entidades.Motor;

public class MotorData extends Conector{
	public ArrayList<Motor> getAll(){
		ArrayList<Motor> motores = new ArrayList<Motor>();
		try {
			super.abrirConexion();
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from motores");
			while(rs.next()){
				Motor m=new Motor(rs.getString("nroMotor"), rs.getString("empresa"), rs.getString("potencia"), 
						rs.getInt("rpm"), rs.getString("observaciones"),
						rs.getInt("nroRemitoEntrada"), rs.getDate("fechaRemitoEntrada"), rs.getInt("nroPedidoPresupuesto"),
						rs.getDate("fechaPedidoPresupuesto"), rs.getInt("nroOrdenCompra"), rs.getDate("fechaOrdenCompra"),
						rs.getInt("nroPresupuesto"), rs.getDate("fechaPresupuesto"), rs.getInt("nroRemitoLcdm"),
						rs.getDate("fechaRemitoLcdm"), rs.getInt("nroFacturaLcdm"), rs.getDate("fechaFacturaLcdm"));
				motores.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			super.cerrarConexion();
		}
		return motores;
	}
	
	public Motor buscarPorNumero(String nro){
		Motor m = null;
		try {
			super.abrirConexion();
			pstmt=conn.prepareStatement("select * from motores where nroMotor=?");
			pstmt.setString(1, nro);
			rs=pstmt.executeQuery();
			if(rs.next()){
				m=new Motor(rs.getString("nroMotor"), rs.getString("empresa"), rs.getString("potencia"), 
						rs.getInt("rpm"), rs.getString("observaciones"),
						rs.getInt("nroRemitoEntrada"), rs.getDate("fechaRemitoEntrada"), rs.getInt("nroPedidoPresupuesto"),
						rs.getDate("fechaPedidoPresupuesto"), rs.getInt("nroOrdenCompra"), rs.getDate("fechaOrdenCompra"),
						rs.getInt("nroPresupuesto"), rs.getDate("fechaPresupuesto"), rs.getInt("nroRemitoLcdm"),
						rs.getDate("fechaRemitoLcdm"), rs.getInt("nroFacturaLcdm"), rs.getDate("fechaFacturaLcdm"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			super.cerrarConexion();
		}
		return m;
		
	}
	
	public ArrayList<Motor> buscarPorEmpresa(String empresa){
		ArrayList<Motor> motores = new ArrayList<Motor>();
		try {
			super.abrirConexion();
			pstmt=conn.prepareStatement("select * from motores where empresa=?");
			pstmt.setString(1, empresa);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Motor m=new Motor(rs.getString("nroMotor"), rs.getString("empresa"), rs.getString("potencia"), 
						rs.getInt("rpm"), rs.getString("observaciones"),
						rs.getInt("nroRemitoEntrada"), rs.getDate("fechaRemitoEntrada"), rs.getInt("nroPedidoPresupuesto"),
						rs.getDate("fechaPedidoPresupuesto"), rs.getInt("nroOrdenCompra"), rs.getDate("fechaOrdenCompra"),
						rs.getInt("nroPresupuesto"), rs.getDate("fechaPresupuesto"), rs.getInt("nroRemitoLcdm"),
						rs.getDate("fechaRemitoLcdm"), rs.getInt("nroFacturaLcdm"), rs.getDate("fechaFacturaLcdm"));
				motores.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			super.cerrarConexion();
		}
		return motores;
	}
	
	public void agregar(Motor m){
		try {
			super.abrirConexion();
			pstmt=conn.prepareStatement("insert into motores (nroMotor, empresa, potencia, rpm, observaciones, nroRemitoEntrada, fechaRemitoEntrada, nroPedidoPresupuesto, fechaPedidoPresupuesto, nroOrdenCompra, fechaOrdenCompra, nroPresupuesto, fechaPresupuesto, nroRemitoLcdm, fechaRemitoLcdm, nroFacturaLcdm, fechaFacturaLcdm) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, m.getNroMotor());
			pstmt.setString(2, m.getEmpresa());
			pstmt.setString(3, m.getPotencia());
			pstmt.setInt(4, m.getRmp());
			pstmt.setString(5, m.getObservaciones());
			pstmt.setInt(6, m.getNroRemitoEntrada());
			pstmt.setDate(7, m.getFechaRemitoEntrada());
			pstmt.setInt(8, m.getNroPedidoPresupuesto());
			pstmt.setDate(9, m.getFechaPedidoPresupuesto());
			pstmt.setInt(10, m.getNroOrdenCompra());
			pstmt.setDate(11, m.getFechaOrdenCompra());
			pstmt.setInt(12, m.getNroPresupuesto());
			pstmt.setDate(13, m.getFechaPresupuesto());
			pstmt.setInt(14, m.getNroRemitoLcdm());
			pstmt.setDate(15, m.getFechaRemitoLcdm());
			pstmt.setInt(16, m.getNroFacturaLcdm());
			pstmt.setDate(17, m.getFechaFacturaLcdm());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
		finally{
			super.cerrarConexion();
		}
	}
	
	public boolean existeMotor(String nro){
		Boolean existe = false;
		try {
			super.abrirConexion();
			pstmt = conn.prepareStatement("SELECT * FROM motores WHERE nroMotor = ?");
			pstmt.setString(1, nro);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				existe = true;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			super.cerrarConexion();
		}
		return existe;
	}
	
	public void editar(Motor m){
		try {
			super.abrirConexion();
			pstmt=conn.prepareStatement("update motores set empresa=?, potencia=?, rpm=?, observaciones=?, nroRemitoEntrada=?, fechaRemitoEntrada=?, nroPedidoPresupuesto=?, fechaPedidoPresupuesto=?, nroOrdenCompra=?, fechaOrdenCompra=?, nroPresupuesto=?, fechaPresupuesto=?, nroRemitoLcdm=?, fechaRemitoLcdm=?, nroFacturaLcdm=?, fechaFacturaLcdm=? where nroMotor=?");
			pstmt.setString(1, m.getEmpresa());
			pstmt.setString(2, m.getPotencia());
			pstmt.setInt(3, m.getRmp());
			pstmt.setString(4, m.getObservaciones());
			pstmt.setInt(5, m.getNroRemitoEntrada());
			pstmt.setDate(6, m.getFechaRemitoEntrada());
			pstmt.setInt(7, m.getNroPedidoPresupuesto());
			pstmt.setDate(8, m.getFechaPedidoPresupuesto());
			pstmt.setInt(9, m.getNroOrdenCompra());
			pstmt.setDate(10, m.getFechaOrdenCompra());
			pstmt.setInt(11, m.getNroPresupuesto());
			pstmt.setDate(12, m.getFechaPresupuesto());
			pstmt.setInt(13, m.getNroRemitoLcdm());
			pstmt.setDate(14, m.getFechaRemitoLcdm());
			pstmt.setInt(15, m.getNroFacturaLcdm());
			pstmt.setDate(16, m.getFechaFacturaLcdm());
			pstmt.setString(17, m.getNroMotor());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			super.cerrarConexion();
		}
	}
}
