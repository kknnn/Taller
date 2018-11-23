package Negocio;

import java.util.ArrayList;

import Datos.MotorData;
import Entidades.Motor;

public class MotorNegocio {
	public ArrayList<Motor> getAll(){
		return new MotorData().getAll();
	}
	
	public Motor buscarPorNumero(String nro){
		return new MotorData().buscarPorNumero(nro);
	}
	
	public ArrayList<Motor> buscarPorEmpresa(String empresa){
		return new MotorData().buscarPorEmpresa(empresa);
	}
	
	public void agregar(Motor m){
		new MotorData().agregar(m);
	}
	
	public boolean existeMotor(String nro){
		return new MotorData().existeMotor(nro);
	}
	
	public void editar(Motor m){
		new MotorData().editar(m);
	}
}
