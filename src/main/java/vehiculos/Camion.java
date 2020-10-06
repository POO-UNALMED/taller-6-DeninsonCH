package vehiculos;

public class Camion extends Vehículo{
	
	private int ejes;
	private final int puertas = 2;
	private final int velocidadMaxima = 80;
	private final String tracción = "4X2";
	private int TipoCamion=0;
	
	public Camion(String placa, String nombre, int precio, int pp, Fabricante fb) {
		super(placa, 2, 80, nombre, precio, pp, "4X2", fb);
		// TODO Auto-generated constructor stub
	}
	public void setEjes(int eje){
		this.ejes=eje;
	}
	public int setEjes(){
		return ejes;
	}
	public int setCamiones() {
		return TipoCamion;
	}
	
	
}
