package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	public String nombre;
	public Pais pais;
	static ArrayList <Fabricante> fabricantes=new ArrayList <Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int contador=0;
		int mayor=0;
		Fabricante fabricante=null;
		for (int i=0; i<fabricantes.size();i++) {
			for (int j=0; j<fabricantes.size();j++) {
				if(fabricantes.get(i)==fabricantes.get(j)) {
					contador++;
				}
			}
			if (contador>mayor) {
				mayor=contador;
				fabricante=fabricantes.get(i);
			}
			contador=0;
		}
		return fabricante;
		
	}
}
