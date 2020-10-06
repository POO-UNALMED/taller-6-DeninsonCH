package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int ventas;
	static private ArrayList<Pais>paises=new ArrayList();
	
	public Pais(String nombre) {
		this.nombre=nombre;
		Pais a= new Pais(nombre);
		
		if(isPais(nombre)) {
			for (int i = 0; i < paises.size(); i++) {
				if(paises.get(i).getNombre().equals(nombre)){
					paises.get(i).setVentas();
					break;
				}
			}
		}else {
			a.setVentas();
			paises.add(a);
		}
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static String paisMasVendedor() {
		Pais max=null;
		for (int i = 0; i < paises.size(); i++) {
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
			if(paises.get(i).getNombre().equals(p)){
				a= true;
				break;
			}else {
				a= false;
			}
		}
		return a;
	}
	

}
