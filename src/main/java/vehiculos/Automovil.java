package vehiculos;

public class Automovil extends Vehiculo {
	public int puestos;
	public static int cAutos=0;

	

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cAutos++;
	}
	public int setAutomoviles() {
		return cAutos;
	}
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	

}