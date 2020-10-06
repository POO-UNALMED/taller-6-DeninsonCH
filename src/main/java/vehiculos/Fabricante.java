package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int ventas;
	static private ArrayList<Fabricante>fabrican=new ArrayList();
	
	
	public Fabricante(String nom, Pais pais) {
		this.nombre = nom;
		this.pais = pais;
		
		Fabricante f = new Fabricante(nom,pais);
		
		if(isfabri(nom)) {
			for (int i = 0; i < fabrican.size(); i++) {
				if(fabrican.get(i).getNombre().equals(nom)){
					fabrican.get(i).setVentas();
					break;
				}
			}
		}else {
			f.setVentas();
			fabrican.add(f);
			
		}
		
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
	
	public void setVentas() {
		this.ventas=ventas++;
	}
	
	public boolean isfabri(String fa) {
		boolean a=false;
		for (int i = 0; i < fabrican.size(); i++) {
			if(fabrican.get(i).getNombre().equals(fa)){
				a= true;
				break;
			}else {
				a= false;
			}
		}
		return a;
	}
	public static String fabricaMayorVentas() {
		Fabricante max=null;
		for (int i = 0; i < fabrican.size(); i++) {
			if (fabrican.get(i).ventas > max.ventas) {
                max = fabrican.get(i);
            }
		}
		return max.getNombre();
		
	}
	
}
