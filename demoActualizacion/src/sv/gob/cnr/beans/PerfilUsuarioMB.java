package sv.gob.cnr.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="perfilUsuarioMB")
@ViewScoped
public class PerfilUsuarioMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String login;
	private String password;
	private String nombre;
	private String asunto;
	
	public void actualizar(){
		System.out.println("Password: " + this.password);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar2(){
		System.out.println("Asunto: " + this.asunto);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	
	

}
