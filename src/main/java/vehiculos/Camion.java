package vehiculos;

public class Camion extends Vehículo{
	
	private int ejes;
	private final int puertas = 2;
	private final int velocidadMaxima = 80;
	private final String tracción = "4X2";
	
	
	public Camion(String placa, int puerta, int vel, String nombre, int precio, int pp, String trac, Fabricante fb) {
		super(placa, puerta, vel, nombre, precio, pp, trac, fb);
		// TODO Auto-generated constructor stub
	}
}
