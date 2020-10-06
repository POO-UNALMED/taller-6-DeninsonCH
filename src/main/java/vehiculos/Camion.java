package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	private final int puertas = 2;
	private final int velocidadMaxima = 80;
	private final String tracción = "4X2";
	private int Tcamion=0;
	
	public Camion(String placa, String nombre, int precio, int pp, Fabricante fb) {
		super(placa, 2, 80, nombre, precio, pp, "4X2", fb);
		
		Tcamion++;
	}
	public void setEjes(int eje){
		this.ejes=eje;
	}
	public int setEjes(){
		return ejes;
	}
	public int setCamiones() {
		return Tcamion;
	}
	
	
}
