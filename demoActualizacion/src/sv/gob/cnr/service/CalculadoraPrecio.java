package sv.gob.cnr.service;

import javax.annotation.PostConstruct;

public class CalculadoraPrecio {
	
	@PostConstruct
	public void init(){
		System.out.println("Iniciando Calc");
	}

	public double calcularPrecio(int cantidad, double precioUnitario){
		return cantidad * precioUnitario;
	}
}
