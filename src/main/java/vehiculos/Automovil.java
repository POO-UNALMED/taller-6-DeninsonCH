package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private final String traccion = "FWD";
	private int Tautomovil=0;
	
	
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante fabricante,int puestos) {
		this.puestos = puestos;
	    puertas = 4;
	    velocidadMaxima = 100;
	    traccion = "FWD";
	    this.peso = peso;
	    this.placa = placa;
	    this.nombre = nombre;
	    this.precio = precio;
	    this.fabricante = fabricante;
		Tautomovil++;
	}
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public int getPuertas() {
		return puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public String getTraccion() {
		return traccion;
	}
	public int setAutomoviles() {
		return Tautomovil;
	}



	

	

}
