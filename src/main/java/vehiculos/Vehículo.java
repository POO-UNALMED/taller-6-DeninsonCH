package vehiculos;

public class Veh�culo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;						/*nombre vehiculo*/
	private int precio;
	private int peso;							/*cuanto pesa*/
	private String tracci�n;
	
	private Fabricante fabricante;
	
	
	/*construtores*/
	public void veh�culo(){}
	public Veh�culo(String placa, int puerta, int vel, String nombre, int precio, int pp, String trac, Fabricante fb) {
		this.placa=placa;
		this.puertas=puerta;
		this.velocidadMaxima=vel;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=pp;
		this.tracci�n=trac;
		this.fabricante=fb;
	}
}
