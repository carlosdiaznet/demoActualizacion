package sv.gob.cnr.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class RegistroUsuarioMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String login;
	private String nombre;
	
	public void verificarDisponibilidadLogin(){
		FacesMessage msg = null;
		
		//Simulacion de procesamiento
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		if("jcdiaz".equalsIgnoreCase(this.login)){
			msg = new FacesMessage("Login esta en uso");
			msg.setSeverity(FacesMessage.SEVERITY_WARN);
		} else {
			msg = new FacesMessage("Login disponible");
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void registrar(){
		System.out.println("Login: " + this.login);
		System.out.println("Nombre: " + this.nombre);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registro Efectuado"));
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
