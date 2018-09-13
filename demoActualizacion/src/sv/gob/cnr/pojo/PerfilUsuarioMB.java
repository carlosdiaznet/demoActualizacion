package sv.gob.cnr.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="perfilUsuarioMB2")
@ViewScoped
public class PerfilUsuarioMB implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final List<Pais> PAISES = new ArrayList<Pais>();
	
	static {
		PAISES.add(new Pais(1, "El Salvador"));
		PAISES.add(new Pais(2, "Honduras"));
		PAISES.add(new Pais(3, "Guatemala"));
		PAISES.add(new Pais(4, "Nicaragua"));
		PAISES.add(new Pais(5, "Costa Rica"));
		PAISES.add(new Pais(6, "Panama"));
	}
	
	private String nombre;
	private Pais pais;
	
	public void actualizar(){
		if(this.pais == null){
			adicionalMensaje("Perfil actualizado sin pais");
		} else {
			adicionalMensaje("Perfil actualizado con pais: " + this.pais.getNombre() + " (" + this.pais.getCodigo() + ").");
		}
	}
	
	private void adicionalMensaje(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
	}
	
	public List<Pais> sugerirPaises(String consulta){
		List<Pais> paisesSugeridos = new ArrayList<Pais>();
		for(Pais pais : PAISES){
			if(pais.getNombre().toLowerCase().startsWith(consulta.toLowerCase())){
				paisesSugeridos.add(pais);
			}
		}
		return paisesSugeridos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
}
