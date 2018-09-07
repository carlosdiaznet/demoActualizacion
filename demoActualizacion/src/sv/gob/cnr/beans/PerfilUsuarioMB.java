package sv.gob.cnr.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="perfilUsuarioMB")
@ViewScoped
public class PerfilUsuarioMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final List<Intereses> INTERESES = new ArrayList<Intereses>();
	
	static {
		INTERESES.add(new Intereses("Deportes", "005-pagina"));
		INTERESES.add(new Intereses("Computacion", "001-controlar"));
		INTERESES.add(new Intereses("Entretenimiento", "002-campana"));
		INTERESES.add(new Intereses("Investigacion", "004-investigacion"));
	}
	
	private String login;
	private String password;
	private String nombre;
	private String asunto;
	private Date fechaNacimiento;
	private String profesion;
	private Intereses interes;
	
	public void actualizar(){
		System.out.println("Password: " + this.password);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar2(){
		System.out.println("Asunto: " + this.asunto);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar3(){
		System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar4(){
		System.out.println("Profesion: " + this.profesion);
		System.out.println("Intereses: " + this.interes.getDescripcion());
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public void actualizar5(){
		System.out.println("Profesion: " + this.profesion);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil actualizado!"));
	}
	
	public List<Intereses> getIntereses(){
		return INTERESES;
	}
	
	public Date getFechaHora(){
		return new Date();
	}
	
	public List<String> completarTexto(String consulta){
		List<String> resultados = new ArrayList<String>();
		
		if(consulta.startsWith("Jua")){
			resultados.add("Juan");
			resultados.add("Juan Carlos");
			resultados.add("Juan Carlos Diaz");
			resultados.add("carlosdiaznet");
		}
		
		return resultados;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Intereses getInteres() {
		return interes;
	}

	public void setInteres(Intereses interes) {
		this.interes = interes;
	}
	
	

}
