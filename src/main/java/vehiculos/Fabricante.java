package vehiculos;

public class Fabricante {
	private String nombre;
	private Pa�s pais;
	
	
	public Fabricante(String nombre, Pa�s pais) {
		this.nombre = nombre;
		this.pais = pais;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Pa�s getPais() {
		return pais;
	}


	public void setPais(Pa�s pais) {
		this.pais = pais;
	}
	
}
