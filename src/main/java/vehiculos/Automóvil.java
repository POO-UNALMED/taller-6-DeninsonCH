package vehiculos;

public class Automóvil extends Vehículo {
	
	private int puestos;
	private final int puertas= 4;
	private final int velocidadMaxima = 120;
	private final String tracción = "FWD";
	
	
	public Automóvil(String placa, int puerta, int vel, String nombre, int precio, int pp, String trac, Fabricante fb) {
		super(placa, puerta, vel, nombre, precio, pp, trac, fb);
		// TODO Auto-generated constructor stub
	}

	

}
