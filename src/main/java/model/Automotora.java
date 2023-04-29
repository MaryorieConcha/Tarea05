package model;

import java.util.ArrayList;
import java.util.List;

import model.Vehiculo;
import model.Cliente;
import utils.ValidadorRut;

public class Automotora {
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarClientes(String rut){
		Cliente cliente = null;
		for (Cliente cliente1 : this.clientes) {
			if (cliente1.getRut().equals(rut)) {
				cliente = cliente1;
				break;
			}
		}
		return cliente;
	}

	public boolean agregarClientes(String nombre, String direccion, String numeroTelefonico, String mail,String rut) {
		if (ValidadorRut.validarDigito(rut) && this.buscarClientes(rut)==null){
			Cliente cliente = new Cliente(nombre,direccion,numeroTelefonico,mail,rut);
			this.clientes.add(cliente);
			return true;
		}
		return false;
	}

	public Vehiculo agregarVehiculos(String nombre, int year, int precio,
									 int kmRecorridos, Color color, Marca marca) {
		Vehiculo vehiculo = new Vehiculo(nombre,year,precio,kmRecorridos,color,marca);
		this.vehiculos.add(vehiculo);
		return vehiculo;
	}

	public List<Vehiculo> buscarVehiculoPorMarca(Marca marca) {
		List<Vehiculo> listaVehiculos = new ArrayList<>();
		for (Vehiculo vehiculo : this.vehiculos){
			if (vehiculo.getMarca().equals(marca)){
				listaVehiculos.add(vehiculo);
			}
		}
		return listaVehiculos;
	}
}