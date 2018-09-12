package sv.gob.cnr.pojo;

import java.io.Serializable;

public class Pais implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer codigo;
	private String nombre;
	
	public Pais() {
		
	}
	
	public Pais(Integer codigo, String nombre) {

		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
