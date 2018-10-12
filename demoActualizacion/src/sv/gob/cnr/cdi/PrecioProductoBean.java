package sv.gob.cnr.cdi;


import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import sv.gob.cnr.service.CalculadoraPrecio;

@Named("precioMB")
public class PrecioProductoBean {
	
	private double precio;
	
	@Inject
	private CalculadoraPrecio calculadora;
	

	@PostConstruct
	public void init(){
		System.out.println("Iniciando init");
	}

	public double getPrecio() {
		this.precio = calculadora.calcularPrecio(12, 23.25);
		return precio;
	}

	
}
