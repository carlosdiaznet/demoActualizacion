package sv.gob.cnr.beans;

import java.io.Serializable;

public class Intereses implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String descripcion;
	private String nombreIcono;
	
	public Intereses() {
		
	}

	public Intereses(String descripcion, String nombreIcono) {
		super();
		this.descripcion = descripcion;
		this.nombreIcono = nombreIcono;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreIcono() {
		return nombreIcono;
	}

	public void setNombreIcono(String nombreIcono) {
		this.nombreIcono = nombreIcono;
	}
	
	

}
