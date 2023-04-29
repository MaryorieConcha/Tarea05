package model;

public class Cliente {
	private String nombre, direccion, numeroTelefonico, mail, rut;
	private Automotora clientes;

	public Cliente(String nombre, String direccion, String numeroTelefonico, String mail, String rut) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroTelefonico = numeroTelefonico;
		this.mail = mail;
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public String getMail() {
		return mail;
	}

	public String getRut() {
		return rut;
	}
}