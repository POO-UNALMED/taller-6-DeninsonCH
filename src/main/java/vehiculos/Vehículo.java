package vehiculos;

public class Vehículo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;						/*nombre vehiculo*/
	private int precio;
	private int peso;							/*cuanto pesa*/
	private String tracción;
	
	private Fabricante fabricante;
	
	
	/*construtores*/
	public void vehículo(){}
	public Vehículo(String placa, int puerta, int vel, String nombre, int precio, int pp, String trac, Fabricante fb) {
		this.placa=placa;
		this.puertas=puerta;
		this.velocidadMaxima=vel;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=pp;
		this.tracción=trac;
		this.fabricante=fb;
	}
}
