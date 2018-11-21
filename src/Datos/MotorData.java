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
}
