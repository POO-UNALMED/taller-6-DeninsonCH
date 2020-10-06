package vehiculos;

public class Camion extends Vehículo{
	
	private int ejes;
	private final int puertas = 2;
	private final int velocidadMaxima = 80;
	private final String tracción = "4X2";
	
	
	public Camion(String placa, int puerta, int vel, String nombre, int precio, int pp, String trac, Fabricante fb) {
		super(placa, 2, 80, nombre, precio, pp, "4X2", fb);
		// TODO Auto-generated constructor stub
	}
	
	public Camion(String plac, String nom ) {					/*definiendo constructor */
		super(plac, 2, 80, "ss", precio, pp, "4X2", fb);
	}
	
	
	
	public void setEjes(int eje){
		this.ejes=eje;
	}
	public int setEjes(){
		return ejes;
	}
	
	
	
}
