package sv.gob.cnr.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long matricula;
	private String nombre;
	private Date fechaIngreso;
	private BigDecimal salario;
	
	public Funcionario(Long matricula, String nombre, Date fechaIngreso, BigDecimal salario) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	

}
