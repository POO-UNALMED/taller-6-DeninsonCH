package vehiculos;

public class Camioneta extends Vehiculo{
	
	private boolean volco;
	private final int velocidadMaxima = 90;
	private final String traccion = "4X4";
	public static int Tcamioneta=0;
	
	
	public Camioneta(String placa, int puerta, int vel, String nombre, int precio, int pp, String trac, Fabricante fb) {
		super(placa, puerta, vel, nombre, precio, pp, trac, fb);
		Tcamioneta++;
		
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public String getTraccion() {
		return traccion;
	}
	public int setCamionetas() {
		return Tcamioneta;
	}
	

}
