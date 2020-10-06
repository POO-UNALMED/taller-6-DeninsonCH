package vehiculos;

public class Vehiculo {
	private int Cvehiculo = 0;
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;						/*nombre vehiculo*/
	private int precio;
	private int peso;							/*cuanto pesa*/
	private String tracción;
	
	private Fabricante fabricante;
	
	
	/*construtores*/
	public void vehículo(){this.Cvehiculo=Cvehiculo;}
	public Vehiculo(String placa, int puerta, int vel, String nombre, int precio, int pp, String trac, Fabricante fb) {
		this.placa=placa;
		this.puertas=puerta;
		this.velocidadMaxima=vel;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=pp;
		this.tracción=trac;
		this.fabricante=fb;
		Cvehiculo++;
	}
	public String getPlaca() {
		return placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public int getPeso() {
		return peso;
	}
	public String getTracción() {
		return tracción;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void setTracción(String tracción) {
		this.tracción = tracción;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public int getCantidadVehiculos() {
		return Cvehiculo;
	}
	
	public String vehiculosPorTipo() {
		Automovil a= null;
		Camion b= null;
		Camioneta c = null;
		return("Automoviles:"+ a.setAutomoviles()+
				"\nCamionetas:"+b.setCamiones()+
				"\nCamiones:"+ c.setCamionetas());
	}
	
	
}
