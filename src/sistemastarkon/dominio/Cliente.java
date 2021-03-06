package sistemastarkon.dominio;

import sistemastarkon.logica.ListaCircularDobleEnlace;

public class Cliente {
	private String rut;
	private String nombre;
	private String apellido;
	private int saldo;
	private String ciudad;
	private Oficina oficina;
	private ListaCircularDobleEnlace<Entrega> envios;
	private ListaCircularDobleEnlace<Entrega> recibos;
	
	public Cliente(String rut, String nombre, String apellido, int saldo,
			String ciudad) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
		this.ciudad = ciudad;
		envios = new ListaCircularDobleEnlace<Entrega>();
		recibos = new ListaCircularDobleEnlace<Entrega>();
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina sucursal) {
		this.oficina = sucursal;
	}

	public ListaCircularDobleEnlace<Entrega> getEnvios() {
		return envios;
	}

	public void setEnvios(ListaCircularDobleEnlace<Entrega> envios) {
		this.envios = envios;
	}

	public ListaCircularDobleEnlace<Entrega> getRecibos() {
		return recibos;
	}

	public void setRecibos(ListaCircularDobleEnlace<Entrega> recibos) {
		this.recibos = recibos;
	}
}
