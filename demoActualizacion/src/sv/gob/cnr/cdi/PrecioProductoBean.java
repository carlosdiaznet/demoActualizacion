package sv.gob.cnr.cdi;


import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import sv.gob.cnr.service.CalculadoraPrecio;

@Named("precioMB")
@RequestScoped
public class PrecioProductoBean {
	

	private double precio;
	
	
	private CalculadoraPrecio calculadora;
	

	@PostConstruct
	public void init(){
		System.out.println("Instancia PrecioProductoBean");
	}

	public double getPrecio() {
		this.precio = calculadora.calcularPrecio(12, 44.55);
		return precio;
	}
	
	
	
	
	public PrecioProductoBean() {
	}
	
	@Inject
	public PrecioProductoBean(CalculadoraPrecio calculadora) {
		System.out.println("Constructor: " + calculadora);
		this.calculadora = calculadora;
	}

	public void setCalculadora(CalculadoraPrecio calculadora){
		System.out.println("setCalculadora: " + calculadora);
		this.calculadora = calculadora;
	}

	
}
