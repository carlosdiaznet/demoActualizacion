package sv.gob.cnr.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="clientesMB")
@ViewScoped
public class ClientesMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<String> clientes = new ArrayList<String>();
	private String nombreCliente;
	
	public void incluirCliente(){
		this.clientes.add(nombreCliente);
		this.nombreCliente = null;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public List<String> getClientes() {
		return clientes;
	}
	
	

}
