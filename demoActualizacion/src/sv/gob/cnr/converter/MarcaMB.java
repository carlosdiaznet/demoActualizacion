package sv.gob.cnr.converter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="marcaMB")
@SessionScoped
public class MarcaMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Marca marcaSeleccionada;
	private List<Marca> marcas;
	
	public MarcaMB() {
		marcas = new ArrayList<Marca>();
		marcas.add(new Marca(1, "Dell", 10, 25.23));
		marcas.add(new Marca(2, "HP", 15, 35.12));
		marcas.add(new Marca(3, "Toshiba", 9, 24.17));
		marcas.add(new Marca(4, "Lenovo", 20, 15.48));
	}
	
	public Marca getMarca(Integer id){
		if(id == null){
			throw new IllegalArgumentException("Id no ingresado");
		}
		for(Marca marca : marcas){
			if(id.equals(marca.getId())){
				return marca;
			}
		}
		return null;
	}

	public Marca getMarcaSeleccionada() {
		return marcaSeleccionada;
	}

	public void setMarcaSeleccionada(Marca marcaSeleccionada) {
		this.marcaSeleccionada = marcaSeleccionada;
	}

	public List<Marca> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<Marca> marcas) {
		this.marcas = marcas;
	}
	
	
	
	

}
