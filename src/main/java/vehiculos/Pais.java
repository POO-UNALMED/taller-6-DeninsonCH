package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int ventas;
	static private ArrayList<Pais>paises=new ArrayList();
	static private ArrayList<Pais>pvendedor=new ArrayList();
	
	public Pais(String nombre) {
		this.nombre=nombre;
		Pais a= new Pais(nombre);
		
		if(isPais(nombre)) {
			for (int i = 0; i < paises.size(); i++) {
				if(paises.get(i).getNombre().equals(nombre)){
					paises.get(i).setVentas();
				}
			}
		}else {
			paises.add(a);
		}
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String paisMasVendedor() {
		Pais max=null;
		for (int i = 0; i < pvendedor.size(); i++) {
			if (paises.get(i).ventas > max.ventas) {
                max = paises.get(i);
            }
		}
		return max.getNombre();
		
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas() {
		this.ventas=ventas++;
	}
	public boolean isPais(String p) {
		boolean a=false;
		for (int i = 0; i < paises.size(); i++) {
			if(paises.get(i).getNombre().equals(nombre)){
				a= true;
				break;
			}else {
				a= false;
			}
		}
		return a;
	}
	

}
