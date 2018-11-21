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
}
