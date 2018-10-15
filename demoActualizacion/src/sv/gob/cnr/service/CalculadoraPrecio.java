package sv.gob.cnr.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

@Dependent
public class CalculadoraPrecio {
	
	@PostConstruct
	public void init(){
		System.out.println("Instancia CalculadoraPrecio");
	}

	public double calcularPrecio(int cantidad, double precioUnitario){
		return cantidad * precioUnitario;
	}
}
