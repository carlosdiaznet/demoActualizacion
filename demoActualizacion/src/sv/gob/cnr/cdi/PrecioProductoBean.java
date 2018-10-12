package sv.gob.cnr.cdi;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import sv.gob.cnr.service.CalculadoraPrecio;

@Named("precioMB")
@SessionScoped
public class PrecioProductoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private double precio;
	
	@EJB
	private CalculadoraPrecio calculadora;
	

	@PostConstruct
	public void init(){
		System.out.println("Iniciando init");
		this.calculadora = new CalculadoraPrecio();
	}

	public double getPrecio() {
		this.precio = calculadora.calcularPrecio(12, 23.25);
		return precio;
	}

	
}
