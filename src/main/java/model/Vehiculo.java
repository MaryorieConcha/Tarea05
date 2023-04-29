package model;

public class Vehiculo {
	private String nombre;
	private int year, precio, kmRecorridos;
	private Color color;
	private Marca marca;
	private Automotora vehiculos;

	public Vehiculo(String nombre, int year, int precio, int kmRecorridos, Color color, Marca marca) {
		this.nombre = nombre;
		this.year = year;
		this.precio = precio;
		this.kmRecorridos = kmRecorridos;
		this.color = color;
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
}