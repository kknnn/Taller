package Entidades;

import java.sql.Date;

public class Motor {
	private String nroMotor;
	private String empresa;
	private String potencia;
	private int rmp;
	private String observaciones;
	private int nroRemitoEntrada;
	private  Date fechaRemitoEntrada;
	private int nroPedidoPresupuesto;
	private Date fechaPedidoPresupuesto;
	private int nroOrdenCompra;
	private Date fechaOrdenCompra;
	private int nroPresupuesto;
	private Date fechaPresupuesto;
	private int nroRemitoLcdm;
	private Date fechaRemitoLcdm;
	private int nroFacturaLcdm;
	private Date fechaFacturaLcdm;
	
	public Motor(String nroMotor, String empresa, String potencia, int rmp, String observaciones, int nroRemitoEntrada,
			Date fechaRemitoEntrada, int nroPedidoPresupuesto, Date fechaPedidoPresupuesto, int nroOrdenCompra,
			Date fechaOrdenCompra, int nroPresupuesto, Date fechaPresupuesto, int nroRemitoLcdm, Date fechaRemitoLcdm,
			int nroFacturaLcdm, Date fechaFacturaLcdm) {
		super();
		this.nroMotor = nroMotor;
		this.empresa=empresa;
		this.potencia = potencia;
		this.rmp = rmp;
		this.observaciones = observaciones;
		this.nroRemitoEntrada = nroRemitoEntrada;
		this.fechaRemitoEntrada = fechaRemitoEntrada;
		this.nroPedidoPresupuesto = nroPedidoPresupuesto;
		this.fechaPedidoPresupuesto = fechaPedidoPresupuesto;
		this.nroOrdenCompra = nroOrdenCompra;
		this.fechaOrdenCompra = fechaOrdenCompra;
		this.nroPresupuesto = nroPresupuesto;
		this.fechaPresupuesto = fechaPresupuesto;
		this.nroRemitoLcdm = nroRemitoLcdm;
		this.fechaRemitoLcdm = fechaRemitoLcdm;
		this.nroFacturaLcdm = nroFacturaLcdm;
		this.fechaFacturaLcdm = fechaFacturaLcdm;
	}
	public String getNroMotor() {
		return nroMotor;
	}
	public void setNroMotor(String nroMotor) {
		this.nroMotor = nroMotor;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public int getRmp() {
		return rmp;
	}
	public void setRmp(int rmp) {
		this.rmp = rmp;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public int getNroRemitoEntrada() {
		return nroRemitoEntrada;
	}
	public void setNroRemitoEntrada(int nroRemitoEntrada) {
		this.nroRemitoEntrada = nroRemitoEntrada;
	}
	public Date getFechaRemitoEntrada() {
		return fechaRemitoEntrada;
	}
	public void setFechaRemitoEntrada(Date fechaRemitoEntrada) {
		this.fechaRemitoEntrada = fechaRemitoEntrada;
	}
	public int getNroPedidoPresupuesto() {
		return nroPedidoPresupuesto;
	}
	public void setNroPedidoPresupuesto(int nroPedidoPresupuesto) {
		this.nroPedidoPresupuesto = nroPedidoPresupuesto;
	}
	public Date getFechaPedidoPresupuesto() {
		return fechaPedidoPresupuesto;
	}
	public void setFechaPedidoPresupuesto(Date fechaPedidoPresupuesto) {
		this.fechaPedidoPresupuesto = fechaPedidoPresupuesto;
	}
	public int getNroOrdenCompra() {
		return nroOrdenCompra;
	}
	public void setNroOrdenCompra(int nroOrdenCompra) {
		this.nroOrdenCompra = nroOrdenCompra;
	}
	public Date getFechaOrdenCompra() {
		return fechaOrdenCompra;
	}
	public void setFechaOrdenCompra(Date fechaOrdenCompra) {
		this.fechaOrdenCompra = fechaOrdenCompra;
	}
	public int getNroPresupuesto() {
		return nroPresupuesto;
	}
	public void setNroPresupuesto(int nroPresupuesto) {
		this.nroPresupuesto = nroPresupuesto;
	}
	public Date getFechaPresupuesto() {
		return fechaPresupuesto;
	}
	public void setFechaPresupuesto(Date fechaPresupuesto) {
		this.fechaPresupuesto = fechaPresupuesto;
	}
	public int getNroRemitoLcdm() {
		return nroRemitoLcdm;
	}
	public void setNroRemitoLcdm(int nroRemitoLcdm) {
		this.nroRemitoLcdm = nroRemitoLcdm;
	}
	public Date getFechaRemitoLcdm() {
		return fechaRemitoLcdm;
	}
	public void setFechaRemitoLcdm(Date fechaRemitoLcdm) {
		this.fechaRemitoLcdm = fechaRemitoLcdm;
	}
	public int getNroFacturaLcdm() {
		return nroFacturaLcdm;
	}
	public void setNroFacturaLcdm(int nroFacturaLcdm) {
		this.nroFacturaLcdm = nroFacturaLcdm;
	}
	public Date getFechaFacturaLcdm() {
		return fechaFacturaLcdm;
	}
	public void setFechaFacturaLcdm(Date fechaFacturaLcdm) {
		this.fechaFacturaLcdm = fechaFacturaLcdm;
	}
}
