package sv.gob.cnr.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named("precioMB")
public class PrecioProductoBean {
	
	@Inject
	private CalculadoraPrecio calculadora;
	
	public double getPrecio(){
		return calculadora.calcularPrecio(12, 45.25);
	}
}
