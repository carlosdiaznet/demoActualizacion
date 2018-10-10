package sv.gob.cnr.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="productosBean")
@ViewScoped
public class ProductosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<String> productos = new ArrayList<String>();
	private String productoSeleccionado;

	public ProductosBean() {
		productos.add("Arroz");
		productos.add("Frijol");
		productos.add("Maiz");
		productos.add("Avena");
		productos.add("Granola");
		productos.add("Harina");
		productos.add("Cacao");
		productos.add("Huevos");
	}
	
	public void excluirProducto(){
		productos.remove(productoSeleccionado);
	}

	public List<String> getProductos() {
		return productos;
	}

	public String getProductoSeleccionado() {
		return productoSeleccionado;
	}

	public void setProductoSeleccionado(String productoSeleccionado) {
		this.productoSeleccionado = productoSeleccionado;
	}
	
	

}
