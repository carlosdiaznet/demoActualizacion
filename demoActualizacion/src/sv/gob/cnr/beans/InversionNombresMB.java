package sv.gob.cnr.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="nombresInvertidosMB")
@ViewScoped
public class InversionNombresMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String nombreInvertido;
	private int cantidadPalabras;
	
	
	public InversionNombresMB() {
		
	}

	public void invertir(){
		this.nombreInvertido = "";
		this.cantidadPalabras = 0;
		
		if(this.nombre != null && !this.nombre.isEmpty()){
			this.cantidadPalabras = 1;
		}
		
		for(int i = this.nombre.length() -1; i>=0; i--){
			char letra = this.nombre.charAt(i);
			this.nombreInvertido += letra;
			
			if(letra == ' '){
				this.cantidadPalabras++;
			}
		}
		
		System.out.println("Nombre invertido: " + this.nombreInvertido);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreInvertido() {
		return nombreInvertido;
	}


	public int getCantidadPalabras() {
		return cantidadPalabras;
	}

	

}
