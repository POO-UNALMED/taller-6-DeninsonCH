package vehiculos;

public class Autom�vil extends Veh�culo {
	
	private int puestos;
	private final int puertas= 4;
	private final int velocidadMaxima = 120;
	private final String tracci�n = "FWD";
	
	
	public Autom�vil(String placa, int puerta, int vel, String nombre, int precio, int pp, String trac, Fabricante fb) {
		super(placa, puerta, vel, nombre, precio, pp, trac, fb);
		// TODO Auto-generated constructor stub
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
	public String getTracci�n() {
		return tracci�n;
	}




	

	

}
