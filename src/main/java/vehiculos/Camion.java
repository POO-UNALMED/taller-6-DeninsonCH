package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	public static int Tcamion=0;
	
	public Camion(String placa, String nombre, int precio, int pp) {
		super(placa, 2, 80, nombre, precio, pp, "4X2",fabricante());
		this.ejes = ejes;
		Tcamion++;
	}
	
	private static Fabricante fabricante() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEjes(int eje){
		this.ejes=eje;
	}
	public int getEjes() {
		return ejes;
	}
	public int setEjes(){
		return ejes;
	}
	public int setCamiones() {
		return Tcamion;
	}
	
	
	
}
