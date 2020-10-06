package vehiculos;

import java.util.ArrayList;

public class Pais {
	public String nombre;
	static ArrayList <Pais> paises=new ArrayList <Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		int contador=0;
		int mayor=0;
		Pais pais = null;
		for (int i=0; i<paises.size();i++) {
			for (int j=0; j<paises.size();j++) {
				if(paises.get(i)==paises.get(j)) {
					contador++;
				}
			}
			if (contador>mayor) {
				mayor=contador;
				pais=paises.get(i);
			}
			contador=0;
		}
		return pais;
		
	}
	
}