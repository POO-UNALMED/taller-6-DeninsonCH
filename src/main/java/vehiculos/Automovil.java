package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	private final int puertas= 4;
	private final int velocidadMaxima = 120;
	private final String traccion = "FWD";
	private int Tautomovil=0;
	
	
	public Automovil(String placa, int puerta, int vel, String nombre, int precio, int pp, String trac, Fabricante fb) {
		super(placa, puerta, vel, nombre, precio, pp, trac, fb);
		// TODO Auto-generated constructor stub
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
